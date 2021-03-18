package com.erbe.kotlinlib.example.scopefunctions

/*
The Kotlin standard library function let can be used for scoping and null-checks.
When called on an object, let executes the given block of code and returns the result of its last expression.
The object is accessible inside the block by the reference it.
*/

fun main() {

    val empty = "test".let {            // 1
        print(it)                       // 2
        it.isEmpty()                    // 3
    }
    println(" is empty: $empty")

    fun printNonNull(str: String?) {
        println("Printing \"$str\":")

        str?.let {                      // 4
            print("\t")
            print(it)
            println()
        }
    }

    printNonNull(null)
    printNonNull("my string")
}

/*
1.	Calls the given block on the result on the string "test".
2.	Calls the function on "test" by the it reference.
3.	let returns the value of this expression.
4.	Uses safe call, so let and its code block will be executed only on non-null values.
*/