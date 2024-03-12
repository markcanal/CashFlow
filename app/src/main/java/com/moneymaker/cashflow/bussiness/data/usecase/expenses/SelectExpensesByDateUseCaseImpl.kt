package com.moneymaker.cashflow.bussiness.data.usecase.expenses

import com.moneymaker.cashflow.bussiness.data.local.dao.entities.Expenses
import com.moneymaker.cashflow.bussiness.domain.repositories.ExpenseRepository
import com.moneymaker.cashflow.bussiness.domain.usecase.expenses.SelectExpenseByDateUseCase
import com.moneymaker.cashflow.core.application.CoroutineScopeProvider
import com.moneymaker.cashflow.core.enums.Error
import com.moneymaker.cashflow.core.wrapper.Response
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import javax.inject.Inject

class SelectExpensesByDateUseCaseImpl @Inject constructor(
    private val coroutineScopeProvider: CoroutineScopeProvider,
    private val expenseRepository: ExpenseRepository
) : SelectExpenseByDateUseCase {
    override fun invoke(date: String): Flow<Response<List<Expenses>>> = flow {
        coroutineScopeProvider.ioScope().launch {
            try {
                val data = expenseRepository.selectExpenseWithByDate(date)
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