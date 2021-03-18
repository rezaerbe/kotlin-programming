package com.erbe.kotlinlib.koans.collections

/*
Implement Shop.getCustomerWithMaximumNumberOfOrders() and Customer.getMostExpensiveOrderedProduct() using max, min, maxBy, or minBy.

listOf(1, 42, 4).max() == 42
listOf("a", "ab").minBy { it.length } == "a"
*/

// Return a customer whose order count is the highest among all customers
fun Shop.getCustomerWithMaximumNumberOfOrders(): Customer? = customers.maxBy { it.orders.size }

// Return the most expensive product which has been ordered
fun Customer.getMostExpensiveOrderedProduct(): Product? =
    orders.flatMap { it.products }.maxBy { it.price }