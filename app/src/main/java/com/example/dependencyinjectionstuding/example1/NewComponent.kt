package com.example.dependencyinjectionstuding.example1

import dagger.Component


@Component
interface NewComponent {

    //    fun inject(activity: Activity)
    fun getMouse(activity: Activity): Mouse

}