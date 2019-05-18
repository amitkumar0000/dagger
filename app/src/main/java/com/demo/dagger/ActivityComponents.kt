package com.demo.dagger

import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

@ActivityScope
@Component(dependencies = [AppComponents::class],modules = [PetrolEngineModule::class,BonnetModule::class])
interface ActivityComponents {
  fun getCar(): Car
  fun inject(mainActivity: MainActivity)

  @Component.Builder
  interface  Builder{

    @BindsInstance
    fun horsePower(@HorsePower horsePower:Int):Builder

    @BindsInstance
    fun engineCapacity(@EngineCapacity engineCapacity:Int):Builder

    fun appComponent(appComponents: AppComponents):Builder

    fun bonnent(bonnetModule: BonnetModule):Builder

    fun build():ActivityComponents
  }
}