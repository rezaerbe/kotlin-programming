package com.erbe.kotlinlib.example.introduction

class Customer                                  // 1

class Contact(val id: Int, var email: String)   // 2

fun main() {

    val customer = Customer()                   // 3

    val contact = Contact(1, "mary@gmail.com")  // 4

    println(contact.id)                         // 5
    contact.email = "jane@gmail.com"            // 6
}

/*
1.	Declares a class named Customer without any properties or user-defined constructors. A non-parameterized default constructor is created by Kotlin automatically.
2.	Declares a class with two properties: immutable id and mutable email, and a constructor with two parameters id and email.
3.	Creates an instance of the class Customer via the default constructor. Note that there is no new keyword in Kotlin.
4.	Creates an instance of the class Contact using the constructor with two arguments.
5.	Accesses the property id.
6.	Updates the value of the property email.
*/