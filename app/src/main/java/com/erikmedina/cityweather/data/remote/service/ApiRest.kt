package com.erikmedina.cityweather.data.remote.service

import com.erikmedina.cityweather.data.remote.model.Group
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * The API for all the requests of the application
 */
interface ApiRest {

    @GET("data/2.5/group")
    fun getCurrentCitiesTemperature(@Query("appid")appId: String,
                                    @Query("id")id: String,
                                    @Query("units")units: String
    ): Call<Group>
}
