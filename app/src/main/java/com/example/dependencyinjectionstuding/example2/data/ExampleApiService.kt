package com.example.dependencyinjectionstuding.example2.data

import android.content.Context
import android.util.Log
import com.example.dependencyinjectionstuding.R
import javax.inject.Inject

class ExampleApiService @Inject constructor(
    val context: Context
) {

    fun method() {
        Log.d(TAG_EXAMPLE, "API ${context.getString(R.string.app_name)}")
    }

    companion object {
        private const val TAG_EXAMPLE = "EXAMPLE_TEST"
    }
}
