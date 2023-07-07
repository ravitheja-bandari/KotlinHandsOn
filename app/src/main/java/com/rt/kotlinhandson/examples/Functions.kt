package com.rt.kotlinhandson.examples

fun main() {

//Functions are used to perform certain actions, aka methods

    //Calling myFirstFunction method
    myFirstFunction()
    myFirstFunction("Ravi", 32)
    val sum = performSum(3, 5)
    println(sum)
    println(multiply(10, 5))
}

//The below function prints a line
fun myFirstFunction() {
    println("Hello Ravi")
}

//myFirstFunction prints the name and age passed to it
fun myFirstFunction(name: String, age: Int) {
    println("Hello " + name)
    println("My age is $age")
}

// returns the sum of the two numbers
fun performSum(num1: Int, num2: Int): Int {
    return num1 + num2
}

// returns the product of the two numbers
fun multiply(num1: Int, num2: Int) = num1 * num2
