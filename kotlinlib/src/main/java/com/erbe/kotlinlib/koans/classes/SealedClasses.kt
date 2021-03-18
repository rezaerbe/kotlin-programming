package com.erbe.kotlinlib.koans.classes

/*
Reuse your solution from the previous task, but replace the interface with the sealed class.
Then you no longer need the else branch in when.
*/

fun eval2(expr: Expr2): Int =
    when (expr) {
        is Num2 -> expr.value
        is Sum2 -> eval2(expr.left) + eval2(expr.right)
    }

sealed class Expr2
class Num2(val value: Int) : Expr2()
class Sum2(val left: Expr2, val right: Expr2) : Expr2()

fun main() {
    val num1 = Num2(1)
    val num2 = Num2(2)
    val sum = Sum2(num1, num2)

    println(eval2(num1))
    println(eval2(sum))
}