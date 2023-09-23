package com.example.dependencyinjectionstuding.example2.data

import com.example.dependencyinjectionstuding.example2.di.qualifiers.DataSourceQualifier
import com.example.dependencyinjectionstuding.example2.di.qualifiers.DataSourceQualifierTesting
import com.example.dependencyinjectionstuding.example2.domain.ExampleRepository
import javax.inject.Inject



//При помощи Qualifier можно подменять реализации)
class ExampleRepositoryImpl @Inject constructor(
    val localDataSource: ExampleLocalDataSource,
    @DataSourceQualifierTesting val remoteDataSource: ExampleRemoteDataSource,
    val mapper: ExampleMapper
) : ExampleRepository {

    override fun method() {
        mapper.map()
        localDataSource.method()
        remoteDataSource.method()
    }
}
