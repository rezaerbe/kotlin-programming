package com.erbe.kotlinlib.example.collections

/*
flatMap transforms each element of a collection into an iterable object
and builds a single list of the transformation results.
The transformation is user-defined.
*/

fun main() {

    val numbers = listOf(1, 2, 3)                           // 1

    val tripled = numbers.flatMap { listOf(it, it, it) }    // 2

    println(numbers)
    println(tripled)
}

/*
1.	Defines a collection of numbers.
2.	Builds a list in which every collection element is repeated three times.
Important thing is that it's not a list of lists; it's a list of integers with nine elements.
*/