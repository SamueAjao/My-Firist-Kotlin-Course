

fun  main(args: Array<String>){

    val myLambda:(Int,Int)->Int = {x:Int, y:Int-> x+y}
    addition(2,5,myLambda)

    //val calculation:(Int,Int)->Unit ={x,y->x+y}  for unit data type
    addition(2,5,{x:Int,y:Int-> x+y})  //or ...same as above
    addition(2,5){x:Int, y:Int->x+y}   //or...same as above

    val anotherlambda:(Int,Int)-> Unit = {a:Int, b:Int->println(a+b)}
    add (3,6, anotherlambda)
    add (3,6,{a:Int,b:Int-> println(a+b)} ) //or... same as above
    add (3,6) {a:Int, b:Int-> println(a+b)} //or...same as above

}

fun addition(a:Int,b:Int, myFunc: (Int, Int)-> Int){
    var Sum= myFunc(a,b)
    println(Sum)
}

fun add(a:Int, b:Int, myFunc:(Int,Int)-> Unit ){
    myFunc(a,b)   //println(a+b) =print(9)
}