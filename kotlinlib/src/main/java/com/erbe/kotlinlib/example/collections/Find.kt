package com.erbe.kotlinlib.example.collections

/*
find and findLast functions return the first or the last collection element that matches the given predicate.
If there are no such elements, functions return null.
*/

fun main() {

    val words = listOf("Lets", "find", "something", "in", "collection", "somehow")  // 1

    val first = words.find { it.startsWith("some") }
    val last = words.findLast { it.startsWith("some") }

    val nothing = words.find { it.contains("nothing") }

    println(words)
    println(first)
    println(last)
    println(nothing)
}

/*
1.	Defines a collection of words.
2.	Looks for the first word starting with "some".
3.	Looks for the last word starting with "some".
4.	Looks for the first word containing "nothing".
*/