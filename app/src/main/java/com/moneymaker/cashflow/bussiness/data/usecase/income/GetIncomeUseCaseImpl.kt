package com.moneymaker.cashflow.bussiness.data.usecase.income

import com.moneymaker.cashflow.bussiness.data.local.dao.entities.Income
import com.moneymaker.cashflow.bussiness.domain.repositories.IncomeRepository
import com.moneymaker.cashflow.bussiness.domain.usecase.income.GetIncomeUseCase
import com.moneymaker.cashflow.core.application.CoroutineScopeProvider
import com.moneymaker.cashflow.core.enums.Error
import com.moneymaker.cashflow.core.wrapper.Response
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import javax.inject.Inject

class GetIncomeUseCaseImpl @Inject constructor(
    private val coroutineScopeProvider: CoroutineScopeProvider,
    private val incomeRepository: IncomeRepository
) : GetIncomeUseCase {
    override fun invoke(): Flow<Response<List<Income>>> = flow {
        coroutineScopeProvider.ioScope().launch {
            try {
                val data = incomeRepository.getAllIncomeList()
                if (data.isEmpty()) {
                    emit(Response.ERROR(Error.EMPTY.title, Error.EMPTY.description))
                } else {
                    emit(Response.SUCCESS(data))
                }
            } catch (e: Exception) {
                emit(Response.EXCEPTION(e))
            }
        }
    }
}