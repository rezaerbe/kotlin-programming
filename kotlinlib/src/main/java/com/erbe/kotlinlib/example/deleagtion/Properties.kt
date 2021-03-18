package com.erbe.kotlinlib.example.deleagtion

import kotlin.reflect.KProperty

/*
Kotlin provides a mechanism of delegated properties that allows delegating the calls of the property set and get methods to a certain object.
The delegate object in this case should have the method getValue.
For mutable properties, you'll also need setValue.
*/

class Example {
    var p: String by Delegate()                                                 // 1

    override fun toString(): String = "Example Class"
}

class Delegate() {
    operator fun getValue(thisRef: Any?, prop: KProperty<*>): String {          // 2
        return "$thisRef, thank you for delegating '${prop.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, prop: KProperty<*>, value: String) {   // 2
        println("$value has been assigned to ${prop.name} in $thisRef")
    }
}

/*
1.	Delegates property p of type String to the instance of class Delegate.
The delegate object is defined after the by keyword.
2.	Delegation methods. The signatures of these methods are always as shown in the example.
Implementations may contain any steps you need. For immutable properties only getValue is required.
*/

/*
The Kotlin standard library contains a bunch of useful delegates, like lazy, observable, and others.
You may use them as is. For example lazyis used for lazy initialization.
*/

class LazySample {
    init {
        println("created!")         // 1
    }

    val lazyStr: String by lazy {
        println("computed!")        // 2
        "my lazy"
    }
}

/*
1.	Property lazy is not initialized on object creation.
2.	The first call to get() executes the lambda expression passed to lazy() as an argument and saves the result.
3.	Further calls to get() return the saved result.
If you want thread safety, use blockingLazy() instead: i
t guarantees that the values will be computed only in one thread and that all threads will see the same value.
*/

/*
Property delegation can be used for storing properties in a map.
This is handy for tasks like parsing JSON or doing other "dynamic" stuff.
*/

class User(val map: Map<String, Any?>) {
    val name: String by map                 // 1
    val age: Int by map                     // 1
}

/*
1.	Delegates take values from the map by the string keys - names of properties.
*/

fun main() {

    val e = Example()
    println(e.p)
    e.p = "NEW"

    val sample = LazySample()               // 1
    println("lazyStr = ${sample.lazyStr}")  // 2
    println(" = ${sample.lazyStr}")         // 3

    val user = User(
        mapOf(
            "name" to "John Doe",
            "age" to 25
        )
    )

    println("name = ${user.name}, age = ${user.age}")
}