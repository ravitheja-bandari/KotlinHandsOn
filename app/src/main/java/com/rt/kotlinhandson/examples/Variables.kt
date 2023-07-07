package com.rt.kotlinhandson.examples


fun main() {
    //Byte -128 to 127
    val b: Byte = 127 //val cannot be changed - is immutable
    println(b)

    //Short -32786 to 32767
    var s: Short = 23456 //var is mutable
    println(s)

    //Int -2147483648 to 2147483647
    var i: Int = 2147483647
    println(i)

    //long -9223372036854775807 to 9223372036854775807
    var l: Long = 9223372036854775807
    var L: Long = 9223372036854775807L
    println(l)
    println(L)

    //float - precision up to 7 decimals
    //Its mandatory to put 'F' at the end for float representation
    // unlike the Long representation
    var f: Float = 3.3443344F
    println(f)

    //double
    var d: Double = 3.3433343455345
    println(d)

    // Boolean
    var bool: Boolean = true
    println(bool)

    //Boolean expression
    var x = 10
    var y = 11
    var z = x > y
    println(z)

    //Character
    var c: Char = 'R'

    print("Ravi")
}
