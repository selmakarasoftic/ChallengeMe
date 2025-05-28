package com.example.challengeme.repository

import com.example.challengeme.data.UserDao
import com.example.challengeme.data.UserEntity

class UserRepository(private val userDao: UserDao) {
    suspend fun login(email: String, password: String) = userDao.login(email, password)
    suspend fun register(user: UserEntity) = userDao.register(user)
    suspend fun isEmailTaken(email: String) = userDao.findByEmail(email) != null
}
