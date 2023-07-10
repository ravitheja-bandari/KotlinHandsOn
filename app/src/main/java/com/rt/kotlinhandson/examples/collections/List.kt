package com.rt.kotlinhandson.examples.collections

fun main(){

    val list1 = listOf<String>("A", "B", "C")
    println(list1)
    //lists are by default immutable; hence cannot add new elements
    //In order to add, the list needs to be converted to mutable list
//    var uList = list1 as MutableList<String>
//    uList.add("D")
//    println(uList)
    var list2 = list1.toMutableList()
    list2.add("D")
    println(list2)
    var array = arrayOf("E","F","G")
    list2.addAll(array)
    println(list2)
    //A mutable list can also be created by default
    var mList = mutableListOf<String>("H", "I", "J")
    mList.add("K")
    println(mList)
    mList.addAll(array)
    println(mList)

    /*Update Elements in a list*/
    mList.add(1,"Z") //Updates element in 1st index
    mList[2] = "Y" //Updates element in 2nd index
    println(mList)
    mList.set(3,"X")
    println(mList)

    /*Remove Elements from a list*/
    mList.removeAt(1)
    println(mList)
    mList.removeAll(array)
    println(mList)



}