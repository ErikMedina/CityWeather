package com.erikmedina.cityweather.presentation

import android.support.v7.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    protected abstract fun initializeDependencyInjector()

    fun showLoading() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun hideLoading() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun showError(error: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}