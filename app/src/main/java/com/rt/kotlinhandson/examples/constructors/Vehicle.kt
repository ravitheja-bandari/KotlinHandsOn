package com.rt.kotlinhandson.examples.constructors

open class Vehicle {

    public open var a = 10 // visible all over the project
    private var b = 5 // visible only in this declared class
    protected open var c = 3 // visible only in this and derived classes
    internal open var d = 4 // visible in derived classes

    private var year: Int = 0

    private var name: String = ""
        //getters and setters are by default created in kotlin
        get() = field
        set(value) {
            field = value
        }

    //Overrides the defined primary constructor at class level
    constructor(name: String, year: Int) {
        println("inside vehicle constructor block")

        this.name = name
        this.year = year
    }

    constructor()

    //Declaring default values in the constructor
    //primary constructor
    init {
        println("inside vehicle init block")
        println("$name built in $year")
    }

    fun drive() {
        println("$name is a vehicle to drive from $year")
    }

}