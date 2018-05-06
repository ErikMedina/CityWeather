package com.erikmedina.cityweather.presentation.main

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.view.View
import com.erikmedina.cityweather.MyApplication
import com.erikmedina.cityweather.R
import com.erikmedina.cityweather.data.local.model.City
import com.erikmedina.cityweather.di.component.DaggerMainComponent
import com.erikmedina.cityweather.di.module.MainModule
import com.erikmedina.cityweather.presentation.BaseActivity
import com.erikmedina.cityweather.presentation.citydetail.CityDetailActivity
import com.erikmedina.cityweather.presentation.main.adapter.CityAdapter
import com.erikmedina.cityweather.util.Constant
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : BaseActivity(), MainContract.View {

    @Inject
    lateinit var presenter: MainPresenter

    private lateinit var context: Context

    private lateinit var adapter: CityAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        context = this
        initializeRecycler()
    }

    override fun getLayoutId() = R.layout.activity_main

    private fun initializeRecycler() {
        adapter = CityAdapter(object : CityAdapter.OnItemClickListener {
            override fun onItemClick(city: City) {
                Log.i(TAG, "[onItemClick] city selected: ${city.name}")
                val intent = Intent(context, CityDetailActivity::class.java)
                    intent.putExtra(Constant.EXTRA_CITY, city)
                startActivity(intent)
            }
        })
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

    override fun showError(error: String) {
        val rootView = window.decorView.findViewById<View>(android.R.id.content)
        Snackbar.make(rootView, error, Snackbar.LENGTH_SHORT).show()
    }

    companion object {
        val TAG = MainActivity::class.java.simpleName.toString()
    }
}
