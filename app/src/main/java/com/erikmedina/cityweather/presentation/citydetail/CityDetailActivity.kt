package com.erikmedina.cityweather.presentation.citydetail

import android.os.Bundle
import com.erikmedina.cityweather.R
import com.erikmedina.cityweather.data.local.model.City
import com.erikmedina.cityweather.presentation.BaseActivity
import com.erikmedina.cityweather.util.Constant
import kotlinx.android.synthetic.main.activity_city_detail.*

class CityDetailActivity : BaseActivity() {

    private lateinit var city: City

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        city = intent.getSerializableExtra(Constant.EXTRA_CITY) as City
        initializeCityDetail()
    }

    private fun initializeCityDetail() {
        name.text = city.name
        weather.text = city.weather
        weatherDescription.text = city.weatherDescription
        tempCurrent.text = city.temp
        tempMin.text = city.tempMin
        tempMax.text = city.tempMax
        windSpeed.text = city.windSpeed
        windDegree.text = city.windDegree
    }

    override fun getLayoutId() = R.layout.activity_city_detail

    override fun initializeDependencyInjector() {
        //TODO: we have to create the Dagger module for this activity so we can inject the presenter, interactors,...
    }
}
