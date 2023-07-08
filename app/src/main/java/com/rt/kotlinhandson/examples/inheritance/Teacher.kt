package com.rt.kotlinhandson.examples.inheritance

class Teacher(var t: String, age: Int): Person(t,age) {

    fun teach(){
        println("$t can teach")
    }
}