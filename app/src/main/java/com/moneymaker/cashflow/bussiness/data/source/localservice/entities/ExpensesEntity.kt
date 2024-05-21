package com.moneymaker.cashflow.bussiness.data.source.localservice.entities

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.moneymaker.cashflow.core.constants.ApplicationConstants.EXPENSE_TABLE_NAME
import com.moneymaker.cashflow.core.constants.ExpensesConstants.EXPENSE_AMOUNT
import com.moneymaker.cashflow.core.constants.ExpensesConstants.EXPENSE_DATE
import com.moneymaker.cashflow.core.constants.ExpensesConstants.EXPENSE_DESCRIPTION
import com.moneymaker.cashflow.core.constants.ExpensesConstants.EXPENSE_TRANS_ID
import com.moneymaker.cashflow.core.constants.ExpensesConstants.EXPENSE_TYPE
import kotlinx.parcelize.Parcelize

@Entity(tableName = EXPENSE_TABLE_NAME)
@Parcelize
data class ExpensesEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = EXPENSE_TRANS_ID) val transId: Int,
    @ColumnInfo(name = EXPENSE_AMOUNT) val amount: Double,
    @ColumnInfo(name = EXPENSE_DESCRIPTION) val description: String,
    @ColumnInfo(name = EXPENSE_DATE) val date: String,
    @ColumnInfo(name = EXPENSE_TYPE) val expenseTypeId: Int
) : Parcelable
