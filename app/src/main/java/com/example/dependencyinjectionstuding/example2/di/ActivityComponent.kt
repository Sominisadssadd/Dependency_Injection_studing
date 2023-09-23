package com.example.dependencyinjectionstuding.example2.di

import com.example.dependencyinjectionstuding.example2.di.qualifiers.IdQualifier
import com.example.dependencyinjectionstuding.example2.di.qualifiers.NameQualifier
import com.example.dependencyinjectionstuding.example2.presentation.MainActivity
import dagger.BindsInstance
import dagger.Subcomponent


@Subcomponent(modules = [ViewModelModule::class])
interface ActivityComponent {


    fun inject(activity: MainActivity)

    @Subcomponent.Factory
    interface ActivityComponentFactory {

        fun create(
            @BindsInstance @IdQualifier id: String,
            @BindsInstance @NameQualifier name: String
        ): ActivityComponent
    }

}