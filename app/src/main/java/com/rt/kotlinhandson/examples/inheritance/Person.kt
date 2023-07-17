package com.rt.kotlinhandson.examples.inheritance

open class Person(var _name: String, age: Int = 10) {
    //In Kotlin, all classes are by default final and can't be subclassed.
    // The class needs to be made open to be extended.
    init {
        //init block is called when the Person class is instantiated
        println("Init block - $_name's age is $age")
    }

    fun walk() {
        println(this._name +" can walk")
    }

    fun talk() {
        println("$_name can talk")
    }
}