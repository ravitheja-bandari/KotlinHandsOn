package com.rt.kotlinhandson.examples.collections

fun main() {

    var arrayList = ArrayList<String>()
    arrayList.add("Mango")
    arrayList.add("Apple")
    arrayList.add("Banana")
    println(arrayList)

    var array = mutableListOf<String>("Pear", "Kiwi")
    arrayList.addAll(array)
    println(arrayList)

    var newArrayList = ArrayList<String>(2)
    newArrayList.add("Guava")
    println(newArrayList.size) // returns current number of elements in the list
    newArrayList.add("Grapes")
    newArrayList.add("Orange")//you can still add more and the size gets auto-extended
    println(newArrayList)
    println(newArrayList.size)

    var iterator = arrayList.iterator()
    while (iterator.hasNext()) {
        println(iterator.next())
//        iterator.remove()
//        println(arrayList.size)
    }

    for (item in arrayList) {
        println(item)
    }

    for (i in 0 until arrayList.size) {
        println(arrayList.get(i))
        println(arrayList[i])
    }
    arrayList.clear()
    println(arrayList.size)

    /*Please write a program that adds five Numbers (Double)
    to an arrayList and then calculates the average of those numbers.
    Please use a for (in) loop in this exercise.*/

    val doubleList = ArrayList<Double>()
    doubleList.add(1.0)
    doubleList.add(2.0)
    doubleList.add(3.0)
    doubleList.add(4.0)
    doubleList.add(5.0)

    var sum = 0.0
    for (i in 0 until doubleList.size) {
        sum += doubleList[i]
    }
    println(sum / doubleList.size)

}