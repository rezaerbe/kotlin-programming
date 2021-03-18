package com.erbe.kotlinlib.example.controlflow

fun main() {
    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers)     // 1
    println(authors === writers)    // 2

/*
    1.	Returns true because it calls authors.equals(writers) and sets ignore element order.
    2.	Returns false because authors and writers are distinct references.
*/
}