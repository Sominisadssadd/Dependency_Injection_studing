package com.example.dependencyinjectionstuding.example2.data

import com.example.dependencyinjectionstuding.example2.di.ApplicationScope
import javax.inject.Inject

@ApplicationScope
class ExampleLocalDataSourceImpl @Inject constructor(
     val database: ExampleDatabase
) : ExampleLocalDataSource {

    override fun method() {
        database.method()
    }
}
