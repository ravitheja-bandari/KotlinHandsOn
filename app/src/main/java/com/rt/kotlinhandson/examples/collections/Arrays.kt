package com.rt.kotlinhandson.examples.collections

data class User (var id: Int)
fun main () {
    val intArray1:IntArray = intArrayOf(1,1,2,4,5,54)
    val intArray2 = intArrayOf(1,1,2,4,6,54)
    val intArray3 = arrayOf(1,1,2,4,56,4)
    val array4 = arrayOf(1,"Ravi",2.0,-4,true)

    println(intArray1.contentToString())
    println(intArray2.contentToString())
    println(array4.contentToString())

    for(item in intArray3){
        println("prints all items")
        print(item)
        println("prints all items")
        print("$item")
        println("prints all items with a suffix as +2")
        print("$item + 2")
        println("adds 2 to all items and prints")
        print("${item + 2}")
    }

    data class Fruit(var name:String)
    var fruits = arrayOf(
        Fruit("Apple"),
        Fruit("Banana"),
        Fruit("Kiwi"),
        Fruit("Orange"))

    print(fruits.contentToString())

    for(index in fruits.indices){
        println("${fruits[index].name}")
    }
    for(fruit in fruits){
        println("${fruit.name}")
    }
    for(fruit in fruits){
        println("$fruit")
    }
}