package com.rt.kotlinhandson.examples.inheritance

class Teacher(name: String, age: Int): Person(name,age) {

    fun teach(){
        println("$name can teach")
    }
}