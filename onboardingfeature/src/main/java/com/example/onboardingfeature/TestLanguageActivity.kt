package com.example.onboardingfeature

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.features.languagetesting.R
import com.example.features.languagetesting.databinding.ActivityMainBinding
import com.example.features.onboardingfeature.TestLanguageViewModel

class TestLanguageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.viewModel = ViewModelProviders.of(this)[TestLanguageViewModel::class.java]
        binding.lifecycleOwner = this
    }
}
