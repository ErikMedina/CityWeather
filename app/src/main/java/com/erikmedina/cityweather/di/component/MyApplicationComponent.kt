package com.erikmedina.cityweather.di.component

import android.content.Context
import com.erikmedina.cityweather.MyApplication
import com.erikmedina.cityweather.data.remote.service.ApiRest
import com.erikmedina.cityweather.di.module.MyApplicationModule
import com.erikmedina.cityweather.di.qualifier.MyApplicationContext
import com.erikmedina.cityweather.domain.repository.Repository
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [(MyApplicationModule::class)])
interface MyApplicationComponent {

    @get:MyApplicationContext
    val context: Context

    val myApplication: MyApplication

    val repository: Repository

    val apiRest: ApiRest

    fun inject(myApplication: MyApplication)

}