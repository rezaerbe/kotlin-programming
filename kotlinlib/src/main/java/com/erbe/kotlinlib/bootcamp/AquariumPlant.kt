package com.erbe.kotlinlib.bootcamp

open class AquariumPlant(val color: String, private val size: Int)

fun AquariumPlant.isRed() = color == "red"  // OK
// fun AquariumPlant.isBig() = size > 50       // gives error
// ⇒ error: cannot access 'size': it is private in 'AquariumPlant'

class GreenLeafyPlant(size: Int) : AquariumPlant("green", size)

fun AquariumPlant.print() = println("AquariumPlant")
fun GreenLeafyPlant.print() = println("GreenLeafyPlant")

val AquariumPlant.isGreen: Boolean
    get() = color == "green"

fun AquariumPlant?.pull() {
    this?.apply {
        println("removing $this")
    }
}

fun main() {

    // Todo: Task: Write extensions

    // Step 2: Learn the limitations of extensions

    val plant = GreenLeafyPlant(size = 10)
    plant.print()
    val aquariumPlant: AquariumPlant = plant
    aquariumPlant.print()   // what will it print

    // Step 3: Add an extension property

    println(aquariumPlant.isGreen)

    // Step 4: Know about nullable receivers

    val plant2: AquariumPlant? = null
    plant2.pull()
}