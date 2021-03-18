package com.erbe.kotlinlib.example.specialclasses

import java.util.*

class LuckDispatcher {                  // 1
    fun getNumber() {                   // 2
        var objRandom = Random()
        println(objRandom.nextInt(90))
    }
}

fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int): Unit {  // 1

    val dayRates = object {                                                     // 2
        var standard: Int = 30 * standardDays
        var festivity: Int = 50 * festivityDays
        var special: Int = 100 * specialDays
    }

    val total = dayRates.standard + dayRates.festivity + dayRates.special       // 3

    print("Total price: $$total")                                               // 4
}

object DoAuth {                                                 // 1
    fun takeParams(username: String, password: String) {        // 2
        println("input Auth parameters = $username:$password")
    }
}

class BigBen {                      // 1
    companion object Bonger {       // 2
        fun getBongs(nTimes: Int) { // 3
            for (i in 1..nTimes) {
                print("BONG ")
            }
        }
    }
}

fun main() {
    val d1 = LuckDispatcher()           // 3
    val d2 = LuckDispatcher()

    d1.getNumber()                      // 4
    d2.getNumber()

    rentPrice(10, 2, 1)                                                         // 5

    DoAuth.takeParams("foo", "qwerty")                          // 3

    BigBen.getBongs(12)             // 4
}

/*
1.	Defines a blueprint.
2.	Defines a method.
3.	Creates instances.
4.	Calls the method on instances.
*/

/*
1.	Creates a function with parameters.
2.	Creates an object to use when calculating the result value.
3.	Accesses the object's properties.
4.	Prints the result.
5.	Calls the function. This is when the object is actually created.
*/

/*
1.	Creates an object declaration.
2.	Defines the object method.
3.	Calls the method. This is when the object is actually created.
*/

/*
1.	Defines a class.
2.	Defines a companion. Its name can be omitted.
3.	Defines a companion object method.
4.	Calls the companion object method via the class name.
*/