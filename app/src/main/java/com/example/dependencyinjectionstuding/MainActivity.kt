package com.example.dependencyinjectionstuding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dependencyinjectionstuding.example1.Activity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Activity().keyboard.toString()
        Activity().monitor.toString()
        Activity().mouse.toString()

    }
}