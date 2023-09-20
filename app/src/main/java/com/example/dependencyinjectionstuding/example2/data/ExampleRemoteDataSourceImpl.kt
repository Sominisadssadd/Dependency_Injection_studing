package com.example.dependencyinjectionstuding.example2.data

import javax.inject.Inject

class ExampleRemoteDataSourceImpl @Inject constructor(
     val apiService: ExampleApiService
) : ExampleRemoteDataSource {

    override fun method() {
        apiService.method()
    }
}
