package com.google.kotlin.section4

 fun main(args: Array<String>){

     var dog = MyDog( )
     dog.breed = "Pug"
     dog.colour = "Brown"
     dog.bark( )
     dog.eat( )

     var cat = Cat( )
     cat.age = 10
     cat.colour ="white"
     cat.meow( )
     cat.eat( )

     var animal = Animal( )
     animal.colour = "Black"
     animal.eat()

     }
open class Animal {        //Parent or Superclass
    var colour: String=""
    fun eat( ){
        println("I am eating !")
    }

}

class MyDog: Animal() {       //Child or Subclass

    var breed: String=""
    fun bark( ) {
        println("Wooh! Wooh!")
    }

}

class Cat: Animal(){        //Child or Subclass

    var age: Int = -1
    fun meow( ){
        println("Meow! Meow!")
    }
}