package com.erikmedina.cityweather.data.remote.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class Group {

    @SerializedName("cnt")
    @Expose
    var cnt: Int? = null
    @SerializedName("list")
    @Expose
    var listing: List<Listing> = emptyList()
}
