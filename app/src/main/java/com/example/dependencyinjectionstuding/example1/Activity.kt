package com.example.dependencyinjectionstuding.example1

import javax.inject.Inject

class Activity {


    lateinit var keyboard: Keyboard


    lateinit var monitor: Monitor


    lateinit var mouse: Mouse


    init {
        DaggerNewComponent.create().inject(this)
    }


}