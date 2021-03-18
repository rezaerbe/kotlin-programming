package com.erbe.kotlinlib.koans.collections

/*
Implement Shop.getSetOfProductsOrderedByEveryCustomer() using fold.

listOf(1, 2, 3, 4).fold(1, {
    partProduct, element ->
    element * partProduct
}) == 24
*/

// Return the set of products that were ordered by every customer
fun Shop.getSetOfProductsOrderedByEveryCustomer(): Set<Product> {
    val allProducts = customers.flatMap { it.orders.flatMap { it.products } }.toSet()
    return customers.fold(allProducts, { orderedByAll, customer ->
        orderedByAll.intersect(customer.orders.flatMap { it.products }.toSet())
    })
}