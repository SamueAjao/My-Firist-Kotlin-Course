package com.google.kotlin.section7

fun main(args:Array<String>) {
    //  Arrays Tutorial
    //  Elements: 0  0  0  0  0
    //  Index:    0  1  2  3  4

    var numbers = Array<Int>(5) { 0 }     // fixed size and mutable (READ AND WRITE)

    numbers[2] = 54            //mutable property, change element on index 2 to 54
    numbers[4] = 31

    for (num in numbers) {                   //MUCH SIMPLIER METHOD
        println(num)
    }

    //OR
    println ( )
    for (index in 0..numbers.size - 1) {

        println(numbers[index])
    }


}