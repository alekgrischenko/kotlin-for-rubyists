package org.spbrug.meetups.november2019.kotlin._27_typesafe_builders

import org.spbrug.meetups.november2019.kotlin._27_typesafe_builders.dsl.HTML

fun render() =
    html {
        head {
            title {+"HTML encoding with Kotlin"}
        }
        body {
            h1 {+"HTML encoding with Kotlin"}
            p  {+"this format can be used as an alternative markup to HTML"}

            // an element with attributes and text content
            a(href = "http://kotlinlang.org") {+"Kotlin"}

            // mixed content
            p {
                +"This is some"
                strong {+"mixed"}
                +"text. For more see the"
                a(href = "http://kotlinlang.org") {+"Kotlin"}
                +"project"
            }
            p {+"some text"}
        }
    }

fun html(init: HTML.() -> Unit): HTML {
    val html = HTML()
    html.init()
    return html
}

fun main() {
    println(render())
}
