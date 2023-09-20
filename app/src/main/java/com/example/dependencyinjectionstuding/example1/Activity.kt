package com.example.dependencyinjectionstuding.example1

import javax.inject.Inject

class Activity {


    //Указывая Inject мы говорим что в это поле должен поставляться какой-то класс
    //если Inject нет, то ничего поставляться не будет


    @Inject
    lateinit var computer: Computer

    init {
        DaggerNewComponent.create().inject(this)

    }


}