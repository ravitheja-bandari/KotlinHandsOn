package com.rt.kotlinhandson.examples.collections

data class Fruit(var name: String)
fun main() {

    val map = mapOf<String,String>(
        "Ravi" to "SSE",
        "John" to "SE",
        "Kate" to "EM"
    )
    println(map)

    for(key in map.keys)
    {
        println("$key -> ${map.get(key)}")
    }

    val fruitsMap = mapOf<Int, Fruit>(
        1 to Fruit("Mango"),
        2 to Fruit("Pear"),
        3 to Fruit("Grapes")
    )

    println(fruitsMap)
    println(fruitsMap.keys)
    println(fruitsMap.values)

    for (fruit in fruitsMap.keys){
        print(fruitsMap[fruit])
        println(fruitsMap.get(fruit))
    }

    val moreFruits = fruitsMap.toMutableMap()
    moreFruits.set(5, Fruit("Guava"))
    moreFruits[4] = Fruit("Kiwi")
    println(moreFruits.toSortedMap())

}