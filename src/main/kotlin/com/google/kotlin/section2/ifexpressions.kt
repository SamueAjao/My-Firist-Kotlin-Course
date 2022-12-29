
   fun main(args: Array<String>) {
       //Conditional IF ESLE statement. WAP to find our larger number.
       var a = 2
       var b = 5

       //Using IF else expression.
       var bigNum: Int = if (a > b) {
           println("a is greater")
           a
       } else { //b>a
           println("b is greater")
           b
       }
       println("The greater number is $bigNum")
   }
