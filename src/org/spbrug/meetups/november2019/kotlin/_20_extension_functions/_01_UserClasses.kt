package org.spbrug.meetups.november2019.kotlin._20_extension_functions

open class Parent(val name: String, val children: ArrayList<String>) {
    fun addChild(childName: String) {
        children.add(childName)
    }
}

fun Parent.removeChild(childName: String) {
    children.remove(childName)
}

class Child(private val firstName: String, private val lastName: String) : Parent(firstName, ArrayList()) {
    val fullName: String
    get() = "$firstName $lastName"
}

fun main() {
    val child = Child("Foo", "Bar")

    child.addChild("Baz")
    child.addChild("Quux")

    child.removeChild("Baz")
}
