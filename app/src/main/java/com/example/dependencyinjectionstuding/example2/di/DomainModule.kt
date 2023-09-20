package com.example.dependencyinjectionstuding.example2.di

import com.example.dependencyinjectionstuding.example2.data.ExampleRepositoryImpl
import com.example.dependencyinjectionstuding.example2.domain.ExampleRepository
import dagger.Binds
import dagger.Module
import dagger.Provides


@Module
interface DomainModule {


    @Binds
    fun bindRepository(repository: ExampleRepositoryImpl): ExampleRepository

}