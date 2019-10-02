package com.example.features.onboardingfeature

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TestLanguageViewModel(): ViewModel() {

    val userName: MutableLiveData<String> = MutableLiveData("Test")

        fun loginUser() {
            userName.value = "English Score User"
        }

}