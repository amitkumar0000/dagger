package com.demo.dagger

import android.util.Log
import javax.inject.Inject

class Remote @Inject constructor() {

  fun setListener() {
    Log.d("Dagger"," Remote Connected")

  }
}