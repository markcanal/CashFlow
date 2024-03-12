package com.moneymaker.cashflow.bussiness.domain.repositories

import com.moneymaker.cashflow.bussiness.data.local.dao.entities.User

interface UserRepository {
    suspend fun loginUser(user: User)
    suspend fun logoutUser(user: User)
    suspend fun signUpUser(user: User)
    suspend fun checkIfUserSigned(): Boolean
}