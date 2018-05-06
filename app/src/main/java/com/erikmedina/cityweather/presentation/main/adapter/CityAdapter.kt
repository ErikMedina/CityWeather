package com.erikmedina.cityweather.presentation.main.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.erikmedina.cityweather.R
import com.erikmedina.cityweather.data.local.model.City

class CityAdapter : RecyclerView.Adapter<CityAdapter.ViewHolder>() {

    private var cities = emptyList<City>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_city, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = cities.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.text = cities[position].name
        holder.weather.text = cities[position].weather
        holder.temp.text = "${cities[position].temp}°C"//TODO: inject application context so we can use getString and format the string properly
    }

    fun setCities(cities: List<City>) {
        this.cities = cities
        notifyDataSetChanged()
    }
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var name: TextView = itemView.findViewById(R.id.name)
        var weather: TextView = itemView.findViewById(R.id.weather)
        var temp: TextView = itemView.findViewById(R.id.temp)
    }
}
