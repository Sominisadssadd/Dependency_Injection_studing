package com.example.dependencyinjectionstuding.example2.data

import com.example.dependencyinjectionstuding.example2.di.ApplicationScope
import javax.inject.Inject


@ApplicationScope
class ExampleRemoteDataSourceImpl @Inject constructor(
     val apiService: ExampleApiService
) : ExampleRemoteDataSource {

    override fun method() {
        apiService.method()
    }
}
