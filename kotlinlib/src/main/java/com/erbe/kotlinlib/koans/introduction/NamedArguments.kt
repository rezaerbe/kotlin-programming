package com.erbe.kotlinlib.koans.introduction

/*
Specifying only two arguments make the function joinOptions() return the list in a JSON format (e.g., "[a, b, c]")

fun joinToString(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = "",
    /* ... */
): String
*/

fun joinOptions(options: Collection<String>) = options.joinToString(prefix = "[", postfix = "]")

fun main() {
    val list = listOf("a", "b", "c")
    println(joinOptions(list))
}