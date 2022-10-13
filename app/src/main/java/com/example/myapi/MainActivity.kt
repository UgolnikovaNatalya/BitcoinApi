//package com.example.myapi
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.util.Log
//import by.kirich1409.viewbindingdelegate.viewBinding
//import com.example.myapi.databinding.ActivityMainBinding
//import com.example.myapi.recycler.RequestsAdapter
//import com.example.myapi.recycler.getRequests
//
//class MainActivity : AppCompatActivity() {
//
//    private val viewBinding by viewBinding(
//        ActivityMainBinding :: bind,
//        R.id.root
//    )
//
////    private val repository = RequestsList()
//    private val adapter = RequestsAdapter()
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        val adapter = RequestsAdapter()
//        viewBinding.requestRecycler.adapter = adapter
//
//        viewBinding.btnRequest.setOnClickListener {
//            load()
//        }
//
//    }
//
////    private fun load() {
////        adapter.sendRequest(onSuccess = {coinInfo->
////            ui{
////                viewBinding.currentRequest.text = coinInfo.bpi.eur.rate
////            }
////            adapter.showList(getRequests())
////        }, onError = {
////            Log.e("Error", "Problem!")
////        })
////        repository.sendRequest(onSuccess = {bitcoinInfo->
////            ui{
////                viewBinding.currentRequest.text = bitcoinInfo.bpi.eur.rate
////                adapter.showList(sen)
////            }
////        }, onError = {
////            Log.e("Error", "Problem!")
////
////        })
//    }
//}