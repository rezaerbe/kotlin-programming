package com.erbe.kotlinlib.example.functional

// All examples create a function object that performs upper-casing.
// So it's a function from String to String

val upperCase1: (String) -> String = { str: String -> str.toUpperCase() }   // 1

val upperCase2: (String) -> String = { str -> str.toUpperCase() }           // 2

val upperCase3 = { str: String -> str.toUpperCase() }                       // 3

// val upperCase4 = { str -> str.toUpperCase() }                            // 4

val upperCase5: (String) -> String = { it.toUpperCase() }                   // 5

val upperCase6: (String) -> String = String::toUpperCase                    // 6

fun main() {
    println(upperCase1("hello"))
    println(upperCase2("hello"))
    println(upperCase3("hello"))
    println(upperCase5("hello"))
    println(upperCase6("hello"))
}

/*
1.	A lambda in all its glory, with explicit types everywhere. The lambda is the part in curly braces,
which is assigned to a variable of type (String) -> String (a function type).
2.	Type inference inside lambda: the type of the lambda parameter is inferred from the type of the variable it's assigned to.
3.	Type inference outside lambda: the type of the variable is inferred from the type of the lambda parameter and return value.
4.	You cannot do both together, the compiler has no chance to infer the type that way.
5.	For lambdas with a single parameter, you don't have to explicitly name it.
Instead, you can use the implicit it variable. This is especially useful when the type of it can be inferred (which is often the case).
6.	If your lambda consists of a single function call, you may use function pointers (::) .
*/