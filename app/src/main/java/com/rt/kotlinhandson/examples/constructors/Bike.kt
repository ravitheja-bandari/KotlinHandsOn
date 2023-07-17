package com.rt.kotlinhandson.examples.constructors

class Bike: Vehicle {

    constructor(_name: String, _year: Int, type: String) : super(_name,_year) {
        println("3")
    }

    constructor(s: String, _year: Int) : super(s, _year){
        println("2")
    }

}