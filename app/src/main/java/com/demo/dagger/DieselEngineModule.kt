package com.demo.dagger

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule(val horsePower:Int) {

  @Provides
  fun providesHorsePower():Int{
    return horsePower
  }

  @Provides
  fun ProvidesDieselEngine(dieselEngine:DieselEngine):Engine{
    return dieselEngine
  }


}