package com.example.kotlinindependent.repositories

import com.example.kotlinindependent.datamodels.User
import com.example.kotlinindependent.datamodels.UserState


interface UserRepositoryInterface {
    suspend fun loginUser(): UserState

    fun getUserState(): UserState
}