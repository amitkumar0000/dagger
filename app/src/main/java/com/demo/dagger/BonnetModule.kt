package com.demo.dagger

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class BonnetModule(@Color val color:String,@Shape val shape:String,@Size val size:Int) {

  @ActivityScope
  @Provides
  fun provideBonnet():Bonnet{
    return Bonnet(color,shape,size)
  }

}