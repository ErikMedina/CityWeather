package com.erikmedina.cityweather.di.module

import com.erikmedina.cityweather.domain.interactor.main.GetCitiesTemperatureInteractor
import com.erikmedina.cityweather.domain.interactor.main.GetCitiesTemperatureInteractorImpl
import com.erikmedina.cityweather.domain.repository.Repository
import com.erikmedina.cityweather.presentation.main.MainContract
import com.erikmedina.cityweather.presentation.main.MainPresenter
import dagger.Module
import dagger.Provides

@Module
class MainModule {

    @Provides
    fun providePresenter(presenter: MainPresenter): MainContract.Presenter {
        return presenter
    }

    @Provides
    fun provideGetCitiesTemperatureInteractor(
            repository: Repository): GetCitiesTemperatureInteractor {
        return GetCitiesTemperatureInteractorImpl(repository)
    }
}
