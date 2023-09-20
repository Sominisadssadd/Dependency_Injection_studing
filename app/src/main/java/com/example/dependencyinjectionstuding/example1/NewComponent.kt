package com.example.dependencyinjectionstuding.example1

import dagger.Component


@Component//(modules = [ComputerModel::class])
interface NewComponent {


    fun inject(activity: Activity)


//    fun getMouse(): Mouse
//
//    fun getMonitor(): Monitor
//
//    fun getKeyboard(): Keyboard

//    fun getComputer() : Computer

}