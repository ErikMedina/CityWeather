package com.erikmedina.cityweather.presentation.main

import android.os.Bundle
import com.erikmedina.cityweather.MyApplication
import com.erikmedina.cityweather.R
import com.erikmedina.cityweather.di.component.DaggerMainComponent
import com.erikmedina.cityweather.di.module.MainModule
import com.erikmedina.cityweather.presentation.BaseActivity
import javax.inject.Inject

class MainActivity : BaseActivity(), MainContract.View {

    @Inject
    lateinit var presenter: MainPresenter

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
        presenter.takeView(this)
    }

    override fun onPause() {
        super.onPause()
        presenter.dropView()
    }
}
