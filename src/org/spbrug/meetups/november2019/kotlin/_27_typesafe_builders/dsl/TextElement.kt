package org.spbrug.meetups.november2019.kotlin._27_typesafe_builders.dsl

class TextElement(private val text: String): Element {
    override fun render(builder: StringBuilder, indent: String) {
        builder.append("$indent$text\n")
    }
}
