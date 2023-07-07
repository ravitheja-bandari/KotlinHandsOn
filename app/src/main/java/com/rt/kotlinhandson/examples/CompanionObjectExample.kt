package com.rt.kotlinhandson.examples

import android.util.Log

class CompanionObjectExample (var id:Int, var name:String) {

    companion object nameOfTheObject{
        // @JvmStatic To be used if the variables inside companion block
        // needs be accessed from another java class
        @JvmStatic
        var company: String = "tesla"
    }

    fun logValues(){
        Log.d("id","-> $id")
        Log.d("name","-> " + name)
        logValuesOutSide()
    }

}

fun logValuesOutSide(){
    Log.d("company", "-> " + CompanionObjectExample.company)
    Log.d("company", "-> " + CompanionObjectExample.company)

    //if name of the companion object is not provided the variables can be accessed using
    // ClassName.Companion.VariableName as shown below
    //Log.d("company", "-> " +CompanionObjectExample.Companion.company)

}