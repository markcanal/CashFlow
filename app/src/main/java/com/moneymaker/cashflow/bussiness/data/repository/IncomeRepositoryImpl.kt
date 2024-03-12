package com.moneymaker.cashflow.bussiness.data.repository

import com.moneymaker.cashflow.bussiness.data.local.dao.database.AppDatabase
import com.moneymaker.cashflow.bussiness.data.local.dao.entities.Income
import com.moneymaker.cashflow.bussiness.domain.repositories.IncomeRepository
import javax.inject.Inject

class IncomeRepositoryImpl @Inject constructor(private val db: AppDatabase) : IncomeRepository {
    override suspend fun getAllIncomeList(): List<Income> {
        return db.incomeDao().getAllList()
    }

    override suspend fun addIncome(income: Income) {
        db.incomeDao().addIncome(income)
    }

    override suspend fun updateIncomeAmount(amount: Double, incomeTransID: Int) {
        db.incomeDao().updateIncomeAmount(amount, incomeTransID)
    }
}