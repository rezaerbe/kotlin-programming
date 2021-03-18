package com.erbe.kotlinlib.koans.introduction

import java.util.*

/*
In the previous example change an object expression to a lambda.
*/

fun getList2(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, { x, y -> y - x })
    return arrayList
}

fun main() {
    println(getList2())
}