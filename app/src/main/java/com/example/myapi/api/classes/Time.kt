package com.example.myapi.api.classes


import com.squareup.moshi.Json

data class Time(
    @Json(name = "updated")
    val updated: String = "",
    @Json(name = "updatedISO")
    val updatedISO: String = "",
    @Json(name = "updateduk")
    val updateduk: String = ""
)