package com.moneymaker.cashflow.bussiness.domain.usecase.expenses

import com.moneymaker.cashflow.bussiness.data.local.dao.entities.Expenses
import com.moneymaker.cashflow.core.wrapper.Response
import kotlinx.coroutines.flow.Flow

interface SelectExpenseByDateUseCase {
    operator fun invoke(date: String): Flow<Response<List<Expenses>>>
}