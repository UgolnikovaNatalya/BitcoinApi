package com.example.myapi

import android.os.Handler
import android.os.Looper

private val handler = Handler(Looper.getMainLooper())

fun ui(action: () -> Unit) = handler.post(action)