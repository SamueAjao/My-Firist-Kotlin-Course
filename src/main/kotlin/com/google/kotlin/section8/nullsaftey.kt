package com.google.kotlin.section8

fun main(args:Array<String>) {
    //WAP to find out length of name

    val name: String? = null

    //1. Safe Call (?.)
    //Use it when you don't mind getting value as null
    println("The length of name is ${name?.length}")

    //2. Safe Call with let (?.let)
    //It executes the block ONLY if name is NOT MULL

    name?.let{
        println{"The length of the name is ${name.length}"}
    }

    // 3. non-null assertion operator (!!)
    // use it when you are sure the value is NOT NULL
    // Throws NULL Pointer Exception if the value is found to be NULL

    println{"The length of name is ${name!!.length}"}
}