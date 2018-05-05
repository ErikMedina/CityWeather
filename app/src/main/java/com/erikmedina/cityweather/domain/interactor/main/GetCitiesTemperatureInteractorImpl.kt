package com.erikmedina.cityweather.domain.interactor.main

import com.erikmedina.cityweather.domain.repository.Repository
import kotlinx.coroutines.experimental.launch
import javax.inject.Inject

class GetCitiesTemperatureInteractorImpl
@Inject
constructor(private val repository: Repository) : GetCitiesTemperatureInteractor {

    private lateinit var citiesIds: IntArray

    override fun run(citiesIds: IntArray) {
        this.citiesIds = citiesIds
        execute()
    }

    override fun execute() {
        launch {
            repository.getCitiesTemperature(citiesIds)
        }
    }
}