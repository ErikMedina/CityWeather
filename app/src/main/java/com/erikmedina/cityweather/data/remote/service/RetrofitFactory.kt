package com.erikmedina.cityweather.data.remote.service

import com.erikmedina.cityweather.BuildConfig
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitFactory {

    fun createWebService(): ApiRest {
        val retrofit = Retrofit.Builder()
                .baseUrl(BuildConfig.API_ENDPOINT)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        return retrofit.create(ApiRest::class.java)
    }
}
