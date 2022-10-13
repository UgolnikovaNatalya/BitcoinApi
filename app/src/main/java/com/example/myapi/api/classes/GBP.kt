package com.example.myapi.api.classes


import com.squareup.moshi.Json

data class GBP(
    @Json(name = "code")
    val code: String = "",
    @Json(name = "description")
    val description: String = "",
    @Json(name = "rate")
    val rate: String = "",
    @Json(name = "rate_float")
    val rateFloat: Double = 0.0,
    @Json(name = "symbol")
    val symbol: String = ""
)