package com.erikmedina.cityweather.data.remote.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class Listing {

    @SerializedName("coord")
    @Expose
    var coord: Coord? = null
    @SerializedName("sys")
    @Expose
    var sys: Sys? = null
    @SerializedName("weather")
    @Expose
    var weather: List<Weather> = emptyList()
    @SerializedName("main")
    @Expose
    var main: Main? = null
    @SerializedName("visibility")
    @Expose
    var visibility: Int? = null
    @SerializedName("wind")
    @Expose
    var wind: Wind? = null
    @SerializedName("clouds")
    @Expose
    var clouds: Clouds? = null
    @SerializedName("dt")
    @Expose
    var dt: Int? = null
    @SerializedName("id")
    @Expose
    var id: Int? = null
    @SerializedName("name")
    @Expose
    var name: String = ""
}
