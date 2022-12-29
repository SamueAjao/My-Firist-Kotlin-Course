package com.google.kotlin.section7

fun main(args:Array<String>){
    //immutable Map
    var myMap = mapOf<Int, String>(2 to "USA", 5 to "India", 1 to "China")
    for (key:Int in myMap.keys){
        println(myMap.get(key))     //myMap[key]
    }

    println( )

    //mutable Map

    val myMutableMap = mutableMapOf <Int, String>()
       myMutableMap.put(2,"USA")
       myMutableMap.put(5, "India")
       myMutableMap.put(1, "China")

    //myMutableMap.remove (5)

    for(key in myMutableMap.keys) {
        println(myMutableMap.get(key))    //myMutablemap[key]
    }
}
