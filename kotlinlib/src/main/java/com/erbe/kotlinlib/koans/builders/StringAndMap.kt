package com.erbe.kotlinlib.koans.builders

import java.util.*

/*
Extension function literals are very useful for creating builders, e.g.:

fun buildString(build: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.build()
    return stringBuilder.toString()
}
​
val s = buildString {
    this.append("Numbers: ")
    for (i in 1..3) {
        // 'this' can be omitted
        append(i)
    }
}
​
s == "Numbers: 123"
Add and implement the function 'buildMutableMap' with one parameter (of type extension function) creating a new HashMap,
building it and returning it as a result. The usage of this function is shown below.
*/

fun <K, V> buildMutableMap(build: HashMap<K, V>.() -> Unit): Map<K, V> {
    val map = HashMap<K, V>()
    map.build()
    return map
}

fun usage(): Map<Int, String> {
    return buildMutableMap {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
}