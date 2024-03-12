package com.moneymaker.cashflow.bussiness.domain.usecase.expenses

import com.moneymaker.cashflow.bussiness.data.local.dao.entities.Expenses

interface DeleteExpenseUseCase {
    operator fun invoke(objects: Expenses)
}