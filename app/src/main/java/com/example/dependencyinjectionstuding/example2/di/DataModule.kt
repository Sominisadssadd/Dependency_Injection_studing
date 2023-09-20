package com.example.dependencyinjectionstuding.example2.di

import com.example.dependencyinjectionstuding.example2.data.*
import dagger.Binds
import dagger.Module
import dagger.Provides


@Module
interface  DataModule {


    //С Binds приложение будет собираться быстрее и будет использоваться меньше кода
    //метод связывает интерфейс с реализацией
    @Binds
    fun provideRepositoryDataBase(repository: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @Binds
    fun provideRepositoryApi(repository: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource

}