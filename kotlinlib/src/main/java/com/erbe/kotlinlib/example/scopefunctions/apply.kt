package com.erbe.kotlinlib.example.scopefunctions

/*
apply executes a block of code on an object and returns the object itself.
Inside the block, the object is referenced by this. This function is handy for initializing objects.
*/

class Person(var name: String = "name", var age: Int = 20, var about: String = "about")

fun main() {

    val jake = Person()                     // 1
    val stringDescription = jake.apply {    // 2
        name = "Jake"                       // 3
        age = 30
        about = "Android Developer"
    }.toString()                            // 4

    with(jake) {
        println("$name, $age, $about")
    }
}

/*
1.	Creates a Person() instance with default property values.
2.	Applies the code block (next 3 lines) to the instance.
3.	Inside apply, it's equivalent to jake.name = "Jake".
4.	The return value is the instance itself, so you can chain other operations.
*/