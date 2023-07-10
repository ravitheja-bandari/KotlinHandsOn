package com.rt.kotlinhandson.examples.lambda

fun main() {
    /*lambda expressions are functions without a name
    Functions that are not declared but passed as an expression
    Syntax: {Variables -> function body}*/

    //Lambda expression can be declared as
    var sum: (Int, Int) -> Int = { a: Int, b: Int -> a + b }
    println(sum(1, 2))
    //OR
    sum = { a: Int, b: Int -> a + b }
    println(sum(3, 2))
    //OR
    sum = { a, b -> a + b }
    println(sum(3, 5));
    //OR
    val product = { a: Int, b: Int -> println(a * b) }
    product(3, 5)
}