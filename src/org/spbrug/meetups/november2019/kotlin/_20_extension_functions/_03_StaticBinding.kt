package org.spbrug.meetups.november2019.kotlin._20_extension_functions

open class BaseClass
class InheritedClass: BaseClass()

fun BaseClass.extension() {
    println("Base extension")
}

fun InheritedClass.extension() {
    println("Inherited extension")
}

fun main() {
    val instance: BaseClass = InheritedClass()

    instance.extension()
}
