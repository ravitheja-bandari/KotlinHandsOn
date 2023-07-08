package com.rt.kotlinhandson.examples.inheritance


fun main() {

    var teacher:Teacher = Teacher("Ravi",32)
    teacher.walk()
    teacher.talk()
    teacher.teach()

    // defining the type of the object is optional
    val player = Player("John", 23) // init block of person and player will be executed
    player.walk()
    player.talk()
    player.play()
}
