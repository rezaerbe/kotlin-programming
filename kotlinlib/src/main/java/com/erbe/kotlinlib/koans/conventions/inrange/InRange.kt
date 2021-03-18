package com.erbe.kotlinlib.koans.conventions.inrange

/*
In Kotlin in checks are translated to the corresponding contains calls:

val list = listOf("a", "b")
"a" in list  // list.contains("a")
"a" !in list // !list.contains("a")

Read about ranges. Add a method fun contains(d: MyDate) to the class DateRange to allow in checks with a range of dates.
*/

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int = when {
        year != other.year -> year - other.year
        month != other.month -> month - other.month
        else -> dayOfMonth - other.dayOfMonth
    }
}

class DateRange(val start: MyDate, val endInclusive: MyDate) {
    operator fun contains(item: MyDate): Boolean = start <= item && item <= endInclusive
}

fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in DateRange(first, last)
}

fun main() {
    val date = MyDate(2012, 12, 12)
    val date1 = MyDate(1998, 5, 12)
    val date2 = MyDate(2021, 1, 11)

    println(checkInRange(date, date1, date2))
}
