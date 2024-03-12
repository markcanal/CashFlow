package com.moneymaker.cashflow.bussiness.domain.usecase.income

interface UpdateAMountUseCase {
    operator fun invoke(amount: Double, incomeTransID: Int)
}