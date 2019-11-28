package org.spbrug.meetups.november2019.kotlin._06_late_initialization

data class Customer(val id: Int, var name: String)

interface Repository<T> {
    fun findAll(): List<T>
}

class CustomerController {
    private lateinit var repository: Repository<Customer>

    fun index() = repository.findAll().map { it.name }.joinToString()
}

fun main() {
    val controller = CustomerController()

    controller.index()
}
