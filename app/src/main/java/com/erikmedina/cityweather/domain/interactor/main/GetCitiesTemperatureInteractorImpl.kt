package com.erikmedina.cityweather.domain.interactor.main

import com.erikmedina.cityweather.data.local.model.City
import com.erikmedina.cityweather.domain.repository.Repository
import kotlinx.coroutines.experimental.android.UI
import kotlinx.coroutines.experimental.launch
import javax.inject.Inject

class GetCitiesTemperatureInteractorImpl
@Inject
constructor(private val repository: Repository) : GetCitiesTemperatureInteractor {

    private lateinit var callback: GetCitiesTemperatureInteractor.Callback
    private lateinit var citiesIds: IntArray

    override fun run(citiesIds: IntArray, callback: GetCitiesTemperatureInteractor.Callback) {
        this.citiesIds = citiesIds
        this.callback = callback
        execute()
    }

    override fun execute() {
        launch(UI) {
            repository.getCitiesTemperature(citiesIds, object : Repository.Callback {
                override fun onSuccess(cities: List<City>) {
                    callback.onSuccess(cities)
                }

                override fun onError(throwable: Throwable) {
                    callback.onError(throwable)
                }
            })
        }
    }
}
