package com.erbe.kotlinlib.koans.properties

/*
Add a custom getter to make the 'lazy' val really lazy.
It should be initialized by the invocation of 'initializer()' at the moment of the first access.

You can add as many additional properties as you need.

Do not use delegated properties!
*/

class LazyProperty(val initializer: () -> Int) {
    var value: Int? = null
    val lazy: Int
        get() {
            if (value == null) {
                value = initializer()
            }
            return value!!
        }
}