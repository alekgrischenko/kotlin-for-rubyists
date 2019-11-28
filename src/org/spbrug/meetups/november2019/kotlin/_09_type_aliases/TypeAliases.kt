package org.spbrug.meetups.november2019.kotlin._09_type_aliases

typealias Name = String
typealias Email = String

data class Employee(val name: Name, val email: Email) {
    fun sayMessage(message: Name) {
        print("$name <$email> said: $message")
    }
}

fun main() {
    val employee = Employee("John", "doe@example.com")

    employee.sayMessage("Hello!")
}
