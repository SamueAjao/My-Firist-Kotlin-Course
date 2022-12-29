package com.google.kotlin.section7

 fun main(args: Array<String>) {
     //mutable List: NO FIXED SIZE, READ and WRITE
     //INDEX:

     // var namesList = mutableListOf<String> ("Peter", "Sam", "Alex")
     var namesList = arrayListOf<String>("Peter", "Sam","Alex")      //same as above

     namesList.add ("Austin")     //3
     namesList.add ("Teena")      //4

     //namesList.removeAt(1)         //Remove element of index of 1
     //namesList.remove("Sam")      //Remove "Sam" from List

     namesList [2] = "Christina"         //Replace element at index 2 by "Christian"

     //namesList.clear( )              //Delete all elements of List

     for(name in namesList) {
         println(name)
     }
 }