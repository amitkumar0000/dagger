package com.demo.dagger

import android.app.Application

class App: Application() {

  lateinit var components:AppComponents

  override fun onCreate() {
    super.onCreate()

    components = DaggerAppComponents.create()

  }

}