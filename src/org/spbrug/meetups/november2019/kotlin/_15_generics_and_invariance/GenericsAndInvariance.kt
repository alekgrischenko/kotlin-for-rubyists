package org.spbrug.meetups.november2019.kotlin._15_generics_and_invariance

open class Person

class Employee: Person()

fun operateOnSingle(person: Person) {
    println("Operating on single ${person.javaClass.name}")
}

fun operateOnMultiple(people: Array<Person>) {
    println("Operating on multiple ${people[0].javaClass.name}")
}

fun operateOnMultiple2(people: List<Person>) {
    println("Operating on multiple ${people.first().javaClass.name}")
}

interface ReadOnlyRepository<out T> {
    fun findOne(id: Int): T
    fun findAll(): List<T>
}

interface WriteOnlyRepository<in T> {
    fun save(obj: T)
    fun saveAll(list: List<T>)
}

fun main() {
    val person = Person()
    val employee = Employee()

    operateOnSingle(person)
    operateOnSingle(employee)

    val people: Array<Employee> = arrayOf(employee) // arrays are invariant
    val people2: List<Employee> = listOf(employee) // immutable collection interfaces are covariant (out)

    // operateOnMultiple(people)
    operateOnMultiple2(people2)
}
