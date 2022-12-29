package com.google.kotlin.section6

 fun main(args: Array<String>) {
     var result = 0    //closures
     println(result)

     val lambda: (Int, Int) -> Unit = { x, y -> result = x + y }
     addTwoNum(2, 4, lambda)
     println(result)
 }

fun addTwoNum(x:Int, y:Int,myFunc: (Int, Int) -> Unit){
    myFunc(x, y)  //result= 2+6 =0
}