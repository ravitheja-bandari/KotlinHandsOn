package com.rt.kotlinhandson.examples.constructors

fun main(){

    var car = Car("Mercedes")
    car.drive()
    var bike = Bike("Honda",1999)
    bike.drive()

    var bmw = Vehicle("BMW", 2000)
    bmw.drive()
    //prints default value of the year as it's not passed
    var bajaj = Vehicle("Bajaj", 2001)
    bajaj.drive()

}