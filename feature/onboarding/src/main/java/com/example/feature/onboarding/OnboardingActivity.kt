package com.example.feature.onboarding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.feature.onboarding.databinding.ActivityOnboardingBinding


class OnboardingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityOnboardingBinding = DataBindingUtil.setContentView(this, R.layout.activity_onboarding)
        binding.viewModel = ViewModelProviders.of(this)[OnboardingViewModel::class.java]
        binding.lifecycleOwner = this
    }
}
