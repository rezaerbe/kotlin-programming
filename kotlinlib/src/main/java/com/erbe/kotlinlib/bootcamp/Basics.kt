package com.erbe.kotlinlib.bootcamp

// Kotlin Bootcamp for Programmers 2: Kotlin basics
// https://developer.android.com/codelabs/kotlin-bootcamp-basics

/*
The following features may be different in Kotlin than what you're used to in other languages:

Kotlin types can't be implicitly converted—use casting.
Variables declared with val can only be assigned once.
Kotlin variables are not nullable by default. Use ? to make variables nullable.
With Kotlin, you can loop through the index and elements of an array at the same time in a for loop.

The following Kotlin programming constructs are similar to those in other languages:

Arrays and lists can have a single type or mixed types.
Arrays and lists can be nested.
You can create loops with for, while, do/while, and repeat.
The when statement is Kotlin's version of the switch statement, but when is more flexible.
*/


// Todo: Task: Learn about operators and types

// Step 1: Explore numeric operators

/*
    1+1
    res0: kotlin.Int = 2

    53-3
    res1: kotlin.Int = 50

    50/10
    res2: kotlin.Int = 5

    1.0/2.0
    res3: kotlin.Double = 0.5

    2.0*3.5
    res4: kotlin.Double = 7.0

    6*50
    res5: kotlin.Int = 300

    6.0*50.0
    res6: kotlin.Double = 300.0

    6.0*50
    res7: kotlin.Double = 300.0

    2.times(3)
    res8: kotlin.Int = 6

    3.5.plus(4)
    res9: kotlin.Double = 7.5

    2.4.div(2)
    res10: kotlin.Double = 1.2
*/


// Step 2: Practice using types

/*
    val i: Int = 6
    val b1 = i.toByte()
    println(b1)
    6

    val b2: Byte = 1 // OK, literals are checked statically
    println(b2)
    1

    val i1: Int = b2
    error: type mismatch: inferred type is Byte but Int was expected
    val i1: Int = b2
    ^

    val i2: String = b2
    error: type mismatch: inferred type is Byte but String was expected
    val i2: String = b2
    ^

    val i3: Double = b2
    error: type mismatch: inferred type is Byte but Double was expected
    val i3: Double = b2
    ^

    val i4: Int = b2.toInt() // OK!
    println(i4)
    1

    val i5: String = b2.toString()
    println(i5)
    1

    val i6: Double = b2.toDouble()
    println(i6)
    1.0

    val oneMillion = 1_000_000
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010

    1000000
    999999999
    4293713502
    3530134674
*/


fun main() {
    // Step 3: Learn the value of variable types

    var fish = 1
    fish = 2
    val aquarium = 1
    /*
    aquarium = 2
    ⇒ error: val cannot be reassigned
    */

    var fish2: Int = 12
    var lakes: Double = 2.5


    // Step 4: Learn about strings

    val numberOfFish = 5
    val numberOfPlants = 12
    println("I have $numberOfFish fish" + " and $numberOfPlants plants")

    println("I have ${numberOfFish + numberOfPlants} fish and plants")


    // Todo: Task: Compare conditions and booleans

    val numberOfFish2 = 50
    val numberOfPlants2 = 23
    if (numberOfFish2 > numberOfPlants2) {
        println("Good ratio!")
    } else {
        println("Unhealthy ratio")
    }

    val fish3 = 50
    if (fish3 in 1..100) {
        println(fish3)
    }

    if (numberOfFish2 == 0) {
        println("Empty tank")
    } else if (numberOfFish2 < 40) {
        println("Got fish!")
    } else {
        println("That's a lot of fish!")
    }

    when (numberOfFish2) {
        0 -> println("Empty tank")
        in 1..39 -> println("Got fish!")
        else -> println("That's a lot of fish!")
    }


    // Todo: Task: Learn about nullability

    // Step 1: Learn about nullability

    /*
    val rocks: Int = null
    ⇒ error: null can not be a value of a non-null type Int
    */

    var marbles: Int? = null


    // Step 2: Learn about the ? and ?: operators

    var fishFoodTreats = 6
    if (fishFoodTreats != null) {
        fishFoodTreats = fishFoodTreats.dec()
    }

    var fishFoodTreats2 = 6
    fishFoodTreats2 = fishFoodTreats2?.dec()
    fishFoodTreats2 = fishFoodTreats2?.dec() ?: 0

    // A point about null pointers

    /*
    val len = s!!.length
    throws NullPointerException if s is null
    */


    // Todo: Task: Explore arrays, lists, and loops

    // Step 1: Make lists

    val school = listOf("mackerel", "trout", "halibut")
    println(school)

    val myList = mutableListOf("tuna", "salmon", "shark")
    myList.remove("shark")
    // ⇒ res: kotlin.Boolean = true


    // Step 2: Create arrays

    val school2 = arrayOf("shark", "salmon", "minnow")
    println(java.util.Arrays.toString(school2))

    val mix = arrayOf("fish", 2)

    val numbers = intArrayOf(1, 2, 3)
    val numbers3 = intArrayOf(4, 5, 6)
    val foo2 = numbers3 + numbers
    println(foo2[5])

    val oceans = listOf("Atlantic", "Pacific")
    val oddList = listOf(numbers, oceans, "salmon")
    println(oddList)

    val array = Array(5) { it * 2 }
    println(java.util.Arrays.toString(array))


    // Step 3: Make loops

    val school3 = arrayOf("shark", "salmon", "minnow")
    for (element in school3) {
        print(element + " ")
    }

    println()

    for ((index, element) in school3.withIndex()) {
        println("Item at $index is $element")
    }

    for (i in 1..5) print(i)
    println()
    for (i in 5 downTo 1) print(i)
    println()
    for (i in 3..6 step 2) print(i)
    println()
    for (i in 'd'..'g') print(i)
    println()

    var bubbles = 0
    while (bubbles < 50) {
        bubbles++
    }
    println("$bubbles bubbles in the water")

    do {
        bubbles--
    } while (bubbles > 50)
    println("$bubbles bubbles in the water")

    repeat(2) {
        println("A fish is swimming")
    }
}