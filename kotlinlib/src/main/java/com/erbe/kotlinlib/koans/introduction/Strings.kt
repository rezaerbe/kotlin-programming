package com.erbe.kotlinlib.koans.introduction

/*
Using month variable rewrite this pattern in such a way that it matches the date in format 13 JUN 1992
(two digits, a whitespace, a month abbreviation, a whitespace, four digits).
*/

val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"

fun getPattern(): String = """\d{2} ${month} \d{4}"""

fun main() {
    println(getPattern())
}