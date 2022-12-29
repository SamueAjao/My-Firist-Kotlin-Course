package com.google.kotlin.section3

fun main(args: Array<String>) {
    // WAP Add number p = 2 and q = 5
    val r1 = add( 2, 5)
    println("The result is $r1")

    // WAP Add number p = 10 and q = 30
    val r2 = add( 10, 30)
    println("The result is $r2")
}

fun add (p:Int, q:Int):Int {
     return p + q
}