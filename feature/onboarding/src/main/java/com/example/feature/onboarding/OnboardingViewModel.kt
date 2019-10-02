package com.example.feature.onboarding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kotlinindependent.datamodels.UserState
import com.example.kotlinindependent.usecases.OnboardingUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class OnboardingViewModel() : ViewModel() {

    val onboardingUseCase = OnboardingUseCase()
    val userName: MutableLiveData<String> =
        MutableLiveData(onboardingUseCase.getUserState().toUserLabel())

    fun loginUser() =
        viewModelScope.launch {
            val userState = async(Dispatchers.IO) { onboardingUseCase.loginUser() }.await()
            userName.postValue(userState.toUserLabel())
        }


    private fun UserState.toUserLabel(): String = when (this) {
        is UserState.AuthenticatedState -> this.user.name
        is UserState.NotAuthenticatedState -> "Unknown user"
    }
}
