package org.spbrug.meetups.november2019.kotlin._03_data_classes

import java.math.BigDecimal

data class KotlinCustomer(val id: Int, val name: String, val orders: List<KotlinOrder>)

class KotlinOrder(val productId: Int, val price: BigDecimal, val quantity: Int)

fun main() {
    val customer = KotlinCustomer(1, "John Doe", listOf(
        KotlinOrder(1, BigDecimal.valueOf(5.0), 10),
        KotlinOrder(2, BigDecimal.valueOf(10.0), 2)
    ))

    val customer2 = KotlinCustomer(2, "Jane Doe", listOf(
        KotlinOrder(1, BigDecimal.valueOf(5.0), 1)
    ))

    println("${customer.id}: ${customer.name}")

    customer.orders.forEach {
        println(it.price)
    }

    println(customer == customer2)
}
