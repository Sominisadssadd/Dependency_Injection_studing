package com.example.dependencyinjectionstuding

import android.app.Application
import com.example.dependencyinjectionstuding.example2.di.DaggerApplicationComponent

class ExampleApplication : Application() {

    val inject by lazy {
        DaggerApplicationComponent.factory()
            .create(this, System.currentTimeMillis())
    }

}