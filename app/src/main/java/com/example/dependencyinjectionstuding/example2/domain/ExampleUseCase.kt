package com.example.dependencyinjectionstuding.example2.domain

import javax.inject.Inject

class ExampleUseCase @Inject constructor(
     val repository: ExampleRepository
) {

    operator fun invoke() {
        repository.method()
    }
}
