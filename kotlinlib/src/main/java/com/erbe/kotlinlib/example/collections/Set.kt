package com.erbe.kotlinlib.example.collections

/*
A set is an unordered collection that does not support duplicates.
For creating sets, there are functions setOf() and mutableSetOf().
A read-only view of a mutable set can be obtained by casting it to Set.
*/

val openIssues: MutableSet<String> =
    mutableSetOf("uniqueDescr1", "uniqueDescr2", "uniqueDescr3")   // 1

fun addIssue(uniqueDesc: String): Boolean {
    return openIssues.add(uniqueDesc)                                                               // 2
}

fun getStatusLog(isAdded: Boolean): String {
    return if (isAdded) "registered correctly." else "marked as duplicate and rejected."            // 3
}

fun main() {

    val aNewIssue: String = "uniqueDescr4"
    val anIssueAlreadyIn: String = "uniqueDescr2"

    println("Issue $aNewIssue ${getStatusLog(addIssue(aNewIssue))}")                                // 4
    println("Issue $anIssueAlreadyIn ${getStatusLog(addIssue(anIssueAlreadyIn))}")                  // 5
}

/*
1.	Creates a Set with given elements.
2.	Returns a boolean value showing if the element was actually added.
3.	Returns a string, based on function input parameter.
4.	Prints a success message: the new element is added to the Set.
5.	Prints a failure message: the element can't be added because it duplicates an existing element.
*/