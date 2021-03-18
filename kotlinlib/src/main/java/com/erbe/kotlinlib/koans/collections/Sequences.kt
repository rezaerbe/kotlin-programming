package com.erbe.kotlinlib.koans.collections

/*
Learn about sequences, they allow you to perform operations lazily rather than eagerly.
*/

// Find the most expensive product among all the delivered products
// ordered by the customer. Use `Order.isDelivered` flag.
fun findMostExpensiveProductBy(customer: Customer): Product? {
    return customer
        .orders
        .asSequence()
        .filter(Order::isDelivered)
        .flatMap { it.products.asSequence() }
        .maxBy(Product::price)
}

// Count the amount of times a product was ordered.
// Note that a customer may order the same product several times.
fun Shop.getNumberOfTimesProductWasOrdered2(product: Product): Int {
    return customers
        .asSequence()
        .flatMap(Customer::getOrderedProducts)
        .count { it == product }
}

fun Customer.getOrderedProducts(): Sequence<Product> =
    orders.flatMap(Order::products).asSequence()