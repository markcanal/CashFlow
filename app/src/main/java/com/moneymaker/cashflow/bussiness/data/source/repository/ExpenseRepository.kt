package com.moneymaker.cashflow.bussiness.data.source.repository

import com.moneymaker.cashflow.bussiness.data.source.localservice.dao.ExpenseDao
import com.moneymaker.cashflow.bussiness.data.source.localservice.entities.ExpensesEntity
import com.moneymaker.cashflow.core.di.IoDispatcher
import com.moneymaker.cashflow.core.wrapper.DataState
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

class ExpenseRepository @Inject constructor(
    private val expenseDao: ExpenseDao,
    private val applicationScope: CoroutineScope,
    @IoDispatcher private val ioDispatcher: CoroutineDispatcher
) {
    private val _expenseList = MutableStateFlow<DataState<List<ExpensesEntity>>>(DataState.SUCCESS(emptyList()))
    val expense: StateFlow<DataState<List<ExpensesEntity>>> = _expenseList.asStateFlow()

    init {
        applicationScope.launch {
            expenseDao.getAllExpenses()
                .map<List<ExpensesEntity>, DataState<List<ExpensesEntity>>> { list -> DataState.SUCCESS(list) }
                .catch { err -> emit(DataState.ERROR("Exception", err.message)) }
                .flowOn(ioDispatcher)
                .collect { state -> _expenseList.value = state }

        }
    }

    suspend fun addNewExpense(expense: ExpensesEntity) = withContext(ioDispatcher) {
        expenseDao.insertExpenses(expense)
    }

    suspend fun deleteExpense(expense: ExpensesEntity) = withContext(ioDispatcher) {
        expenseDao.deleteExpensesDetails(expense)
    }

    suspend fun updateExpense(expense: ExpensesEntity) = withContext(ioDispatcher) {
        expenseDao.updateExpensesDetails(expense)
    }
}