package com.erikmedina.cityweather.domain.interactor.main

import com.erikmedina.cityweather.domain.repository.Repository
import kotlinx.coroutines.experimental.launch
import javax.inject.Inject

class GetCitiesTemperatureInteractorImpl
@Inject
constructor(private val repository: Repository) : GetCitiesTemperatureInteractor {

    lateinit var citiesIds: ArrayList<Int>

    override fun run(citiesIds: ArrayList<Int>) {
        this.citiesIds = citiesIds
        execute()
    }

    override fun execute() {
        launch {
            repository.getCitiesTemperature(citiesIds)
        }
    }
}