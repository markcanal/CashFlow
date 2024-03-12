package com.moneymaker.cashflow.bussiness.data.usecase.expenses

import com.moneymaker.cashflow.bussiness.data.local.dao.entities.Expenses
import com.moneymaker.cashflow.bussiness.domain.repositories.ExpenseRepository
import com.moneymaker.cashflow.bussiness.domain.usecase.expenses.DeleteExpenseUseCase
import com.moneymaker.cashflow.core.application.CoroutineScopeProvider
import kotlinx.coroutines.launch
import javax.inject.Inject

class DeleteExpensesUseCaseImpl @Inject constructor(
    private val coroutineScopeProvider: CoroutineScopeProvider,
    private val expenseRepository: ExpenseRepository
) : DeleteExpenseUseCase {
    override operator fun invoke(objects: Expenses) {
        coroutineScopeProvider.ioScope().launch {
            expenseRepository.deleteExpense(objects)
        }
    }
}