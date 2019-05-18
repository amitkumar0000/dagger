package com.demo.dagger

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class PetrolEngineModule {

  @Binds
  abstract fun bindEngine(petrolEngine: PetrolEngine):Engine

}
