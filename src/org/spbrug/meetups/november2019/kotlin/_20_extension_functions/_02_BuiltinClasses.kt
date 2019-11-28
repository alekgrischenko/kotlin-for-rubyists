package org.spbrug.meetups.november2019.kotlin._20_extension_functions

fun String.toTitleCase() = split(" ").joinToString(" ") { it.capitalize() }

fun main() {
    val child = Child("Foo", "Bar")

    println(child.fullName.toTitleCase())
}
