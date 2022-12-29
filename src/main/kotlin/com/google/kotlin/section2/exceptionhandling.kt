import java.lang.Exception

fun main (args: Array <String> ) {
     //WAP to divide two numbers

     try {
         val result = 8 / 0
         println("The result is $result")
        }catch (ex:Exception){
         println("You cannot divide a number by 0")
        } finally {
        println("The block is always executed")
     }

    }
