package com.example.dependencyinjectionstuding.example2.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.dependencyinjectionstuding.ExampleApplication
import com.example.dependencyinjectionstuding.R
import com.example.dependencyinjectionstuding.example2.di.DaggerApplicationComponent

import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory


    private val viewModel by lazy {
        ViewModelProvider(this, viewModelFactory)[ExampleViewModel::class.java]
    }

    private val viewModel2 by lazy {
        ViewModelProvider(this, viewModelFactory)[ExampleViewModel::class.java]
    }


    private val component by lazy {
        (application as ExampleApplication).inject
            .componentActivity()
            .create("MyID","MyName")

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.method()



    }
}