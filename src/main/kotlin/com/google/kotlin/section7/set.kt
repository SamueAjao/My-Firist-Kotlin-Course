package com.google.kotlin.section7

fun main(args: Array<String>) {
    //Set contains unique elements, say 34,12,6,2,5,9,9,9,8. 9 is unique, as it is 3 time
    //immutable set:Fixed size, immutable READ

    val mySet:Set <Int> = setOf<Int> (34, 12, 6, 2, 9, 9, 9, 8)
    for (num: Int in mySet) {
        println(num)
    }

    println ()
//Mutable Set: No fixed size, READ and WRITE both

    var myMutableSet:MutableSet<Int> = mutableSetOf<Int>(34, 12, 6, 2, 9, 9, 9, 8)
    myMutableSet.add(90)
    myMutableSet.remove(12)
    for (num in myMutableSet){
        println(num)
    }
}