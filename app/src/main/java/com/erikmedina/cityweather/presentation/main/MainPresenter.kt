package com.erikmedina.cityweather.presentation.main

import com.erikmedina.cityweather.domain.interactor.main.GetCitiesTemperatureInteractor
import javax.inject.Inject

class MainPresenter
@Inject
constructor() : MainContract.Presenter, GetCitiesTemperatureInteractor.Callback {

    override fun takeView(view: MainContract.View) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun dropView() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onSuccess() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onError() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
