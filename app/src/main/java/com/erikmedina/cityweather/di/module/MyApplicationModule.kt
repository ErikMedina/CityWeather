package com.erikmedina.cityweather.di.module

import android.content.Context
import com.erikmedina.cityweather.MyApplication
import com.erikmedina.cityweather.di.annotation.MyApplicationContext
import com.erikmedina.cityweather.presentation.main.MainPresenter
import dagger.Module
import dagger.Provides

@Module
class MyApplicationModule(private val myApplication: MyApplication) {

    @Provides
    @MyApplicationContext
    internal fun provideContext(): Context {
        return myApplication
    }

    @Provides
    internal fun provideMyApplication(): MyApplication {
        return myApplication
    }

    @Provides
    internal fun providePresenter(): MainPresenter {
        return MainPresenter()
    }
}