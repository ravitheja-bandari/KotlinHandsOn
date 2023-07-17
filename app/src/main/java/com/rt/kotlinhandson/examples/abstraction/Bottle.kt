package com.rt.kotlinhandson.examples.abstraction

//abstract classes cannot be initialised
abstract class Bottle {

    var mfd:Int = 0
    abstract var exp:Int

    fun type(typeOfBottle:String){
        println("Type of bottle is $typeOfBottle")
    }

    //abstract functions have declarations only no definition
    abstract fun price(price:Int)

}