package com.erbe.kotlinlib.koans.conventions.rangeto

/*
Implement the function MyDate.rangeTo(). This allows you to create a range of dates using the following syntax:

MyDate(2015, 5, 11)..MyDate(2015, 5, 12)

Note that now the class DateRange implements the standard ClosedRange interface and inherits contains method implementation.
*/

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int = when {
        year != other.year -> year - other.year
        month != other.month -> month - other.month
        else -> dayOfMonth - other.dayOfMonth
    }
}

operator fun MyDate.rangeTo(other: MyDate) = DateRange(this, other)

class DateRange(override val start: MyDate, override val endInclusive: MyDate) : ClosedRange<MyDate>

fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in first..last
}

fun main() {
    val date = MyDate(2012, 12, 12)
    val date1 = MyDate(1998, 5, 12)
    val date2 = MyDate(2021, 1, 11)

    println(date1.rangeTo(date2))

}