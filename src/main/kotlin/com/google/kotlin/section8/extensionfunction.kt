package com.google.kotlin.section8

 fun main(args: Array<String>) {
     val camera = Camera()
     camera.OpenCamera()
     camera.takePicture()
     camera.applyFilter()                           // The function becomes the part of camera class
     camera.SaveThepic()

 }

     fun Camera.applyFilter()  {                    //Extension Function
     println("Gloss Filter Applied !")
 }

//camera App

class Camera {
    fun OpenCamera(){
            println("Camera is now opened")
    }
    fun takePicture(){
        println("Picture Clicked! Time to save it!")
    }
    fun SaveThepic (){
        println("Picture Saved to sdCard/DCIM")
    }
}