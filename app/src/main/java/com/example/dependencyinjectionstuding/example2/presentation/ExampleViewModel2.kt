package com.example.dependencyinjectionstuding.example2.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.dependencyinjectionstuding.example2.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel2 @Inject constructor(
    val useCase: ExampleUseCase
): ViewModel() {

    fun method() {
        useCase()
        Log.d("ExampleViewModel", "$this")
    }
}