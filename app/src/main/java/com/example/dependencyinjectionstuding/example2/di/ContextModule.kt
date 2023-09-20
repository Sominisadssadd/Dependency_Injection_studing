package com.example.dependencyinjectionstuding.example2.di

import android.content.Context
import dagger.Module
import dagger.Provides


@Module
class ContextModule(val context: Context) {

    @Provides
    fun provideContext(): Context {
        return context
    }

}