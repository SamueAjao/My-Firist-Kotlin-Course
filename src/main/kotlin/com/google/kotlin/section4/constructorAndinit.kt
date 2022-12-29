

fun main(args:Array<String>){
   //First dog
    var dog1 = Dog("German Shepard", "Black", 40 )                          // dog1 is the reference variable and Dog( ) is an object
    dog1.bark( )
    dog1.run( )

   //Second dog
   var dog2 = Dog( "Pug","Brown", 10)
   dog2.bark( )
   dog2.run( )

}

class Dog ( var breed: String, var colour: String, var size: Int) {

 init{
     println("My name is ${this.breed}, my size is ${this.size} and my colour is ${this.colour}")
 }
    fun bark( ){
     println("Wooh! Wooh!")
    }

    fun run( ){
    println("I am running")
    }

}