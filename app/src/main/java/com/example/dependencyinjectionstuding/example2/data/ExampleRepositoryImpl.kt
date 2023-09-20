package com.example.dependencyinjectionstuding.example2.data

import com.example.dependencyinjectionstuding.example2.domain.ExampleRepository
import javax.inject.Inject

class ExampleRepositoryImpl @Inject constructor(
     val localDataSource: ExampleLocalDataSource,
     val remoteDataSource: ExampleRemoteDataSource,
     val mapper: ExampleMapper
) : ExampleRepository {

    override fun method() {
        mapper.map()
        localDataSource.method()
        remoteDataSource.method()
    }
}
