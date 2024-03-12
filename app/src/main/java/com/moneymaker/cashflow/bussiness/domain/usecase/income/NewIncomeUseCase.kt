package com.moneymaker.cashflow.bussiness.domain.usecase.income

import com.moneymaker.cashflow.bussiness.data.local.dao.entities.Income

interface NewIncomeUseCase {
    operator fun invoke(objects: Income)
}