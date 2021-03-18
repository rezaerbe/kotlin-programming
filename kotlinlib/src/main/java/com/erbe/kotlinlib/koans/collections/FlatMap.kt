package com.erbe.kotlinlib.koans.collections

/*
Implement Customer.getOrderedProducts() and Shop.getAllOrderedProducts() using flatMap.

val result = listOf("abc", "12").flatMap { it.toCharList() }
result == listOf('a', 'b', 'c', '1', '2')
*/

// Return all products this customer has ordered
val Customer.orderedProducts: Set<Product>
    get() {
        return orders.flatMap { it.products }.toSet()
    }

// Return all products that were ordered by at least one customer
val Shop.allOrderedProducts: Set<Product>
    get() {
        return customers.flatMap { it.orderedProducts }.toSet()
    }