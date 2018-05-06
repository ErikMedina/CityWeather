package com.erikmedina.cityweather.data.local.model

import com.erikmedina.cityweather.util.Constant

data class City(val name: String = Constant.UNKNOWN,
                val weather: String = Constant.UNKNOWN,
                val weatherDescription: String = Constant.UNKNOWN,
                val temp: String = Constant.UNKNOWN,
                val tempMin: String = Constant.UNKNOWN,
                val tempMax: String = Constant.UNKNOWN,
                val windSpeed: String = Constant.UNKNOWN,
                val windDegree: String = Constant.UNKNOWN)
