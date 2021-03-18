package com.erbe.kotlinlib.bootcamp.generics

// Kotlin Bootcamp for Programmers 5.2: Generics
// https://developer.android.com/codelabs/kotlin-bootcamp-generics

/*
A generic type allows you to make a class generic, and thereby make a class much more flexible.
With generics, you can make the list generic, so it can hold any type of object.
It's like making the type a wildcard that will fit many types.
To define a generic type, put T in angle brackets <T> after the class name.
*/

/*
An in type is a type that can only be passed into a class, not returned.
An out type is a type that can only be returned from a class.
*/

/*
Create generic classes to make code more flexible.
Add generic constraints to limit the types used with generics.
Use in and out types with generics to provide better type checking to restrict types being passed into or returned from classes.
Create generic functions and methods to work with generic types. For example: fun <T: WaterSupply> isWaterClean(aquarium: Aquarium<T>) { ... }
Use generic extension functions to add non-core functionality to a class.
Reified types are sometimes necessary because of type erasure. Reified types, unlike generic types, persist to runtime.
Use the check() function to verify your code is running as expected. For example: check(!waterSupply.needsProcessing) { "water supply needs processing first" }
*/

// Todo: Task: Explore generic classes

// Step 1: Make a type hierarchy

open class WaterSupply(var needsProcessing: Boolean)

class TapWater : WaterSupply(true) {
    fun addChemicalCleaners() {
        needsProcessing = false
    }
}

class FishStoreWater : WaterSupply(false)

class LakeWater : WaterSupply(true) {
    fun filter() {
        needsProcessing = false
    }
}

// Step 2: Make a generic class

/*
// all and null
class Aquarium<T>(val waterSupply: T)

// all and not null
class Aquarium<T: Any>(val waterSupply: T)
*/

// specific and not null
class Aquarium<out T : WaterSupply>(val waterSupply: T) {
    fun addWater(cleaner: Cleaner<T>) {
//        check(!waterSupply.needsProcessing) { "water supply needs processing first" }
//        println("adding water from $waterSupply")
        if (waterSupply.needsProcessing) {
            cleaner.clean(waterSupply)
        }
        println("water added")
    }

    inline fun <reified R : WaterSupply> hasWaterSupplyOfType() = waterSupply is R
}

fun addItemTo(aquarium: Aquarium<WaterSupply>) = println("item added")

interface Cleaner<in T : WaterSupply> {
    fun clean(waterSupply: T)
}

class TapWaterCleaner : Cleaner<TapWater> {
    override fun clean(waterSupply: TapWater) = waterSupply.addChemicalCleaners()
}

fun <T : WaterSupply> isWaterClean(aquarium: Aquarium<T>) {
    println("aquarium water is clean: ${!aquarium.waterSupply.needsProcessing}")
}

inline fun <reified T : WaterSupply> WaterSupply.isOfType() = this is T

fun genericsExample() {
    val aquarium = Aquarium<TapWater>(TapWater())
    println("water needs processing: ${aquarium.waterSupply.needsProcessing}")
    aquarium.waterSupply.addChemicalCleaners()
    println("water needs processing: ${aquarium.waterSupply.needsProcessing}")

    // Step 3: Make it more specific
    /*
    val aquarium2 = Aquarium("string")
    println(aquarium2.waterSupply)

    val aquarium3 = Aquarium(null)
    if (aquarium3.waterSupply == null) {
        println("waterSupply is null")
    }
    */

    // Step 4: Add more checking

    /*
    val aquarium4 = Aquarium(LakeWater())
    aquarium4.waterSupply.filter()
    aquarium4.addWater()
    */


    // Todo: Task: Learn about in and out types

    // Step 1: Define an out type

    addItemTo(aquarium)

    // Step 2: Define an in type

    val cleaner = TapWaterCleaner()
    aquarium.addWater(cleaner)


    // Todo: Task: Find out about generic functions

    // Step 1: Make a generic function

    isWaterClean(aquarium)

    // Step 2: Make a generic method with a reified type

    println(aquarium.hasWaterSupplyOfType<TapWater>())  // true

    // Step 3: Make extension functions

    println(aquarium.waterSupply.isOfType<TapWater>())
}

fun main() {
    genericsExample()
}