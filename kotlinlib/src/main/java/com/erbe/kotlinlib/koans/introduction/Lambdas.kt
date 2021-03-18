package com.erbe.kotlinlib.koans.introduction

/*
Pass a lambda to any function to check if the collection contains an even number.
The function any gets a predicate as an argument and returns true if there is at least one element satisfying the predicate.
*/

fun containsEven(collection: Collection<Int>): Boolean = collection.any { it % 2 == 0 }

fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    println(containsEven(list))
}