package com.rt.kotlinhandson.examples.collections

fun main(){
    val fruits = setOf<String>("Apple", "Mango","Apple", "Grapes")
    println(fruits)
    println(fruits.sorted())
    println(fruits.toSortedSet())

    val moreFruits = fruits.toMutableSet()
    moreFruits.add("Pear")
    moreFruits.add("Pear")
    moreFruits.add("Guava")
    println(moreFruits)
    println(moreFruits.sorted())
    println(moreFruits.sortedDescending())
    println(moreFruits.distinct())
    println(moreFruits.size)
    println(moreFruits.remove("Pear"))
    println(moreFruits.elementAt(1))
    println(moreFruits.elementAtOrNull(10))
}