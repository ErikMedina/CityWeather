package com.erikmedina.cityweather.domain.interactor.main

import com.erikmedina.cityweather.data.local.model.City
import com.erikmedina.cityweather.domain.interactor.base.Interactor

interface GetCitiesTemperatureInteractor : Interactor {

    interface Callback {

        fun onSuccess(cities: List<City>)

        fun onError(throwable: Throwable)
    }

    fun run(citiesIds: IntArray, callback: Callback)
}
