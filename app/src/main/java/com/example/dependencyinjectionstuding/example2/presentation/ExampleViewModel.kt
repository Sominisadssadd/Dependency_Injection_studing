package com.example.dependencyinjectionstuding.example2.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.dependencyinjectionstuding.example2.di.qualifiers.IdQualifier
import com.example.dependencyinjectionstuding.example2.di.qualifiers.NameQualifier
import com.example.dependencyinjectionstuding.example2.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel @Inject constructor(
    val useCase: ExampleUseCase,
    @IdQualifier val id: String,
    @NameQualifier val name: String
) : ViewModel() {

    fun method() {
        useCase()
        Log.d("ExampleViewModel", "$this $id")
    }
}
