package com.example.kotlinindependent.usecases

import com.example.kotlinindependent.datamodels.User
import com.example.kotlinindependent.datamodels.UserState
import com.example.kotlinindependent.repositories.UserRepositoryInterface
import kotlinx.coroutines.delay

// The user Repository should be injected

class OnboardingUseCase(val userRepository: UserRepositoryInterface = object :UserRepositoryInterface {
    override suspend fun loginUser(): UserState {
        delay(2000)
        return UserState.AuthenticatedState(User("English score user"))
    }

    // Checks cache / DB
    override fun getUserState(): UserState = UserState.NotAuthenticatedState
}) {

    fun getUserState(): UserState = userRepository.getUserState()

    suspend fun loginUser(): UserState = userRepository.loginUser()
}