package com.erbe.kotlinlib.koans.classes

import kotlin.random.Random as KRandom
import java.util.Random as JRandom

/*
Uncomment the code and make it compile. Rename Random from the kotlin package to KRandom,
and Random from the java package to JRandom.
*/

fun useDifferentRandomClasses(): String {
    return "Kotlin random: " +
            KRandom.nextInt(2) +
            " Java random:" +
            JRandom().nextInt(2) +
            "."
}

fun main() {
    println(useDifferentRandomClasses())
}