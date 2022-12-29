package com.google.kotlin.section4

fun main(args:Array<String>){
   //First dog
    var dog1 = Dog( )                          // dog1 is the reference variable and Dog( ) is an object
    dog1.breed = "German Shepard"
    dog1.size = 40
    dog1.colour = "Black"

    dog1.bark( )
    dog1.run( )

    println("My name is ${dog1.breed}, my size is ${dog1.size} and my colour is ${dog1.colour}")

    //Second dog
    var dog2 = Dog ( )
    dog2.breed = "Pug"
    dog2.size = 10
    dog2.colour = "Brown"

    dog2.bark( )
    dog2.run( )

    println("My name is ${dog2.breed}, my size is ${dog2.size} and my colour is ${dog2.colour}")
}

class Dog {
    var breed: String = ""    //property
    var colour: String = " "   //property
    var size: Int = -1       //property

    fun bark( ){
     println("Wooh! Wooh!")
    }

    fun run( ){
    println("I am running")
    }

}