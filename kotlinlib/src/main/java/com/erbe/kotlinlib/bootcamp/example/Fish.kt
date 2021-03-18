package com.erbe.kotlinlib.bootcamp.example

/*
Lambdas are anonymous functions, which are functions with no name.
You can assign them to variables and pass them as arguments to functions and methods.
*/

fun main() {

    // Todo: Task: Create simple lambdas

    // Step 1: Create a simple lambda

    val waterFilter = { dirty: Int -> dirty / 2 }
    println(waterFilter(30))

    // Step 2: Create a filter lambda

    val myFish = listOf(Fish("Flipper"), Fish("Moby Dick"), Fish("Dory"))
    println(myFish.filter { it.name.contains("i") })
    println(myFish.filter { it.name.contains("i") }.joinToString { it.name })


    // Todo: Task: Write a higher-order function

    fishExamples()

    runExample()
}

data class Fish(var name: String)

fun fishExamples() {
    val fish = Fish("splashy")  // all lowercase
    myWith(fish.name) {
        println(capitalize())
    }

    fish.run {
        name
    }

    val fish2 = Fish(name = "splashy").apply {
        name = "sharky"
    }
    println(fish2.name)

    println(fish.let { it.name.capitalize() }
        .let { it + "fish" }
        .let { it.length }
        .let { it + 31 })
    println(fish)
}

fun myWith(name: String, block: String.() -> Unit) {
    name.block()
}

fun runExample() {
    val runnable = object : Runnable {
        override fun run() {
            println("I'm a Runnable")
        }
    }
    JavaRun.runNow(runnable)

    JavaRun.runNow({
        println("Passing a lambda as a Runnable")
    })

    JavaRun.runNow {
        println("Last parameter is a lambda as a Runnable")
    }
}