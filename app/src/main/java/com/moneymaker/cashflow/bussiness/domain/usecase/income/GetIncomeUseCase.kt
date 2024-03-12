package com.moneymaker.cashflow.bussiness.domain.usecase.income

import com.moneymaker.cashflow.bussiness.data.local.dao.entities.Income
import com.moneymaker.cashflow.core.wrapper.Response
import kotlinx.coroutines.flow.Flow

interface GetIncomeUseCase {
    operator fun invoke(): Flow<Response<List<Income>>>
}