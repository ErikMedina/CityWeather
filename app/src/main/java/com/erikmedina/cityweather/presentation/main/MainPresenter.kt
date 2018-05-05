package com.erikmedina.cityweather.presentation.main

import com.erikmedina.cityweather.domain.interactor.main.GetCitiesTemperatureInteractor
import javax.inject.Inject

class MainPresenter
@Inject
constructor() : MainContract.Presenter, GetCitiesTemperatureInteractor.Callback {

    private var view: MainContract.View? = null

    override fun takeView(view: MainContract.View) {
        this.view = view
    }

    override fun dropView() {
        view = null
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
