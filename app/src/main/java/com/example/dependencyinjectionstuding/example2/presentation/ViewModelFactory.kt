package com.example.dependencyinjectionstuding.example2.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.dependencyinjectionstuding.example2.di.ApplicationScope
import com.example.dependencyinjectionstuding.example2.domain.ExampleUseCase
import javax.inject.Inject
import javax.inject.Provider


class ViewModelFactory @Inject constructor(
    val viewModelsProviders: @JvmSuppressWildcards Map<Class<out ViewModel>, Provider<ViewModel>>
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        //теперь фабрика будет не просто давать те вьюмодели которые есть а создавать новые
        return viewModelsProviders[modelClass]?.get() as T
    }
}