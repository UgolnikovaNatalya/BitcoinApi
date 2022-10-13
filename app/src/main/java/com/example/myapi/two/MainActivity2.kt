package com.example.myapi.two

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.myapi.R
import com.example.myapi.databinding.ActivityMainBinding
import com.example.myapi.ui

class MainActivity2 : AppCompatActivity() {

    private val viewBinding by viewBinding(
        ActivityMainBinding :: bind,
        R.id.root
    )

    private val repository = RequestNet()
    private val adapter = RequestsAdapter2()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewBinding.requestRecycler.adapter = adapter
        adapter.showList(repository.requestsList)

        viewBinding.btnRequest.setOnClickListener {
            load()
        }

    }

    private fun load() {
        repository.sendRequest(onSuccess = {bitcoinInfo->
            ui{
                viewBinding.currentRequest.text = bitcoinInfo.bpi.eur.rate
                adapter.showList(repository.requestsList)
            }

        }, onError = {
            Log.e("Error", "Problem!")

        })
    }
}