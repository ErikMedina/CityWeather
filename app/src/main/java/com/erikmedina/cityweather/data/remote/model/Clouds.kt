package com.erikmedina.cityweather.data.remote.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class Clouds {

    @SerializedName("all")
    @Expose
    var all: Int? = null

}
