package com.erikmedina.cityweather.data.remote.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class Weather {

    @SerializedName("id")
    @Expose
    var id: Int? = null
    @SerializedName("main")
    @Expose
    var main: String = ""
    @SerializedName("description")
    @Expose
    var description: String = ""
    @SerializedName("icon")
    @Expose
    var icon: String? = null
}
