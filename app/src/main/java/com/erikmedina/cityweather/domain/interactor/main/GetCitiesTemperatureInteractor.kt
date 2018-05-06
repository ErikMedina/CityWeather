package com.erikmedina.cityweather.domain.interactor.main

import com.erikmedina.cityweather.data.remote.model.Group
import com.erikmedina.cityweather.domain.interactor.base.Interactor

interface GetCitiesTemperatureInteractor : Interactor {

    interface Callback {

        fun onSuccess(group: Group)

        fun onError()
    }

    fun run(citiesIds: IntArray, callback: Callback)
}
