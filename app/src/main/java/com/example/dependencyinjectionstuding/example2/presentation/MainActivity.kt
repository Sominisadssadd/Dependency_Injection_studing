package com.example.dependencyinjectionstuding.example2.presentation

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.dependencyinjectionstuding.R
import com.example.dependencyinjectionstuding.example1.Activity
import com.example.dependencyinjectionstuding.example2.di.ContextModule
import com.example.dependencyinjectionstuding.example2.di.DaggerApplicationComponent
import com.example.dependencyinjectionstuding.example2.domain.ExampleUseCase
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: ExampleViewModel

    private val inject by lazy {
        DaggerApplicationComponent.builder()
            .contextModule(ContextModule(this))
            .build()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        inject.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        viewModel.method()




    }
}