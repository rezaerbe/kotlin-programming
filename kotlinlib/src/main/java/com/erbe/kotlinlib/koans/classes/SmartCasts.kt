package com.erbe.kotlinlib.koans.classes

/*
Rewrite the following Java code using smart casts and when expression:

public int eval(Expr expr) {
    if (expr instanceof Num) {
        return ((Num) expr).getValue();
    }
    if (expr instanceof Sum) {
        Sum sum = (Sum) expr;
        return eval(sum.getLeft()) + eval(sum.getRight());
    }
    throw new IllegalArgumentException("Unknown expression");
}
*/

fun eval(expr: Expr): Int =
    when (expr) {
        is Num -> expr.value
        is Sum -> eval(expr.left) + eval(expr.right)
        else -> throw IllegalArgumentException("Unknown expression")
    }

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun main() {
    val num1 = Num(1)
    val num2 = Num(2)
    val sum = Sum(num1, num2)

    println(eval(num1))
    println(eval(sum))
}