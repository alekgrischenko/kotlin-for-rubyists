package org.spbrug.meetups.november2019.kotlin._23_inline_functions

inline fun operation(op: () -> Unit) {
    println("Before operation")
    op()
    println("After operation")
}

fun main() {
    operation { println("Actual operation") }
}
