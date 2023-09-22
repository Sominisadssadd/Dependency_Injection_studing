package com.example.dependencyinjectionstuding.example2.data

import android.app.Application
import android.content.Context
import android.util.Log
import android.widget.Toast
import com.example.dependencyinjectionstuding.R
import javax.inject.Inject
import javax.inject.Singleton


class ExampleDatabase @Inject constructor(
    val context: Context,
    val systemTime: String
) {

    fun method() {


        Log.d(LOG_TAG, "Database ${context.getString(R.string.app_name)} $systemTime   $this")

    }

    companion object {
        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}
