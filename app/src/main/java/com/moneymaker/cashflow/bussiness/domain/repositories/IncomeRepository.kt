package com.moneymaker.cashflow.bussiness.domain.repositories

import com.moneymaker.cashflow.bussiness.data.local.dao.entities.Income

interface IncomeRepository {
    suspend fun getAllIncomeList(): List<Income>
    suspend fun addIncome(income: Income)
    suspend fun updateIncomeAmount(amount: Double, incomeTransID: Int)
}