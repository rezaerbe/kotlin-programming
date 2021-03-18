package com.erbe.kotlinlib.bootcamp

import java.util.*

// Kotlin Bootcamp for Programmers 3: Functions
// https://developer.android.com/codelabs/kotlin-bootcamp-functions

/*
To create a Kotlin source file in IntelliJ IDEA, start with a Kotlin project.
To compile and run a program in IntelliJ IDEA, click the green triangle next to the main() function. Output appears in a log window below.
In IntelliJ IDEA, specify command line arguments to pass to the main() function in Run > Edit Configurations.
Almost everything in Kotlin has a value. You can use this fact to make your code more concise by using the value of an if or when as an expression or return value.
Default arguments remove the need for multiple versions of a function or method.
    For example: fun swim(speed: String = "fast") { ... }
Compact functions, or single-expression functions, can make your code more readable.
    For example: fun isTooHot(temperature: Int) = temperature > 30
You've learned some basics about filters, which use lambda expressions.
    For example: val beginsWithP = decorations.filter { it [0] == 'p' }
A lambda expression is an expression that makes an unnamed function. Lambda expressions are defined between curly braces {}.
In a higher-order function, you pass a function such as a lambda expression to another function as data.
    For example: dirtyLevel = updateDirty(dirtyLevel) { dirtyLevel -> dirtyLevel + 23}
*/

fun main() {
    // Todo: Task: Learn why (almost) everything has a value

    // Will assign kotlin.Unit
    val isUnit = println("This is an expression")
    println(isUnit)

    val temperature = 10
    val isHot = if (temperature > 50) true else false
    println(isHot)

    val message = "The water temperature is ${if (temperature > 50) "too warm" else "OK"}."
    println(message)


    // Todo: Task: Learn more about functions

    feedTheFish()


    // Todo: Task: Explore default values and compact functions

    swim()
    swim("slow")
    swim(speed = "turtle-like")


    // Todo: Task: Get started with filters

    // Step 1: Create a filter
    val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
    println(decorations.filter { it[0] == 'p' })

    // Step 2: Compare eager and lazy filters

    val decorations2 = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

    // eager, creates a new list
    val eager = decorations2.filter { it[0] == 'p' }
    println("eager: $eager")

    // lazy, will wait until asked to evaluate
    val filtered = decorations2.asSequence().filter { it[0] == 'p' }
    println("filtered: $filtered")

    // force evaluation of the lazy list
    val newList = filtered.toList()
    println("new list: $newList")

    val lazyMap = decorations2.asSequence().map {
        println("access: $it")
        it
    }

    println("lazy: $lazyMap")
    println("-----")
    println("first: ${lazyMap.first()}")
    println("-----")
    println("all: ${lazyMap.toList()}")

    val lazyMap2 = decorations2.asSequence().filter { it[0] == 'p' }.map {
        println("access: $it")
        it
    }
    println("-----")
    println("filtered: ${lazyMap2.toList()}")


    // Todo: Task: Get started with lambdas and higher-order functions

    // Lambdas
    /*
    A lambda is an expression that makes a function. But instead of declaring a named function,
    you declare a function that has no name. Part of what makes this useful is that the
    lambda expression can now be passed as data. In other languages, lambdas are called
    anonymous functions, function literals, or similar names.
    */

    // Higher-order functions
    /*
    You can create a higher-order function by passing a lambda to another function.
    In the previous task, you created a higher-order function called filter.
    Similarly, map is a higher-order function, and the lambda you passed to it was the transformation to apply.
    */

    // Step 1: Learn about lambdas

    var dirtyLevel = 20
    val waterFilter = { dirty: Int -> dirty / 2 }
    println(waterFilter(dirtyLevel))

    val waterFilter2: (Int) -> Int = { dirty -> dirty / 2 }
    println(waterFilter2(dirtyLevel))

    // Step 2: Create a higher-order function

    val waterFilter3: (Int) -> Int = { dirty -> dirty / 2 }
    println(updateDirty(30, waterFilter3))

    println(updateDirty(15, ::increaseDirty))

    var dirtyLevel2 = 19
    dirtyLevel2 = updateDirty(dirtyLevel2) { dirtyLevel2 -> dirtyLevel2 + 23 }
    println(dirtyLevel2)
}


// Todo: Task: Learn more about functions

// Step 1: Create some functions

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
    println("Change water: ${shouldChangeWater(day)}")
}

fun randomDay(): String {
    val week = arrayOf(
        "Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday"
    )
    return week[Random().nextInt(week.size)]
}

// Step 2: Use a when expression

fun fishFood(day: String): String {
    return when (day) {
        "Monday" -> "flakes"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Sunday" -> "plankton"
        else -> "nothing"
    }
}


// Todo: Task: Explore default values and compact functions

// Step 1: Create a default value for a parameter

fun swim(speed: String = "fast") {
    println("swimming $speed")
}

// Step 2: Add required parameters

fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

// Step 3: Make compact functions

fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sunday"


// Todo: Task: Get started with lambdas and higher-order functions

// Step 2: Create a higher-order function

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

fun increaseDirty(start: Int) = start + 1