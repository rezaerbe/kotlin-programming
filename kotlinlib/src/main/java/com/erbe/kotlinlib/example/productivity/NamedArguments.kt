package com.erbe.kotlinlib.example.productivity

/*
Kotlin supports passing arguments to methods and constructors according to the order they are defined.
Kotlin also supports named arguments to allow clearer invocations and avoid mistakes with the order of arguments.
*/

fun main() {

/*
    println(format("mario", "example.com"))                     // 1
    println(format("domain.com", "username"))                   // 2
    println(format(userName = "foo", domain = "bar.com"))       // 3
    println(format(domain = "frog.com", userName = "pepe"))     // 4
*/
}

/*
1.	Calls a function with argument values.
2.	Calls a function with switched arguments. No syntax errors, but the result domain.com@username is incorrect.
3.	Calls a function with named arguments.
4.	When invoking a function with named arguments, you can specify them in any order you like.
*/