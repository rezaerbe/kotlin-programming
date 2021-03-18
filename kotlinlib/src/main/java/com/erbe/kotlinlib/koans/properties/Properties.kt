package com.erbe.kotlinlib.koans.properties

/*
Read about properties in Kotlin.

Add a custom setter to PropertyExample.propertyWithCounter so that the counter property is incremented every time propertyWithCounter is assigned to.
*/

class PropertyExample() {
    var counter = 0
    var propertyWithCounter: Int? = null
        set(v: Int?) {
            field = v
            counter++
        }
}