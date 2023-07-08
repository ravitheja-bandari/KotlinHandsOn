package com.rt.kotlinhandson.examples.constructors

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
    }

}