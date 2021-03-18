package com.erbe.kotlinlib.example.collections

/*
Function any returns true if the collection contains at least one element that matches the given predicate.
Function all returns true if all elements in collection match the given predicate.
Function none returns true if there are no elements that match the given predicate in the collection.
*/

fun main() {

    // Any
    val numbers = listOf(1, -2, 3, -4, 5, -6)   // 1

    val anyNegative = numbers.any { it < 0 }    // 2

    val anyGT6 = numbers.any { it > 6 }         // 3

    println(numbers)
    println(anyNegative)
    println(anyGT6)

    // All
    val allEven = numbers.all { it % 2 == 0 }   // 4

    val allLess6 = numbers.all { it < 6 }       // 5

    println(allEven)
    println(allLess6)

    // None
    val allEven2 = numbers.none { it % 2 == 0 } // 6

    val allLess62 = numbers.none { it < 6 }     // 7

    println(allEven2)
    println(allLess62)
}

/*
1.	Defines a collection of numbers.
2.	Checks if there are negative elements.
3.	Checks if there are elements greater than 6.
4.	Checks whether all elements are even.
5.	Checks whether all elements are less than 6.
6.	Checks if there are no odd elements (all elements are even).
7.	Checks if there are no elements greater than 6.
*/