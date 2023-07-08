package com.rt.kotlinhandson.examples.inheritance

class Player(var n:String, age: Int): Person(n,age) {

    init {
        //init block is called when the Player class is instantiated
        println("Player Init block - $n is a player")
    }
    fun play(){
        println("$n can play")
    }
}