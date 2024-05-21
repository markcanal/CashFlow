package com.moneymaker.cashflow.bussiness.data.source.localservice.entities

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.moneymaker.cashflow.core.constants.ApplicationConstants.INCOME_TABLE_NAME
import com.moneymaker.cashflow.core.constants.IncomeConstants.INCOME_AMOUNT
import com.moneymaker.cashflow.core.constants.IncomeConstants.INCOME_DATE
import com.moneymaker.cashflow.core.constants.IncomeConstants.INCOME_DESCRIPTION
import com.moneymaker.cashflow.core.constants.IncomeConstants.INCOME_TRANS_ID
import kotlinx.parcelize.Parcelize

@Entity(tableName = INCOME_TABLE_NAME)
@Parcelize
data class IncomeEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = INCOME_TRANS_ID) val transId: Int = 0,
    @ColumnInfo(name = INCOME_AMOUNT) val amount: Double,
    @ColumnInfo(name = INCOME_DESCRIPTION) val description: String,
    @ColumnInfo(name = INCOME_DATE) val date: String,
) : Parcelable