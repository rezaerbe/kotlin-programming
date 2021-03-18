package com.erbe.kotlinlib.koans.conventions

/*
Add the function compareTo to the class MyDate to make it comparable.
After that the code below date1 < date2 will start to compile.
*/

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int = when {
        year != other.year -> year - other.year
        month != other.month -> month - other.month
        else -> dayOfMonth - other.dayOfMonth
    }
}

fun compare(date1: MyDate, date2: MyDate) = date1 < date2

fun main() {
    val date1 = MyDate(2021, 1, 11)
    val date2 = MyDate(1998, 5, 12)

    println(compare(date1, date2))
}