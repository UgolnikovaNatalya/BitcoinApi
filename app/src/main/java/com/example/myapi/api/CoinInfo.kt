package com.example.myapi.api

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CoinInfo(
    @Json(name = "chartName") val chartName: String,
    @Json(name = "disclaimer") val disclaimer: String,
    @Json(name = "bpi") val bpi : Bpi
    )

@JsonClass(generateAdapter = true)
data class Bpi(
    @Json(name = "USD") val usd : CurrentPrice,
    @Json(name = "GBP") val gbp : CurrentPrice,
    @Json(name = "EUR") val eur : CurrentPrice,
)

@JsonClass(generateAdapter = true)
data class CurrentPrice (
    @Json(name = "code") val code : String,
    @Json(name = "symbol") val symbol : String,
    @Json(name = "rate") val rate : String,
)
