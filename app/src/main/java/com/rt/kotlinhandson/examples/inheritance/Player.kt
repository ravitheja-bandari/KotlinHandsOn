package com.rt.kotlinhandson.examples.inheritance

class Player(name:String, age: Int): Person(name,age) {

    init {
        //init block is called when the Player class is instantiated
        println("Player Init block - $name is a player")
    }
    fun play(){
        println("$name can play")
    }
}