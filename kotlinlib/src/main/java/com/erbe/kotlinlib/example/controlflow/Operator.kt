package com.erbe.kotlinlib.example.controlflow

fun main() {

    operator fun Int.times(str: String) = str.repeat(this)      // 1
    println(2 * "Bye ")                                         // 2

    operator fun String.get(range: IntRange) = substring(range) // 3
    val str = "Always forgive your enemies; nothing annoys them so much."
    println(str[0..14])                                         // 4
}

/*
1.	This takes the infix function from above one step further using the operator modifier.
2.	The operator symbol for times() is * so that you can call the function using 2 * "Bye".
3.	An operator function allows easy range access on strings.
4.	The get() operator enables bracket-access syntax.
*/