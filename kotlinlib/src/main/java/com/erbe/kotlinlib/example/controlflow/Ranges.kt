package com.erbe.kotlinlib.example.controlflow

fun main() {
    for (i in 0..3) {           // 1
        print(i)
    }
    println()

    for (i in 0 until 3) {      // 2
        print(i)
    }
    println()

    for (i in 2..8 step 2) {    // 3
        print(i)
    }
    println()

    for (i in 3 downTo 0) {     // 4
        print(i)
    }
    println()

/*
    1.	Iterates over a range starting from 0 up to 3 (inclusive).
    Like 'for(i=0; i<=3; ++i)' in other programming languages (C/C++/Java).
    2.	Iterates over a range starting from 0 up to 3 (exclusive).
    Like for loop in Python or like 'for(i=0; i<3; ++i)' in other programming languages (C/C++/Java).
    3.	Iterates over a range with a custom increment step for consecutive elements.
    4.	Iterates over a range in reverse order.
*/

    for (c in 'a'..'d') {               // 1
        print(c)
    }
    println()

    for (c in 'z' downTo 's' step 2) {  // 2
        print(c)
    }
    println()

/*
    1.	Iterates over a char range in alphabetical order.
    2.	Char ranges support step and downTo as well.
*/
    val x = 2
    if (x in 1..5) {        // 1
        print("x is in range from 1 to 5")
    }
    println()

    if (x !in 6..10) {      // 2
        print("x is not in range fro 6 to 10")
    }

/*
    1.	Checks if a value is in the range.
    2.	!in is the opposite of in.
*/
}