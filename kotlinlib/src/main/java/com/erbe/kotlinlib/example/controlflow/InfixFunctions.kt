package com.erbe.kotlinlib.example.controlflow

fun main() {

    infix fun Int.times(str: String) = str.repeat(this)             // 1
    println(2 times "Bye ")                                         // 2

    val pair = "Ferrari" to "Katrina"                               // 3
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)        // 4
    val myPair = "McLaren" onto "Lucas"
    println(myPair)

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    sophia likes claudia                                            // 5
}

class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) {
        likedPeople.add(other)
    }       // 6
}

/*
1.	Defines an infix extension function on Int.
2.	Calls the infix function.
3.	Creates a Pair by calling the infix function to from the standard library.
4.	Here's your own implementation of to creatively called onto.
5.	Infix notation also works on members functions (methods).
6.	The containing class becomes the first parameter.
*/