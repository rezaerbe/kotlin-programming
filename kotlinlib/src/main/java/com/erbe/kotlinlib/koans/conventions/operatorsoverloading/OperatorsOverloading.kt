package com.erbe.kotlinlib.koans.conventions.operatorsoverloading

import java.util.*

/*
Implement a kind of date arithmetic. Support adding years, weeks and days to a date. You could be able to write the code like this: date + YEAR * 2 + WEEK * 3 + DAY * 15.
At first, add an extension function 'plus()' to MyDate, taking a TimeInterval as an argument. Use an utility function MyDate.addTimeIntervals() declared in DateUtil.kt
Then, try to support adding several time intervals to a date. You may need an extra class.
*/

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

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

enum class TimeInterval { DAY, WEEK, YEAR }

operator fun MyDate.plus(timeInterval: TimeInterval) = addTimeIntervals(timeInterval, 1)

class RepeatedTimeInterval(val timeInterval: TimeInterval, val number: Int)

operator fun TimeInterval.times(number: Int) = RepeatedTimeInterval(this, number)

operator fun MyDate.plus(timeIntervals: RepeatedTimeInterval) =
    addTimeIntervals(timeIntervals.timeInterval, timeIntervals.number)

fun task1(today: MyDate): MyDate {
    return today + TimeInterval.YEAR + TimeInterval.WEEK
}

fun task2(today: MyDate): MyDate {
    return today + TimeInterval.YEAR * 2 + TimeInterval.WEEK * 3 + TimeInterval.DAY * 5
}

fun main() {
    val date = MyDate(2021, 1, 11)

    println(task1(date))
    println(task2(date))
}