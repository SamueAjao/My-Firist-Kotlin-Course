
fun main (args: Array<String>)
{
    //let's explore string templates and interpolation
    var name:String="Henry"
     name="Kelvin"

    println(name)

    val marks: Float = 95.5F  //immutable values

    //"My name is Kelvin and I secured 95.5 in math exam"
    println("My name is " + name + " and I secured " + marks + " in Math exam")
    println("My name is $name and I secured $marks in Math exam")

    //WAP to find the length of a string
    var str= "I am having fun !"
    println ("The length of the string is ${str.length}")

    //WAP to find the area of a rectangle
    var length =10
    var breadth = 5
    println("The length is $length and the breadth is $breadth, hence the area is ${length * breadth}")
}