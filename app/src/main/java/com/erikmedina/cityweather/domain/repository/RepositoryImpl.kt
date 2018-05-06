package com.erikmedina.cityweather.domain.repository

import android.util.Log
import com.erikmedina.cityweather.data.remote.model.Group
import com.erikmedina.cityweather.data.remote.service.ApiRest
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Singleton

@Singleton
class RepositoryImpl constructor(private val apiRest: ApiRest) : Repository {

    override fun getCitiesTemperature(citiesIds: IntArray) {
        Log.i(TAG, "[getCitiesTemperature]")
        val call = apiRest.getCurrentCitiesTemperature(APP_ID, convertIdsToString(citiesIds), METRIC)
        call.enqueue(object : Callback<Group> {
            override fun onResponse(call: Call<Group>?, response: Response<Group>) {
                if (response.isSuccessful) {
                    Log.i(TAG, response.toString())
                }
            }

            override fun onFailure(call: Call<Group>?, t: Throwable?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

        })
    }

    private fun convertIdsToString(citiesIds: IntArray): String {
        var idsString = ""
        for (cityId in citiesIds) {
            idsString += "$cityId,"
        }
        idsString = idsString.substring(0, idsString.length - 1)
        return idsString
    }

    companion object {
        val TAG = RepositoryImpl::class.java.simpleName.toString()
        const val APP_ID = "26fb9eeb3fee7b3a36850be40b789f2f"
        const val METRIC = "metric"
    }
}
