package com.moneymaker.cashflow.bussiness.data.source.localservice.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.moneymaker.cashflow.bussiness.data.source.localservice.entities.ExpensesEntity

@Dao
interface ExpenseDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertIncome(expensesEntity: ExpensesEntity)

    @Query("SELECT * FROM EXPENSE_TABLE")
    fun getAllIncome(): List<ExpensesEntity>

    @Update
    suspend fun updateIncomeDetails(expensesEntity: ExpensesEntity)

    @Delete
    suspend fun deleteIncomeDetails(expensesEntity: ExpensesEntity)
}