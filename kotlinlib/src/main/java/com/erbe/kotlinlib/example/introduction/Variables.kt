package com.erbe.kotlinlib.example.introduction

fun main() {

    var a: String = "initial"   // 1
    println(a)
    val b: Int = 1              // 2
    val c = 3                   // 3

/*
    1.	Declares a mutable variable and initializes it.
    2.	Declares an immutable variable and initializes it.
    3.	Declares an immutable variable and initializes it without specifying the type. The compiler infers the type Int.
*/

    var e: Int      // 1
    // println(e)   // 2

/*
    1.	Declares a variable without initialization.
    2.	An attempt to use the variable causes a compiler error: Variable 'e' must be initialized.
*/

/*
    val d: Int  // 1

    if (someCondition()) {
        d = 1   // 2
    } else {
        d = 2   // 2
    }

    println(d)  // 3
*/

/*
    1.	Declares a variable without initialization.
    2.	Initializes the variable with different values depending on some condition.
    3.	Reading the variable is possible because it's already been initialized.
*/
}