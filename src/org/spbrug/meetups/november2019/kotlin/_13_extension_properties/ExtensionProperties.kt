package org.spbrug.meetups.november2019.kotlin._13_extension_properties

val String.hasAmpersand: Boolean
    get() = contains("&")

fun main() {
    println("string has an ampersand: ${"hello & goodbye".hasAmpersand}")
}
