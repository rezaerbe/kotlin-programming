package com.erbe.kotlinlib.example.controlflow

fun main() {

    fun printAll(vararg messages: String) {                             // 1
        for (m in messages) println(m)
    }
    printAll("Hello", "Hallo", "Salut", "Hola", "你好")                  // 2

    fun printAllWithPrefix(vararg messages: String, prefix: String) {   // 3
        for (m in messages) println(prefix + m)
    }
    printAllWithPrefix(
        "Hello", "Hallo", "Salut", "Hola", "你好",
        prefix = "Greeting: "                                       // 4
    )

    fun log(vararg entries: String) {
        printAll(*entries)                                              // 5
    }
    log("Hello", "Hallo", "Salut", "Hola", "你好")
}

/*
1.	The vararg modifier turns a parameter into a vararg.
2.	This allows calling printAll with any number of string arguments.
3.	Thanks to named parameters, you can even add another parameter of the same type after the vararg. This wouldn't be allowed in Java because there's no way to pass a value.
4.	Using named parameters, you can set a value to prefix separately from the vararg.
5.	At runtime, a vararg is just an array. To pass it along into a vararg parameter,
use the special spread operator * that lets you pass in *entries (a vararg of String) instead of entries (an Array<String>).
*/