package com.erikmedina.cityweather.presentation.main

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.erikmedina.cityweather.MyApplication
import com.erikmedina.cityweather.R
import com.erikmedina.cityweather.data.local.model.City
import com.erikmedina.cityweather.di.component.DaggerMainComponent
import com.erikmedina.cityweather.di.module.MainModule
import com.erikmedina.cityweather.presentation.BaseActivity
import com.erikmedina.cityweather.presentation.main.adapter.CityAdapter
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : BaseActivity(), MainContract.View {

    @Inject
    lateinit var presenter: MainPresenter

    private lateinit var adapter: CityAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = CityAdapter()
        recycler.adapter = adapter
        recycler.layoutManager = LinearLayoutManager(this)
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
        presenter.getCitiesTemperature()
    }

    override fun onPause() {
        super.onPause()
        presenter.dropView()
    }

    override fun setCities(cities: List<City>) {
        adapter.setCities(cities)
    }
}
