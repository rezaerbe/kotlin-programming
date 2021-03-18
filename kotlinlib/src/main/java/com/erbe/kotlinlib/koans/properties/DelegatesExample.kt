package com.erbe.kotlinlib.koans.properties

/*
Read about delegated properties and make the property lazy by using delegates.
*/

class LazyProperty2(val initializer: () -> Int) {
    val lazyValue: Int by lazy(initializer)
}