package org.spbrug.meetups.november2019.kotlin._21_infix_functions

// only for single parameter extension/member functions
infix fun String.shouldBeEqualTo(value: String) = this == value

fun main() {
    val output = "Hello"

    output shouldBeEqualTo "Hello"

    val params = hashMapOf(
        "host" to "localhost",
        "port" to 8080,
        "user" to "foo",
        "password" to "bar"
    )
}
