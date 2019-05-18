package com.demo.dagger

import android.util.Log
import javax.inject.Inject

class DieselEngine @Inject constructor(val horsePower:Int) : Engine {
  override fun start() {
    Log.d("Dagger "," Diesel Car started with horsePower:: $horsePower")
  }
}