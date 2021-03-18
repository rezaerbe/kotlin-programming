package com.erbe.kotlinlib.example.controlflow

fun eatACake() = println("Eat a cake")
fun bakeACake() = println("Bake a cake")

class Animal(val name: String)

class Zoo(val animals: List<Animal>) {

    operator fun iterator(): Iterator<Animal> {    // 1
        return animals.iterator()                   // 2
    }
}

/*
1.	Defines an iterator in a class. It must be named iterator and have the operator modifier.
2.	Returns the iterator that meets the following method requirements:
    o	next(): Animal
    o	hasNext(): Boolean
*/

fun main() {
    val cakes = listOf("carrot", "cheese", "chocolate")

    for (cake in cakes) {                       // 1
        println("Yummy, it's a $cake cake!")
    }

/*
    1.	Loops through each cake in the list.
*/

    var cakesEaten = 0
    var cakesBaked = 0

    while (cakesEaten < 5) {            // 1
        eatACake()
        cakesEaten++
    }

    do {                                // 2
        bakeACake()
        cakesBaked++
    } while (cakesBaked < cakesEaten)

/*
    1.	Executes the block while the condition is true.
    2.	Executes the block first and then checking the condition.
*/

    val zoo = Zoo(listOf(Animal("zebra"), Animal("lion")))

    for (animal in zoo) {                               // 3
        println("Watch out, it's a ${animal.name}")
    }

/*
    3.	Loops through animals in the zoo with the user-defined iterator.
*/


}