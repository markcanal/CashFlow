package com.moneymaker.cashflow.bussiness.data.usecase.income

import com.moneymaker.cashflow.bussiness.data.local.dao.entities.Income
import com.moneymaker.cashflow.bussiness.domain.repositories.IncomeRepository
import com.moneymaker.cashflow.bussiness.domain.usecase.income.NewIncomeUseCase
import com.moneymaker.cashflow.core.application.CoroutineScopeProvider
import kotlinx.coroutines.launch
import javax.inject.Inject

class NewIncomeUseCaseImp @Inject constructor(
    private val coroutineScopeProvider: CoroutineScopeProvider,
    private val incomeRepository: IncomeRepository
) : NewIncomeUseCase {
    override fun invoke(objects: Income) {
        coroutineScopeProvider.ioScope().launch {
            incomeRepository.addIncome(objects)
        }
    }
}