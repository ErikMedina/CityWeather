package com.erikmedina.cityweather.domain.repository

import com.erikmedina.cityweather.data.remote.service.ApiRest
import com.erikmedina.cityweather.data.remote.service.RetrofitFactory
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RepositoryImpl
@Inject
constructor(retrofitFactory: RetrofitFactory) : Repository {

    val TAG = RepositoryImpl::class.java.simpleName
    val APP_ID = "26fb9eeb3fee7b3a36850be40b789f2f"
    val METRIC = "metric"

    private val apiRest: ApiRest = retrofitFactory.createWebService()

    override fun getCitiesTemperature(citiesIds: ArrayList<Int>) {
        apiRest.getCurrentCitiesTemperature(APP_ID, citiesIds, METRIC)
    }
}
