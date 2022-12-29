package com.google.kotlin.section3

      fun main(args: Array<String>) {

          //WAP to find the volume of a cuboid (length*breadth*height)
          val result = findVolume (30, 10)
                       println("The volume of the cube is $result")
      }
      fun findVolume (length:Int, breadth:Int, height:Int=5 ):Int {
          return length * breadth * height

      }