package com.moneymaker.cashflow.bussiness.data.local.dao.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.moneymaker.cashflow.core.constants.IncomeConstants.INCOME_AMOUNT
import com.moneymaker.cashflow.core.constants.IncomeConstants.INCOME_DATE
import com.moneymaker.cashflow.core.constants.IncomeConstants.INCOME_DESCRIPTION
import com.moneymaker.cashflow.core.constants.IncomeConstants.TABLE_NAME

@Entity(tableName = TABLE_NAME)
data class Income(
//    @ColumnInfo(INCOME_TRANS_ID) val iTransId: Int,
    @ColumnInfo(name = INCOME_AMOUNT) val amount: Double,
    @ColumnInfo(name = INCOME_DATE) val date: String,
    @ColumnInfo(name = INCOME_DESCRIPTION) val description: String
) {
    @PrimaryKey(autoGenerate = true)
    var iTransId: Int = 0
}
