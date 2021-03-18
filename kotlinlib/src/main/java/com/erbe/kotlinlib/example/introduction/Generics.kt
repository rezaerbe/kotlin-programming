package com.erbe.kotlinlib.example.introduction

class MutableStack<E>(vararg items: E) {                // 1

    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)        // 2

    fun peek(): E = elements.last()                     // 3

    fun pop(): E = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString(): String = "MutableStack(${elements.joinToString()})"

/*
    1.	Defines a generic class MutableStack<E> where E is called the generic type parameter.
    At use-site, it is assigned to a specific type such as Int by declaring a MutableStack<Int>.
    2.	Inside the generic class, E can be used as a parameter like any other type.
    3.	You can also use E as a return type.
*/
}

fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)

fun main() {
    val stack = mutableStackOf(0.62, 3.14, 2.7)
    println(stack)
}