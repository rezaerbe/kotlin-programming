package com.erbe.kotlinlib.koans.introduction

/*
Rewrite the previous example once more using an extension function sortedDescending.
*/

fun getList3(): List<Int> {
    return arrayListOf(1, 5, 2).sortedDescending()
}

fun main() {
    println(getList3())
}