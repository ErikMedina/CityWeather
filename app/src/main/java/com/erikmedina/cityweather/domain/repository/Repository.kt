package com.erikmedina.cityweather.domain.repository

import com.erikmedina.cityweather.data.local.model.City

interface Repository {

    interface Callback {

        fun onSuccess(group: List<City>)

        fun onError(throwable: Throwable)
    }

    fun getCitiesTemperature(citiesIds: IntArray, callback: Repository.Callback)
}
