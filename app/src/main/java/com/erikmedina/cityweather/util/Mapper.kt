package com.erikmedina.cityweather.util

import com.erikmedina.cityweather.data.local.model.City
import com.erikmedina.cityweather.data.remote.model.Group

object Mapper {

    fun map(group: Group): List<City> {
        val listing = group.listing
        val cities = ArrayList<City>()
        for (item in listing) {
            val city = City(
                    name = item.name,
                    weather = item.weather[0].main,
                    weatherDescription = item.weather[0].description,
                    temp = item.main?.temp.toString(),
                    tempMin = item.main?.tempMin.toString(),
                    tempMax = item.main?.tempMax.toString(),
                    windSpeed = item.wind?.speed.toString(),
                    windDegree = item.wind?.deg.toString()
            )
            cities.add(city)
        }
        return cities
    }
}
