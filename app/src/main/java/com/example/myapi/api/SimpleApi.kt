package com.example.myapi.api

import retrofit2.http.GET


interface SimpleApi {
    @GET("v1/bpi/currentprice.json")
    fun showInfo() :retrofit2.Call<CoinInfo>


}
