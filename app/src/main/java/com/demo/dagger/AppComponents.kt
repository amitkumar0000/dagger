package com.demo.dagger

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component
interface AppComponents {

  fun driver():Driver
  fun activityComponent(dieselEngineModule: DieselEngineModule,bonnetModule: BonnetModule):ActivitySubComponents

}
