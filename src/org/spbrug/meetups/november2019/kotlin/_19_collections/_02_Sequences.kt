package org.spbrug.meetups.november2019.kotlin._19_collections

fun main() {
    val elements = 1..100_000_000

    println(
        elements.asSequence().filter { it < 30 }.take(10).sum()
    )
}
