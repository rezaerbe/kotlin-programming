package com.erbe.kotlinlib.codelabs

// Collections in Kotlin
// https://developer.android.com/codelabs/basic-android-kotlin-training-collections

fun main() {
    // Todo: Learn about collections

    // Create a list
    val numbers = listOf(0, 3, 8, 4, 0, 5, 5, 8, 9, 2)
    println("list:   ${numbers}")
    println("sorted: ${numbers.sorted()}")

    /* --- +++ --- */
    println()
    /* --- +++ --- */

    // Learn about sets
    val setOfNumbers = numbers.toSet()
    println("set:    ${setOfNumbers}")

    val set1 = setOf(1, 2, 3)
    val set2 = mutableSetOf(3, 2, 1)
    println("$set1 == $set2: ${set1 == set2}")

    println("contains 7: ${setOfNumbers.contains(7)}")

    /* --- +++ --- */
    println()
    /* --- +++ --- */

    // Learn about maps
    val peopleAges = mutableMapOf<String, Int>(
        "Fred" to 30,
        "Ann" to 23
    )
    peopleAges.put("Barbara", 42)
    peopleAges["Joe"] = 51
    // The value it maps to is updated
    peopleAges["Fred"] = 31
    println(peopleAges)

    /* --- +++ --- */
    println()
    println()
    /* --- +++ --- */

    // Todo: Working with collections

    // forEach
    peopleAges.forEach { print("${it.key} is ${it.value}, ") }

    /* --- +++ --- */
    println()
    /* --- +++ --- */

    // map
    println(peopleAges.map { "${it.key} is ${it.value}" }.joinToString(", "))

    /* --- +++ --- */
    println()
    /* --- +++ --- */

    // filter
    val filteredNames = peopleAges.filter { it.key.length < 4 }
    println(filteredNames)

    /* --- +++ --- */
    println()
    println()
    /* --- +++ --- */

    // Todo: Learn about lambdas and higher-order functions

    // Lambdas
    peopleAges.forEach { print("${it.key} is ${it.value}") }

    /* --- +++ --- */
    println()
    /* --- +++ --- */

    // Function types
    val triple: (Int) -> Int = { a: Int -> a * 3 }
    println(triple(5))

    /* --- +++ --- */
    println()
    /* --- +++ --- */

    // Higher-order functions
    val peopleNames = listOf("Fred", "Ann", "Barbara", "Joe")
    println(peopleNames.sorted())
    println(peopleNames.sortedWith { str1: String, str2: String -> str1.length - str2.length })

    /* --- +++ --- */
    println()
    /* --- +++ --- */

    // OnClickListener and OnKeyListener in Android
    println("calculateButton.setOnClickListener { calculateTip() }")
    println("costOfServiceEditText.setOnKeyListener { view, keyCode, event -> handleKeyEvent(view, keyCode)}")

    /* --- +++ --- */
    println()
    println()
    /* --- +++ --- */

    // Todo: Make word lists

    val words = listOf(
        "about",
        "acute",
        "awesome",
        "balloon",
        "best",
        "brief",
        "class",
        "coffee",
        "creative"
    )
    val filteredWords = words.filter { it.startsWith("b", ignoreCase = true) }
    println(filteredWords)

    val filteredWords2 = words.filter { it.startsWith("b", ignoreCase = true) }
        .shuffled()
    println(filteredWords2)

    val filteredWords3 = words.filter { it.startsWith("b", ignoreCase = true) }
        .shuffled()
        .take(2)
    println(filteredWords3)

    val filteredWords4 = words.filter { it.startsWith("b", ignoreCase = true) }
        .shuffled()
        .take(2)
        .sorted()
    println(filteredWords4)
}