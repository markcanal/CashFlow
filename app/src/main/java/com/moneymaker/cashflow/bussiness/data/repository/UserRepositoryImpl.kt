package com.moneymaker.cashflow.bussiness.data.repository

import com.moneymaker.cashflow.bussiness.data.local.dao.database.AppDatabase
import com.moneymaker.cashflow.bussiness.data.local.dao.entities.User
import com.moneymaker.cashflow.bussiness.domain.repositories.UserRepository
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(private val db: AppDatabase) : UserRepository {
    override suspend fun loginUser(user: User) {
        db.userDao().saveUserLogin(user)
    }

    override suspend fun logoutUser(user: User) {
        db.userDao().logOut(user)
    }

    override suspend fun signUpUser(user: User) {
        TODO("Not yet implemented")
    }

    override suspend fun checkIfUserSigned(): Boolean {
        var signed: Boolean = false
    
        return signed
    }
}