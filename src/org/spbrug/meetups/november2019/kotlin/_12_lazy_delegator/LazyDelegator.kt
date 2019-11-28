package org.spbrug.meetups.november2019.kotlin._12_lazy_delegator

fun lazyDelegatedProperty() {
    val lazyProperty: String by lazy { initLater() }

    println(lazyProperty)
    println(lazyProperty)
    println(lazyProperty)
}

fun initLater(): String {
    println("Some complex computation...")

    return "Result value"
}

fun main() {
    lazyDelegatedProperty()
}
