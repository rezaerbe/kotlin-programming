package com.erbe.kotlinlib.koans.introduction

import java.util.*

/*
Add an object expression that provides a comparator to sort a list in a descending order using java.util.Collections class.
In Kotlin you use Kotlin library extensions instead of java.util.Collections,
but this example is still a good demonstration of mixing Kotlin and Java code.
*/

fun getList(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, object : Comparator<Int> {
        override fun compare(x: Int, y: Int): Int = y - x
    })
    return arrayList
}

fun main() {
    println(getList())
}