package com.demo.dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

  lateinit @Inject
  var car1: Car

  lateinit @Inject
  var car2: Car

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    var components = (applicationContext as App).components
      .activityComponent(
        DieselEngineModule(100),
        BonnetModule("Red", "Circle", 12)
      )


    components.inject(this)

    car1.drive()
    car2.drive()
  }
}
