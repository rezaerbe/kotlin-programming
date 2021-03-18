package com.erbe.kotlinlib.example.controlflow

fun main() {

    fun max(a: Int, b: Int) = if (a > b) a else b

    println(max(99, -42))
}