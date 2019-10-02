package com.example.domain.repositories

import com.example.domain.datamodels.User

sealed class UserState {
    class AuthenticatedState(val user: User): UserState()
    object NotAuthenticatedState: UserState()
}

interface UserRepositoryInterface {
    fun loginUser(): User

    fun getUserState(): UserState
}