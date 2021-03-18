package com.erbe.kotlinlib.example.collections

/*
zip function merges two given collections into a new collection.
By default, the result collection contains Pairs of source collection elements with the same index.
However, you can define own structure of the result collection element.
The size of the result collection equals to the minimum size of a source collection.
*/

fun main() {

    val A = listOf("a", "b", "c")                   // 1
    val B = listOf(1, 2, 3, 4)

    val resultPairs = A zip B                       // 2
    val resultReduce = A.zip(B) { a, b -> "$a$b" }  // 3

    println(A)
    println(B)
    println(resultPairs)
    println(resultReduce)
}

/*
Defines two collections.
Merges them into a list of pairs. The infix notation is used here.
Merges them into a list of String values by the given transformation.
*/