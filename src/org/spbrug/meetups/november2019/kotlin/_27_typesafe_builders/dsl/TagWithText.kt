package org.spbrug.meetups.november2019.kotlin._27_typesafe_builders.dsl

abstract class TagWithText(name: String) : Tag(name) {
    operator fun String.unaryPlus() {
        children.add(TextElement(this))
    }
}
