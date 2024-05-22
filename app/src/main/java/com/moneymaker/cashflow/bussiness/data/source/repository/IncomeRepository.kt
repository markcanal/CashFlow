package com.moneymaker.cashflow.bussiness.data.source.repository

import com.moneymaker.cashflow.bussiness.data.source.localservice.dao.IncomeDao
import com.moneymaker.cashflow.bussiness.data.source.localservice.entities.IncomeEntity
import com.moneymaker.cashflow.core.di.IoDispatcher
import com.moneymaker.cashflow.core.wrapper.DataState
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

class IncomeRepository @Inject constructor(
    private val incomeDao: IncomeDao,
    private val applicationScope: CoroutineScope,
    @IoDispatcher private val ioDispatcher: CoroutineDispatcher
) {
    private val _incomeList = MutableStateFlow<DataState<List<IncomeEntity>>>(DataState.SUCCESS(emptyList()))
    val incomeList = _incomeList.asStateFlow()

    init {
        applicationScope.launch {
            incomeDao.getAllIncome()
                .map<List<IncomeEntity>, DataState<List<IncomeEntity>>> { list -> DataState.SUCCESS(list) }
                .catch { err -> emit(DataState.ERROR("Exception", err.message)) }
                .flowOn(ioDispatcher)
                .collect { state -> _incomeList.value = state }
        }
    }

    suspend fun addIncome(incomeEntity: IncomeEntity) = withContext(ioDispatcher) {
        incomeDao.insertIncome(incomeEntity)
    }

    suspend fun updateIncome(incomeEntity: IncomeEntity) = withContext(ioDispatcher) {
        incomeDao.updateIncomeDetails(incomeEntity)
    }

    suspend fun deleteIncome(incomeEntity: IncomeEntity) = withContext(ioDispatcher) {
        incomeDao.deleteIncomeDetails(incomeEntity)
    }
}