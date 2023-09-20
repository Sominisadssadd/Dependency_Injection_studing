package com.example.dependencyinjectionstuding.example2.presentation

import com.example.dependencyinjectionstuding.example2.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel @Inject constructor(
     val useCase: ExampleUseCase
) {

    fun method() {
        useCase()
    }
}
