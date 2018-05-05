package com.erikmedina.cityweather.domain.repository

import android.util.Log
import com.erikmedina.cityweather.data.remote.service.ApiRest
import javax.inject.Singleton

@Singleton
class RepositoryImpl constructor(private val apiRest: ApiRest) : Repository {

    override fun getCitiesTemperature(citiesIds: IntArray) {
        Log.i(TAG, "[getCitiesTemperature]")
        apiRest.getCurrentCitiesTemperature(APP_ID, citiesIds, METRIC)
    }

    companion object {
        val TAG = RepositoryImpl::class.java.simpleName
        const val APP_ID = "26fb9eeb3fee7b3a36850be40b789f2f"
        const val METRIC = "metric"
    }
}
