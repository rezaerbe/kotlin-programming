package com.erbe.kotlinlib.koans.introduction

/*
Replace the trimIndent call with the trimMargin call taking # as the prefix value,
so that the resulting string doesn't contain the prefix character.
*/

const val question = "life, the universe, and everything"
const val answer = 42

val tripleQuotedString = """
    #question = "$question"
    #answer = $answer""".trimMargin("#")

fun main() {
    println(tripleQuotedString)
}