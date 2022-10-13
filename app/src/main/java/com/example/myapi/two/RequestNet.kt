package com.example.myapi.two

import com.example.myapi.api.CoinInfo
import com.example.myapi.api.NetworkModule
import kotlin.concurrent.thread


class RequestNet () {

    val requestsList = mutableListOf<CoinInfo>()

    fun sendRequest(onSuccess: (CoinInfo) -> Unit, onError: (String) -> Unit){
        thread {
            val api = NetworkModule.api //создаем запрос
            val request = api.showInfo() //отправляем
            val response = request.execute() //пулчаем обратно с body
            val body = response.body()

            if (response.isSuccessful && body != null) { //проверка на ноль
                onSuccess(body)
                requestsList.add(body)
            } else{
                onError(response.errorBody().toString())
            }
        }
    }
}