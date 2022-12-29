package com.google.kotlin.section7

fun main (args:Array <String>) {
    val myNumbers = listOf(2, 3, 4, 6, 23, 90)
    val mySquarednums = myNumbers.map { it * it }    //OR num -> num * num

    for (num in mySquarednums) {
        println(num)

        println()
    }

//    WAP to find out the square of all numbers that are smaller than 10

    val mySmallsquarednums = myNumbers.filter { it < 10 }.map { it * it }

    for (num in mySmallsquarednums) {
        println(num)

    }
}