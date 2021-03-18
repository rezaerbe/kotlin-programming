package com.erbe.kotlinlib.bootcamp

// Kotlin Bootcamp for Programmers 4: Object-oriented programming
// https://developer.android.com/codelabs/kotlin-bootcamp-classes

/*
Classes and constructors

Define a class in Kotlin using class.
Kotlin automatically creates setters and getters for properties.
Define the primary constructor directly in the class definition. For example: class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40)
If a primary constructor needs additional code, write it in one or more init blocks.
A class can define one or more secondary constructors using constructor, but Kotlin style is to use a factory function instead.

Visibility modifiers and subclasses

All classes and functions in Kotlin are public by default, but you can use modifiers to change the visibility to internal, private, or protected.
To make a subclass, the parent class must be marked open.
To override methods and properties in a subclass, the methods and properties must be marked open in the parent class.
A sealed class can be subclassed only in the same file where it is defined. Make a sealed class by prefixing the declaration with sealed.

Data classes, singletons, and enums

Make a data class by prefixing the declaration with data.
Destructuring is a shorthand for assigning the properties of a data object to separate variables.
Make a singleton class by using object instead of class.
Define an enum using enum class.

Abstract classes, interfaces, and delegation

Abstract classes and interfaces are two ways to share common behavior between classes.
An abstract class defines properties and behavior, but leaves the implementation to subclasses.
An interface defines behavior, and may provide default implementations for some or all of the behavior.
When you use interfaces to compose a class, the class's functionality is extended by way of the class instances that it contains.
Interface delegation uses composition, but also delegates the implementation to the interface classes.
Composition is a powerful way to add functionality to a class using interface delegation. In general composition is preferred, but inheritance from an abstract class is a better fit for some problems.
*/


/*
Classes are blueprints for objects.
    For example, an Aquarium class is the blueprint for making an aquarium object.
Objects are instances of classes; an aquarium object is one actual Aquarium.
Properties are characteristics of classes, such as the length, width, and height of an Aquarium.
Methods, also called member functions, are the functionality of the class. Methods are what you can "do" with the object.
    For example, you can fillWithWater() an Aquarium object.
An interface is a specification that a class can implement.
    For example, cleaning is common to objects other than aquariums, and cleaning generally happens in similar ways for different objects. So you could have an interface called Clean that defines a clean() method. The Aquarium class could implement the Clean interface to clean the aquarium with a soft sponge.
Packages are a way to group related code to keep it organized, or to make a library of code. Once a package is created, you can import the package's contents into another file and reuse the code and classes in it.
*/

/*
public means visible outside the class. Everything is public by default, including variables and methods of the class.
internal means it will only be visible within that module. A module is a set of Kotlin files compiled together, for example, a library or application.
private means it will only be visible in that class (or source file if you are working with functions).
protected is the same as private, but it will also be visible to any subclasses.
*/

/*
Neither an abstract class nor an interface can be instantiated on its own, which means you cannot create objects of those types directly.
Abstract classes have constructors.
Interfaces can't have any constructor logic or store any state.
*/

/*
A sealed class is a class that can be subclassed, but only inside the file in which it's declared.
If you try to subclass the class in a different file, you get an error.
Sealed classes are great for returning success or error from a network API.
*/

fun main() {
    buildAquarium()

    makeFish()
}

fun buildAquarium() {
    val aquarium1 = Aquarium()
    aquarium1.printSize()
    // default height and length
    val aquarium2 = Aquarium(width = 25)
    aquarium2.printSize()
    // default width
    val aquarium3 = Aquarium(height = 35, length = 110)
    aquarium3.printSize()
    // everything custom
    val aquarium4 = Aquarium(width = 25, height = 35, length = 110)
    aquarium4.printSize()

    val aquarium6 = Aquarium(numberOfFish = 29)
    aquarium6.printSize()
    aquarium6.volume = 70
    aquarium6.printSize()

    val aquarium7 = Aquarium(length = 25, width = 25, height = 40)
    aquarium7.printSize()

    val aquarium8 = TowerTank(diameter = 25, height = 40)
    aquarium8.printSize()
}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}