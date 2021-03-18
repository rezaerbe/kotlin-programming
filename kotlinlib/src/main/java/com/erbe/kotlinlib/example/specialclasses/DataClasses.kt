package com.erbe.kotlinlib.example.specialclasses

data class User(val name: String, val id: Int)              // 1

fun main() {
    val user = User("Alex", 1)
    println(user)                                           // 2

    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    println("user == secondUser: ${user == secondUser}")    // 3
    println("user == thirdUser: ${user == thirdUser}")

    println(user.hashCode())                                // 4
    println(secondUser.hashCode())
    println(thirdUser.hashCode())

    // copy() function
    println(user.copy())                                    // 5
    println(user.copy("Max"))                               // 6
    println(user.copy(id = 2))                              // 7

    println("name = ${user.component1()}")                  // 8
    println("id = ${user.component2()}")
}

/*
1.	Defines a data class with the data modifier.
2.	Method toString is auto-generated, which makes println output look nice.
3.	Auto-generated equals considers two instances equal if all their properties are equal.
4.	Equal data class instances have equal hashCode().
5.	Auto-generated copy function makes it easy to create a new instance.
6.	When copying, you can change values of certain properties. copy accepts arguments in the same order as the class constructor.
7.	Use copy with named arguments to change the value despite of the properties order.
8.	Auto-generated componentN functions let you get the values of properties in the order of declaration.
*/