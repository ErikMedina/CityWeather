package com.erikmedina.cityweather.presentation.main

import android.os.Bundle
import com.erikmedina.cityweather.MyApplication
import com.erikmedina.cityweather.R
import com.erikmedina.cityweather.di.component.DaggerMainComponent
import com.erikmedina.cityweather.di.module.MainModule
import com.erikmedina.cityweather.presentation.BaseActivity

class MainActivity : BaseActivity(), MainContract.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun initializeDependencyInjector() {
       val component = DaggerMainComponent.builder()
                .myApplicationComponent((application as MyApplication).getComponent())
                .mainModule(MainModule())
                .build()
        component.inject(this)
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }
}
