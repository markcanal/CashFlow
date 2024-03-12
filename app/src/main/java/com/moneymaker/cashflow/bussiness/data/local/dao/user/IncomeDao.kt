package com.moneymaker.cashflow.bussiness.data.local.dao.user

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.moneymaker.cashflow.bussiness.data.local.dao.entities.Income
import com.moneymaker.cashflow.core.constants.IncomeConstants.INCOME_AMOUNT
import com.moneymaker.cashflow.core.constants.IncomeConstants.INCOME_TRANS_ID
import com.moneymaker.cashflow.core.constants.IncomeConstants.TABLE_NAME

@Dao
interface IncomeDao {
    @Query("SELECT * FROM $TABLE_NAME ")
    suspend fun getAllList(): List<Income>

    @Insert
    suspend fun addIncome(vararg income: Income)

    @Query("UPDATE $TABLE_NAME SET $INCOME_AMOUNT=:amount WHERE $INCOME_TRANS_ID=:incomeTransID")
    suspend fun updateIncomeAmount(amount: Double, incomeTransID: Int): Int
}