package com.erikmedina.cityweather.di.component

import android.content.Context
import com.erikmedina.cityweather.MyApplication
import com.erikmedina.cityweather.di.module.MyApplicationModule
import com.erikmedina.cityweather.di.qualifier.MyApplicationContext
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [(MyApplicationModule::class)])
interface MyApplicationComponent {

    @get:MyApplicationContext
    val context: Context

    val myApplication: MyApplication

    fun inject(myApplication: MyApplication)

}