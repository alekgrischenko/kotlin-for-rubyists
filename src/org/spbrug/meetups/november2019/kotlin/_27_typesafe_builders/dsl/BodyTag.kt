package org.spbrug.meetups.november2019.kotlin._27_typesafe_builders.dsl

abstract class BodyTag(name: String) : TagWithText(name) {
    fun strong(init: Strong.() -> Unit) = initTag(Strong(), init)

    fun p(init: P.() -> Unit) = initTag(P(), init)

    fun h1(init: H1.() -> Unit) = initTag(H1(), init)

    fun a(href: String, init: A.() -> Unit) {
        val a = initTag(A(), init)
        a.href = href
    }
}
