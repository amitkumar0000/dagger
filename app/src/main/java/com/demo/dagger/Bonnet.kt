package com.demo.dagger

import javax.inject.Inject

// We don't own this class so can't annonate with @inject
class Bonnet constructor(val color:String,val shape:String,val size:Int) {
}