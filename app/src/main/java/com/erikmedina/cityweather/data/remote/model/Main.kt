package com.erikmedina.cityweather.data.remote.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class Main {

    @SerializedName("temp")
    @Expose
    var temp: Float? = null
    @SerializedName("pressure")
    @Expose
    var pressure: Float? = null
    @SerializedName("humidity")
    @Expose
    var humidity: Float? = null
    @SerializedName("temp_min")
    @Expose
    var tempMin: Float? = null
    @SerializedName("temp_max")
    @Expose
    var tempMax: Float? = null

}
