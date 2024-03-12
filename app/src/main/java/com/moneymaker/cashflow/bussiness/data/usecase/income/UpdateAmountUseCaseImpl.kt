package com.moneymaker.cashflow.bussiness.data.usecase.income

import com.moneymaker.cashflow.bussiness.domain.repositories.IncomeRepository
import com.moneymaker.cashflow.bussiness.domain.usecase.income.UpdateAMountUseCase
import com.moneymaker.cashflow.core.application.CoroutineScopeProvider
import kotlinx.coroutines.launch
import javax.inject.Inject

class UpdateAmountUseCaseImpl @Inject constructor(
    private val coroutineScopeProvider: CoroutineScopeProvider,
    private val incomeRepository: IncomeRepository
) : UpdateAMountUseCase {
    override fun invoke(amount: Double, incomeTransID: Int) {
        coroutineScopeProvider.ioScope().launch {
            incomeRepository.updateIncomeAmount(amount, incomeTransID)
        }
    }
}