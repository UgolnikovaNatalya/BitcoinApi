package com.example.myapi.api.classes


import com.squareup.moshi.Json

data class Bpi(
    @Json(name = "EUR")
    val eUR: EUR = EUR(),
    @Json(name = "GBP")
    val gBP: GBP = GBP(),
    @Json(name = "USD")
    val uSD: USD = USD()
)