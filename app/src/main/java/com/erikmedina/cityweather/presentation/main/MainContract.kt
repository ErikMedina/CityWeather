package com.erikmedina.cityweather.presentation.main

import com.erikmedina.cityweather.presentation.BasePresenter
import com.erikmedina.cityweather.presentation.BaseView

/**
 * This interface specifies the contract between the view and the presenter.
 */

interface MainContract {

    interface View : BaseView<Presenter> {

    }

    interface Presenter : BasePresenter<View> {

    }
}