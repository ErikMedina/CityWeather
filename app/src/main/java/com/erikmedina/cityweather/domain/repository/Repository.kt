package com.erikmedina.cityweather.domain.repository

import com.erikmedina.cityweather.data.remote.model.Group

interface Repository {

    interface Callback {

        fun onSuccess(group: Group)

        fun onError(throwable: Throwable)
    }

    fun getCitiesTemperature(citiesIds: IntArray, callback: Repository.Callback)
}
