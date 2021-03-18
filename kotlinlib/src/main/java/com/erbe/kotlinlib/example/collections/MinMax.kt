package com.erbe.kotlinlib.example.collections

/*
minOrNull and maxOrNull functions return the smallest and the largest element of a collection.
If the collection is empty, they return null.
*/

fun main() {

    val numbers = listOf(1, 2, 3)
    val empty = emptyList<Int>()

    println("Numbers: $numbers, min = ${numbers.minOrNull()}, max = ${numbers.maxOrNull()}")    // 1
    println("Empty: $empty, min ${empty.minOrNull()}, max = ${empty.maxOrNull()}")              // 2
}

/*
1.	For non-empty collection functions return the smallest and the largest element.
2.	For empty collections both functions return null.
*/