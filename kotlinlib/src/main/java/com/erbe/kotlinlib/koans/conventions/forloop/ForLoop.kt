package com.erbe.kotlinlib.koans.conventions.forloop

import java.util.*

/*
Kotlin for loop iterates through anything that provides an iterator.
Make the class DateRange implement Iterable<MyDate>, so that it could be iterated over.
You can use the function MyDate.nextDay() defined in DateUtil.kt
*/

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate) = when {
        year != other.year -> year - other.year
        month != other.month -> month - other.month
        else -> dayOfMonth - other.dayOfMonth
    }
}

operator fun MyDate.rangeTo(other: MyDate) = DateRange(this, other)

fun MyDate.nextDay() = addTimeIntervals(TimeInterval.DAY, 1)

enum class TimeInterval {
    DAY,
    WEEK,
    YEAR
}

fun MyDate.addTimeIntervals(timeInterval: TimeInterval, number: Int): MyDate {
    val c = Calendar.getInstance()
    c.set(year, month, dayOfMonth)
    when (timeInterval) {
        TimeInterval.DAY -> c.add(Calendar.DAY_OF_MONTH, number)
        TimeInterval.WEEK -> c.add(Calendar.WEEK_OF_MONTH, number)
        TimeInterval.YEAR -> c.add(Calendar.YEAR, number)
    }
    return MyDate(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DATE))
}

class DateRange(val start: MyDate, val end: MyDate) : Iterable<MyDate> {
    override fun iterator(): Iterator<MyDate> = DateIterator(this)
}

class DateIterator(val dateRange: DateRange) : Iterator<MyDate> {
    var current: MyDate = dateRange.start
    override fun next(): MyDate {
        val result = current
        current = current.nextDay()
        return result
    }

    override fun hasNext(): Boolean = current <= dateRange.end
}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}

