package com.erikmedina.cityweather.domain.interactor.main

import com.erikmedina.cityweather.domain.interactor.base.Interactor

interface GetCitiesTemperatureInteractor : Interactor {

    interface Callback {

        fun onSuccess()

        fun onError()
    }

    fun run(citiesIds: ArrayList<Int>)
}
