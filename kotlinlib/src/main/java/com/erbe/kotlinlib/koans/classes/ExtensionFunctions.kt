package com.erbe.kotlinlib.koans.classes

/*
Then implement extension functions Int.r() and Pair.r() and make them convert Int and Pair to RationalNumber.
*/

fun Int.r(): RationalNumber = RationalNumber(this, 1)
fun Pair<Int, Int>.r(): RationalNumber = RationalNumber(first, second)

data class RationalNumber(val numerator: Int, val denominator: Int)

fun main() {
    val int = 2.r()
    val pair = 3 to 4
    val pairing = pair.r()

    println(int)
    println(pairing)
}