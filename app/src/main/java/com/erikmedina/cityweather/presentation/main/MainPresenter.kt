package com.erikmedina.cityweather.presentation.main

import com.erikmedina.cityweather.domain.interactor.main.GetCitiesTemperatureInteractor
import javax.inject.Inject

class MainPresenter
@Inject
constructor() : MainContract.Presenter, GetCitiesTemperatureInteractor.Callback {

    @Inject
    lateinit var interactor: GetCitiesTemperatureInteractor

    private var view: MainContract.View? = null
    private val citiesIds = intArrayOf(3128832, 2648110, 473537, 697959, 614371, 2347078, 2638976, 798544, 2921044, 1016666)

    override fun takeView(view: MainContract.View) {
        this.view = view
    }

    override fun dropView() {
        view = null
    }

    override fun getCitiesTemperature() {
        interactor.run(citiesIds)
    }

    override fun onSuccess() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onError() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    companion object {
        val TAG = MainPresenter::class.java.simpleName
    }
}
