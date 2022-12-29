package com.google.kotlin.section4


fun main(args:Array <String>) {


    var remote:Remote = Television( )
     remote.powerOn()
     remote.powerOff()

     remote.about()
    remote.brand = "Hisense"
}
interface Remote {

    abstract var brand:String
      fun powerOn( )                      //Abstract method has no method body or code
      fun powerOff( )               //Abstract method has no method body or code
      open fun about( ){
          println("I am a Remote interface")
      }

}
class Television: Remote {

     override var brand: String = ""
     override fun powerOn( ) {
              println ("TV is now switched ON ")
     }

     override fun powerOff ( ) {
              println ("TV is now switched OFF")

     }
    override fun about( ){
        println("I am a TV")
        super.about ( )
    }


}