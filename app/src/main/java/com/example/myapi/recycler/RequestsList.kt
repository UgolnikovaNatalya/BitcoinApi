//package com.example.myapi.recycler
//
//import com.example.myapi.api.CoinInfo
//import com.example.myapi.api.NetworkModule
//import kotlin.concurrent.thread
//
//data class RequestsList(
//    val request: CoinInfo
//)
//
//fun getRequests(): MutableList<RequestsList> {
//    return getRequests()
//}
//
////    fun sendRequest(onSuccess: (CoinInfo) -> Unit, onError: (String) -> Unit) {
////        val requestsList = mutableListOf<CoinInfo>()
////
////        thread {
////            val api = NetworkModule.api //создаем запрос
////            val request = api.showInfo() //отправляем
////            val response = request.execute() //пулчаем обратно с body
////            val body = response.body()
////
////            if (response.isSuccessful && body != null) { //проверка на ноль
////                onSuccess(body)
////                requestsList.add(body)
////            } else {
////                onError(response.errorBody().toString())
////            }
////        }
////    }
//
////class RequestsList () {
////    val requestsList = mutableListOf<CoinInfo>()
////
////    fun sendRequest(onSuccess: (CoinInfo) -> Unit, onError: (String) -> Unit){
////        thread {
////            val api = NetworkModule.api //создаем запрос
////            val request = api.showInfo() //отправляем
////            val response = request.execute() //пулчаем обратно с body
////            val body = response.body()
////
////            if (response.isSuccessful && body != null) { //проверка на ноль
////                onSuccess(body)
////                requestsList.add(body)
////            } else{
////                onError(response.errorBody().toString())
////            }
////        }
////    }
////}