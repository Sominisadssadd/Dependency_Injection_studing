package com.example.dependencyinjectionstuding.example2.data

import javax.inject.Inject

class ExampleLocalDataSourceImpl @Inject constructor(
     val database: ExampleDatabase
) : ExampleLocalDataSource {

    override fun method() {
        database.method()
    }
}
