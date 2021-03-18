package com.erbe.kotlinlib.guide

// Kotlin Quick Guide for Android Basics in Kotlin
// https://developer.android.com/courses/android-basics-kotlin/kotlin-quick-guide

fun main() {
    // Todo: Unit 1

    // Kotlin Programs

    // The smallest main() program for printing text
    println("Hello, world!")

    // Printing line of text
    println("This is the text to print!")

    // Inline comments
    // This is a comment line.
    // This is another comment.

    // Variables
    // Assign once, cannot change.
    val age = "5"
    val name = "Rover"

    // Assign and change as needed.
    var roll = 6
    var rolledValue: Int = 4

    // Printing variables with string templates
    println("You are already ${age}!")
    println("You are already ${age} days old, ${name}")

    // Data types
    Int         // Whole positive and negative numbers and zero
    String      // Piece of text between quotes
    IntRange    // Setting a range such as 1..6
    Boolean     // Can only be true or false

    // Function without arguments
    // Define the function.
    fun printHello() {
        println("Hello Kotlin")
    }

    // Call the function.
    printHello()

    // Function with arguments
    fun printBorder(border: String, timesToRepeat: Int) {
        repeat(timesToRepeat) {
            print(border)
        }
        println()
    }

    // Function that returns a value
    fun roll(): Int {
        val randomNumber = (1..6).random()
        return randomNumber
    }

    // Basic operators
    // *    multiplication
    // /    division
    // +    addition
    // -    subtraction
    // =    assignment

    // Logic operators
    // >    greater than
    // <    less than
    // ==   equal
    // >=   greater or equal
    // <=   less or equal
    // !=   not equal

    // Creating random numbers
    val randomNumber = (1..6).random()

    fun roll2() {
        val anotherRandomNumber = (1..6).random()
        println(randomNumber)
    }

    // Controlling program flow

    // Repeating an action with repeat()
    fun printBorder2() {
        repeat(23) {
            print("=")
        }
    }

    // Nesting repeat() loops
    fun printCakeBottom(age: Int, layers: Int) {
        repeat(layers) {
            repeat(age + 2) {
                print("@")
            }
            println()
        }
    }

    // Conditional statements with if/else
    val num = 4
    if (num > 4) {
        println("The variable is greater than 4")
    } else if (num == 4) {
        println("The variable is equal to 4")
    } else {
        println("The variable is less than 4")
    }

    // Conditional statements with when
/*    when (rollResult) {
        luckyResult -> println("You won!")
        1 -> println("So sorry! You rolled a 1. Try again!")
        2 -> println("Sadly, you rolled a 2. Try again!")
        3 -> println("Unfortunately, you rolled a 3. Try again!")
        4 -> println("No luck! You rolled a 4. Try again!")
        5 -> println("Don't cry! You rolled a 5. Try again!")
        6 -> println("Apologies! you rolled a 6. Try again!")
    }*/

    // Assigning the result of a when statement to a variable
    // Determining which drawable resource ID to use based on the dice roll.
/*    val drawableResource = when (diceRoll) {
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else -> R.drawable.dice_6
    }*/

    // Classes

    // Simple class with property and method
    class Dice {
        var sides = 6

        fun roll() {
            val randomNumber = (1..6).random()
            println(randomNumber)
        }
    }

    // Class with parameter
    class Dice2(val numSides: Int) {

        fun roll(): Int {
            val randomNumber = (1..numSides).random()
            return randomNumber
        }
    }

    // Creating instances
    val myFirstDice = Dice2(6)

    // Todo: Unit 2

    // Lists

    // Define a read-only list
    val numbers = listOf(1, 2, 3, 4, 5, 6)

    // Get the size of the list
    numbers.size

    // Get the first item of a list
    numbers[0]

    // Get a copy of a list in reverse order
    listOf("red", "blue", "green").reversed()

    // Define a mutable list of strings
    val entrees = mutableListOf<String>()

    // Add an item to a mutable list
    entrees.add("spaghetti")

    // Modify an item in a mutable list
    entrees[0] = "lasagna"

    // Remove an item from a mutable list
    entrees.remove("lasagna")

    // Loops

    // Use for loop to iterate over items in a list
/*    for (element in myList) {
        // Perform an operation with each item
        println(element)
    }*/

    // Use while loop to iterate over items in a list
/*    var index = 0
    while (index < myList.size) {
        println(myList[index])
        index++
    }*/

    // Strings

    // Number of character in a String
    val name2 = "Android"
    println(name2.length)

    // Use a variable in a String template
    val number = 10
    println("$number people")

    // Use an expression in a String template
    val number2 = 10
    val groups = 5
    println("${number * groups} people")

    // Miscellaneous

    // Augmented assignments
    // a += b     // a = a + b
    // a -= b     // a = a - b
    // a *= b     // a = a * b
    // a /= b     // a = a / b

    // Using with to simplify access to an object
/*    with(squareCabin) {
        println("Capacity: ${capacity}")
        println("Material: ${buildingMaterial}")
        println("Has room? ${hasRoom()}")
    }*/

    // Import from the Kotlin math library
    // import kotlin.math.PI

    // Use fully qualified name for a constant in the Kotlin math library (no import statement needed)
    // kotlin.math.PI * radius * radius

    // Chain calls together (for accessing properties and calling methods)
    // val stringInTextField = binding.costOfService.text.toString()

    // Variable number of function arguments
    // fun addToppings(vararg val toppings: String)

    // Package declaration
    // package com.example.affirmations.model
}

// Classes

// Abstract class
/*
abstract class Dwelling() {
}*/

// Abstract class with an abstract property
/*abstract class Dwelling() {
    abstract val buildingMaterial: String
}*/

// Abstract class with an abstract method
/*abstract class Dwelling() {
    abstract fun floorArea(): Double
}*/

// Mark a class open so it can be subclassed
/*open class RoundHut(residents: Int) {
}*/

// Create a subclass by extending a parent class
/*class SquareCabin : Dwelling()*/

// Override a function from superclass
/*override fun floorArea(): Double {
}*/

// Call the superclass implementation of a function
/*override fun floorArea(): Double {
    return super.floorArea() * floors
}*/
