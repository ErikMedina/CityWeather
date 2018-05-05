package com.erikmedina.cityweather.data.remote.service

/**
 * The API for all the requests of the application
 */
interface ApiRest {

    fun getCurrentCitiesTemperature(appId: String, citiesIds: ArrayList<Int>, units: String)
}
