package com.demo.dagger

import android.util.Log
import javax.inject.Inject

/**
 *  Dagger Injection work in order
 *  Constructor Injection -> Field Injection -> Method Injection
 *  Constructor Injection is must to follow
 */
@ActivityScope
class Car @Inject constructor( val wheels: Wheels){

  @Inject lateinit var engine:Engine
  @Inject lateinit var driver:Driver
  @Inject lateinit var bonnet:Bonnet

  fun drive(){
    engine.start()
    Log.d("Dagger", "$driver Driving....$this   ${bonnet.color} color ${bonnet.shape} shape ${bonnet.size} size ")
  }

  @Inject
  fun enableRemote(remote: Remote){
    remote.setListener()
  }
}