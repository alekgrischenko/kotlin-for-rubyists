package org.spbrug.meetups.november2019.kotlin._14_generic_constraints

import java.io.Serializable

open class Entity(val id: Int)

class Customer(id: Int): Entity(id), Serializable {
    companion object {
        const val serialVersionUID = 4243729146728914L
    }

    constructor(): this(0)
}

class EntityRepository<T> where T: Entity /* where T: Any? by default */, T: Serializable { //
    fun save(entity: T) {
        if (entity.id != 0) {
            println("Updating an existing entity")
        } else {
            println("Creating a new entity")
        }
    }
}

fun <T> streamObject(obj: T) where T: Entity, T: Serializable {
    println("Streaming object with id: ${obj.id}")
}

fun main() {
    val repository = EntityRepository<Customer>()

    val customerEntity1 = Customer()
    val customerEntity2 = Customer(1)

    repository.save(customerEntity1)
    repository.save(customerEntity2)

    streamObject(customerEntity2)
}
