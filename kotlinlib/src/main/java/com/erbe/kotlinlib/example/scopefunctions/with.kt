package com.erbe.kotlinlib.example.scopefunctions

/*
with is a non-extension function that can access members of its argument concisely:
you can omit the instance name when referring to its members.
*/

/*
fun main() {

    with(configuration) {
        println("$host:$port")
    }

    // instead of:
    println("${configuration.host}:${configuration.port}")
}
*/
