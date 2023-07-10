package com.rt.kotlinhandson.examples.constructors

//protected var a = 10
internal var z = 10
class Car : Vehicle {

    constructor(name: String) : super(name, year = 1999) {

    }

    override var a = 10
    fun accessingVariables(){
        var car = Car("Benz")
        println(a) // public
//        println(c.b) // private
        println(car.c) // protected
        println(car.d) // internal
        println(z) // internal top-level declaration
    }

}