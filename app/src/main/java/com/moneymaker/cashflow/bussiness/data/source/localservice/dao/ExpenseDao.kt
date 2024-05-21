package com.moneymaker.cashflow.bussiness.data.source.localservice.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.moneymaker.cashflow.bussiness.data.source.localservice.entities.ExpensesEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface ExpenseDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertExpenses(expensesEntity: ExpensesEntity)

    @Query("SELECT * FROM EXPENSE_TABLE")
    fun getAllExpenses(): Flow<List<ExpensesEntity>>

    @Update
    suspend fun updateExpensesDetails(expensesEntity: ExpensesEntity)

    @Delete
    suspend fun deleteExpensesDetails(expensesEntity: ExpensesEntity)
}