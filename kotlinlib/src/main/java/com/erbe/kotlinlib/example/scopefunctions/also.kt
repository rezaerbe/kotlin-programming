package com.erbe.kotlinlib.example.scopefunctions

/*
also works like apply: it executes a given block and returns the object called.
Inside the block, the object is referenced by it, so it's easier to pass it as an argument.
This function is handy for embedding additional actions, such as logging in call chains.
*/

fun main() {

    val jake = Person("Jake", 30, "Android Developer")          // 1
        .also {                                             // 2
            println("${it.name}, ${it.age}, ${it.about}")   // 3
        }
}

/*
Creates a Person() object with the given property values.
Applies the given code block to the object. The return value is the object itself.
Calls the logging function passing the object as an argument.
*/