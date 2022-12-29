package com.google.kotlin.section6

fun main(args:Array <String>){

 // WAP to reverse a string and print it "Hello"
    reversedAndDisplay("Hello", {str->str.reversed( ) })
    reversedAndDisplay("Hello", {it.reversed()})  //str->str.reversed
    reversedAndDisplay("Hello",{it.reversed()})  //same as above
}

fun reversedAndDisplay(str:String, myFunc:(String)->String) {
     val result = myFunc(str)  //str.reversed ( ) ==> "Hello".reversed () ==> olleh
    println(result)
}