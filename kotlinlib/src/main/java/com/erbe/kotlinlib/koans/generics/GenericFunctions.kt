package com.erbe.kotlinlib.koans.generics

import java.util.*

/*
Make the following code compile by implementing a partitionTo function that splits a collection into two collections according to the predicate.

There is a partition() function in the standard library that always returns two newly created lists.
You should write a function that splits the collection into two collections given as arguments.
The signature of the toCollection() function from the standard library may help you.
*/

fun <T, C : MutableCollection<T>> Collection<T>.partitionTo(
    first: C,
    second: C,
    predicate: (T) -> Boolean
): Pair<C, C> {
    for (element in this) {
        if (predicate(element)) {
            first.add(element)
        } else {
            second.add(element)
        }
    }
    return Pair(first, second)
}

fun partitionWordsAndLines() {
    val (words, lines) = listOf("a", "a b", "c", "d e").partitionTo(
        ArrayList<String>(),
        ArrayList()
    ) { s -> !s.contains(" ") }
    words == listOf("a", "c")
    lines == listOf("a b", "d e")
}

fun partitionLettersAndOtherSymbols() {
    val (letters, other) = setOf('a', '%', 'r', '}').partitionTo(
        HashSet<Char>(),
        HashSet()
    ) { c -> c in 'a'..'z' || c in 'A'..'Z' }
    letters == setOf('a', 'r')
    other == setOf('%', '}')
}