package com.demo.dagger

import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Named

@ActivityScope
@Subcomponent(modules = [DieselEngineModule::class,BonnetModule::class])
interface ActivitySubComponents {
  fun getCar(): Car
  fun inject(mainActivity: MainActivity)

}