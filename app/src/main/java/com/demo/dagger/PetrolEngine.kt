package com.demo.dagger

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine @Inject constructor(
  @HorsePower val horsePower: Int,
  @EngineCapacity val engineCapacity: Int
) : Engine {

  override fun start() {
    Log.d("Dagger ", " Petrol Engine started with horsePower:: $horsePower $engineCapacity ")
  }
}