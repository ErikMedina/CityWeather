package com.erikmedina.cityweather.domain.repository

interface Repository {

    fun getCitiesTemperature(citiesIds: IntArray)
}
