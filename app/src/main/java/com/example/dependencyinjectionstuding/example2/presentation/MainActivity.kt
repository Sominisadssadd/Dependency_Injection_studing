package com.example.dependencyinjectionstuding.example2.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dependencyinjectionstuding.ExampleApplication
import com.example.dependencyinjectionstuding.R
import com.example.dependencyinjectionstuding.example2.di.DaggerApplicationComponent

import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: ExampleViewModel

    private val inject by lazy {
        (application as ExampleApplication).inject
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        inject.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.method()


    }
}