package com.example.dependencyinjectionstuding.example2.di

import com.example.dependencyinjectionstuding.example2.data.*
import com.example.dependencyinjectionstuding.example2.di.qualifiers.DataSourceQualifier
import com.example.dependencyinjectionstuding.example2.di.qualifiers.DataSourceQualifierTesting
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Qualifier


@Module
interface DataModule {


    //С Binds приложение будет собираться быстрее и будет использоваться меньше кода
    //метод связывает интерфейс с реализацией
    @ApplicationScope
    @Binds
    fun provideRepositoryDataBase(repository: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @ApplicationScope
    @Binds
    @DataSourceQualifier
    fun provideRepositoryApi(repository: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource

    @ApplicationScope
    @Binds
    @DataSourceQualifierTesting
    fun provideRepositoryApiTesting(repository: ExampleRemoteDataSourceImplTesting): ExampleRemoteDataSource

}