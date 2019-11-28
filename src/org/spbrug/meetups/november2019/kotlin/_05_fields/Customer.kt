package org.spbrug.meetups.november2019.kotlin._05_fields

class Customer {
    var lastPurchasedAmount: Double = 0.0
        set(value) {
            if (value > 100) {
                field = value
            }
        }
}

fun main() {
    val customer = Customer()

    println(customer.lastPurchasedAmount)

    customer.lastPurchasedAmount = 200.0

    println(customer.lastPurchasedAmount)

    customer.lastPurchasedAmount = 50.0

    println(customer.lastPurchasedAmount)
}
