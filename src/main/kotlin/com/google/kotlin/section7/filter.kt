package com.google.kotlin.section7

 fun main (args: Array <String>) {
     val myNumbers: List<Int> = listOf(2, 4, 6, 23, 90)

     val mySmallNumbers = myNumbers.filter { it < 10 }    //OR num -> num<10
     for (num in mySmallNumbers) {
         println(num)
     }

     println()


 val myLargeNumbers = myNumbers.filter { it > 10 }    //OR num -> numb>10
      for (num in myLargeNumbers) {
          println(num)

}

        val namesList:List<String> = listOf("Sam", "Annie","Shreks")
        val myNames= namesList.filter {it.startsWith("S")}    //OR {name ->names.startWith("S")
     for (name in myNames)
         println(name)
}