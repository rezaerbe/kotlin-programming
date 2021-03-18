package com.erbe.kotlinlib.bootcamp

// Kotlin Bootcamp for Programmers 5.1: Extensions
// https://developer.android.com/codelabs/kotlin-bootcamp-extensions

/*
add(element: E)
Add an item to the mutable list.

remove(element: E)
Remove an item from a mutable list.

reversed()
Return a copy of the list with the elements in reverse order.

contains(element: E)
Return true if the list contains the item.

subList(fromIndex: Int, toIndex: Int)
Return part of the list, from the first index up to but not including the second index.
*/

/*
The value for const val is determined at compile time,
where as the value for val is determined during program execution,
which means, val can be assigned by a function at run time.
That means val can be assigned a value from a function, but const val cannot.
*/

/*
It's very common to write utility functions to extend the behavior of a class.
Kotlin provides a convenient syntax for declaring these utility functions: extension functions.
Extension functions allow you to add functions to an existing class without having to access its source code.
*/

/*
Pairs and triples can be used to return more than one value from a function. For example: val twoLists = fish.partition { isFreshWater(it) }
Kotlin has many useful functions for List, such as reversed(), contains(), and subList().
A HashMap can be used to map keys to values. For example: val cures = hashMapOf("white spots" to "Ich", "red sores" to "hole disease")
Declare compile-time constants using the const keyword. You can put them at the top level, organize them in a singleton object, or put them in a companion object.
A companion object is a singleton object within a class definition, defined with the companion keyword.
Extension functions and properties can add functionality to a class. For example: fun String.hasSpaces() = find { it == ' ' } != null
A nullable receiver allows you to create extensions on a class which can be null. The ?. operator can be paired with apply to check for null before executing code. For example: this?.apply { println("removing $this") }
*/

fun main() {

    // Todo: Task: Learn about pairs and triples

    // Step 1: Make some pairs and triples

    val equipment = "fish net" to "catching fish"
    println("${equipment.first} used for ${equipment.second}")

    val numbers = Triple(6, 9, 42)
    println(numbers.toString())
    println(numbers.toList())

    val equipment2 = ("fish net" to "catching fish") to "equipment"
    println("${equipment2.first} is ${equipment2.second}")
    println("${equipment2.first.second}")

    // Step 2: Destructure some pairs and triples

    val (tool, use) = equipment
    println("$tool is used for $use")

    val (n1, n2, n3) = numbers
    println("$n1 $n2 $n3")


    // Todo: Task: Comprehend collections

    // Step 1: Learn more about lists

    val list = listOf(1, 5, 3, 4)
    println(list.sum())

    val list2 = listOf("a", "bbb", "cc")
//    println(list2.sum())
//    ⇒ error: none of the following functions can be called with the arguments supplied:
    println(list2.sumBy { it.length })

    for (s in list2.listIterator()) {
        print("$s ")
    }
    println()

    // Step 2: Try out hash maps

    val cures = hashMapOf("white spots" to "Ich", "red sores" to "hole disease")
    println(cures.get("white spots"))
    println(cures["red sores"])
    println(cures["scale loss"])

    println(cures.getOrDefault("bloating", "sorry, I don't know"))
    println(cures.getOrElse("bloating") { "No cure for this" })

    val inventory = mutableMapOf("fish net" to 1)
    inventory.put("tank scubber", 3)
    println(inventory.toString())
    inventory.remove("fish net")
    println(inventory.toString())


    // Todo: Task: Study constants

    // Step 1: Learn about const vs. val

    println(rocks)

    val foo = Constants.CONSTANT2
    println(foo)

//    val value1 = complexFunctionCall() // OK
//    const val CONSTANT1 = complexFunctionCall() // NOT ok

    // Step 2: Create a companion object

    val foo2 = MyClass.CONSTANT3
    println(foo2)


    // Todo: Task: Write extensions

    // Step 1: Write an extension function

    println("Does it have spaces?".hasSpaces())
    println("Does it have spaces?".hasSpaces2())
}

const val rocks = 3

object Constants {
    const val CONSTANT2 = "object constant"
}

class MyClass {
    companion object {
        const val CONSTANT3 = "constant in companion"
    }
}

fun String.hasSpaces(): Boolean {
    val found = this.find { it == ' ' }
    return found != null
}

fun String.hasSpaces2() = find { it == ' ' } != null