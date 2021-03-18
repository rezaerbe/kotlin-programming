package com.erbe.kotlinlib.example.functional

data class Item(val name: String, val price: Float)                                 // 1

data class Order(val items: Collection<Item>)

fun Order.maxPricedItemValue(): Float = this.items.maxBy { it.price }?.price ?: 0F  // 2
fun Order.maxPricedItemName() = this.items.maxBy { it.price }?.name ?: "NO_PRODUCTS"

val Order.commaDelimitedItemNames: String                                           // 3
    get() = items.map { it.name }.joinToString()

fun main() {

    val order = Order(listOf(Item("Bread", 25.0F), Item("Wine", 29.0F), Item("Water", 12.0F)))

    println("Max priced item name: ${order.maxPricedItemName()}")                   // 4
    println("Max priced item value: ${order.maxPricedItemValue()}")
    println("Items: ${order.commaDelimitedItemNames}")                              // 5
}

/*
1.	Defines simple models of Item and Order. Order can contain a collection of Item objects.
2.	Adds extension functions for the Order type.
3.	Adds an extension property for the Order type.
4.	Calls extension functions directly on an instance of Order.
5.	Accesses the extension property on an instance of Order.
*/