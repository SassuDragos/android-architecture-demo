package com.example.domain.usecases

import com.example.domain.repositories.UserRepositoryInterface
import com.example.domain.repositories.UserState

// The user Repository should be injected

class OnboardingUseCase(val userRepository: UserRepositoryInterface) {

    fun getUserName(): UserState = userRepository.getUserState()

    suspend fun loginUser() {
        //
    }
}