package com.erbe.kotlinlib.bootcamp

/*
abstract class AquariumFish: FishAction {
    abstract val color: String
    override fun eat() = println("yum")
}
*/

class Shark : FishAction, FishColor {
    override val color = "gray"
    override fun eat() {
        println("hunt and eat fish")
    }
}

class Plecostomus(fishColor: FishColor = GoldColor) :
    FishAction by PrintingFishAction("eat algae"),
    FishColor by fishColor {
}

interface FishAction {
    fun eat()
}

interface FishColor {
    val color: String
}

class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}

object GoldColor : FishColor {
    override val color = "gold"
}

sealed class Seal
class SeaLion : Seal()
class Walrus : Seal()

fun matchSeal(seal: Seal): String {
    return when (seal) {
        is Walrus -> "walrus"
        is SeaLion -> "sea lion"
    }
}