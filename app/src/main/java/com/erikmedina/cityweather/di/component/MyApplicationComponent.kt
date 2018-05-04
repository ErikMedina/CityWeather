package com.erikmedina.cityweather.di.component

import android.content.Context
import com.erikmedina.cityweather.MyApplication
import com.erikmedina.cityweather.di.annotation.MyApplicationContext
import com.erikmedina.cityweather.di.module.MyApplicationModule
import com.erikmedina.cityweather.presentation.main.MainPresenter
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [(MyApplicationModule::class)])
interface MyApplicationComponent {

    @get:MyApplicationContext
    val context: Context

    val myApplication: MyApplication

    val mainPresenter: MainPresenter

    fun inject(myApplication: MyApplication)

}