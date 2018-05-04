package com.erikmedina.cityweather.presentation.main

import android.os.Bundle
import com.erikmedina.cityweather.R
import com.erikmedina.cityweather.presentation.BaseActivity

class MainActivity : BaseActivity(), MainContract.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}
