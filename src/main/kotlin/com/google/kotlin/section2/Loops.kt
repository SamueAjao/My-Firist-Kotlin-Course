
   fun main(args: Array<String>) {
    //Using explore FOR, WHILE, DO WHILE Loops

       //WAP to print even numbers between 1 and 10

       // FOR loop
       println("For loop")
       for (x in 1..10) {

        if (x % 2 == 0){
            println (x)
        }
       }

       // WHILE loops
       println("While loop")
       var c:Int = 1
       while (c <= 10){
       if (c % 2 == 0){
           println(c)
       }
        c++ // c = c + 1
       }

       // DO WHILE LOOP
       println ("Do while loop")
       var i = 1
       do {

           if (i % 2 == 0) {
               println(i)
           }
           i++
       } while(i<=10)
}

