package com.erbe.kotlinlib.koans.conventions

/*
Read about destructuring declarations and make the following code compile by adding one word.
*/

data class MyDate2(val year: Int, val month: Int, val dayOfMonth: Int)

fun isLeapDay(date: MyDate2): Boolean {

    val (year, month, dayOfMonth) = date

    // 29 February of a leap year
    return year % 4 == 0 && month == 2 && dayOfMonth == 29
}

fun main() {
    val date = MyDate2(2021, 1, 11)

    println(isLeapDay(date))
}