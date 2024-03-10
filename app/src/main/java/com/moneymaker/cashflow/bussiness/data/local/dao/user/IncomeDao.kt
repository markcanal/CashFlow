package com.moneymaker.cashflow.bussiness.data.local.dao.user

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.moneymaker.cashflow.bussiness.data.local.dao.entity.Income
import com.moneymaker.cashflow.core.constants.IncomeConstants.INCOME_AMOUNT
import com.moneymaker.cashflow.core.constants.IncomeConstants.TABLE_NAME

@Dao
interface IncomeDao {
    @Query("SELECT * FROM $TABLE_NAME")
    fun getAllList(): List<Income>

    @Insert
    fun addIncome(vararg income: Income)

    @Query("UPDATE $TABLE_NAME SET $INCOME_AMOUNT=:amount WHERE uid=:id")
    fun updateAmount(amount: Double, id: Int)
}