package com.erikmedina.cityweather.di.component

import com.erikmedina.cityweather.di.module.MainModule
import com.erikmedina.cityweather.di.qualifier.PerActivity
import com.erikmedina.cityweather.presentation.main.MainActivity
import dagger.Component

@PerActivity
@Component(dependencies = [(MyApplicationComponent::class)], modules = [(MainModule::class)])
interface MainComponent {

    fun inject(mainActivity: MainActivity)
}
