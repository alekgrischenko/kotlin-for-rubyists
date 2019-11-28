package org.spbrug.meetups.november2019.kotlin._11_builtin_delegators

import kotlin.properties.Delegates

data class Employee(val name: String, val email: String) {
    var department: String by Delegates.observable("", { property, oldValue, newValue ->
        println("Property ${property.name} has been changed from $oldValue to $newValue")
    })
}

class Veto {
    var value: String by Delegates.vetoable("Default") { _, _, newValue -> newValue.startsWith("S") }
}

fun main() {
    val employee = Employee(name = "John", email = "doe@example.com")

    employee.department = "IT"

    val veto = Veto()

    println(veto.value)

    veto.value = "London"

    println(veto.value)

    veto.value = "Spain"

    println(veto.value)
}
