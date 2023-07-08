package com.rt.kotlinhandson.examples.inheritance

open class Person(var name: String, age: Int) {
    //In Kotlin, all classes are by default final and can't be subclassed.
    // The class needs to be made open to be extended.
    init {
        //init block is called when the Person class is instantiated
        println("Init block - $name's age is $age")
    }

    fun walk() {
        println("$name can walk")
    }

    fun talk() {
        println("$name can talk")
    }
}