package com.moneymaker.cashflow.bussiness.data.source.localservice.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.moneymaker.cashflow.bussiness.data.source.localservice.entities.IncomeEntity

@Dao
interface IncomeDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertIncome(incomeEntity: IncomeEntity)

    @Query("SELECT * FROM INCOME_TABLE")
    fun getAllIncome(): List<IncomeEntity>

    @Update
    suspend fun updateIncomeDetails(incomeEntity: IncomeEntity)

    @Delete
    suspend fun deleteIncomeDetails(incomeEntity: IncomeEntity)
}