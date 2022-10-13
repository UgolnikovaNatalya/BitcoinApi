package com.example.myapi.api.classes


import com.squareup.moshi.Json

data class AllApi(
    @Json(name = "bpi")
    val bpi: Bpi = Bpi(),
    @Json(name = "chartName")
    val chartName: String = "",
    @Json(name = "disclaimer")
    val disclaimer: String = "",
    @Json(name = "time")
    val time: Time = Time()
)