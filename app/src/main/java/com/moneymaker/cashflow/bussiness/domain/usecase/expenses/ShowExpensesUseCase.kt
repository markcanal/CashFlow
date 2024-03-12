package com.moneymaker.cashflow.bussiness.domain.usecase.expenses

import com.moneymaker.cashflow.bussiness.data.local.dao.entities.Expenses
import com.moneymaker.cashflow.core.wrapper.Response
import kotlinx.coroutines.flow.Flow

interface ShowExpensesUseCase {
    operator fun invoke(): Flow<Response<List<Expenses>>>
}