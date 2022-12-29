package com.google.kotlin.section7

fun main(args:Array<String>){
    var nameslist = listOf<String>("Peter","Sam","Alex")
                               // you cannot add to the list
    for(name in nameslist){
        println(name)
    }

    //OR
    println()
    for(index in 0..nameslist.size-1){
        println(nameslist[index])   //OR namesList.get[Index]
    }
}