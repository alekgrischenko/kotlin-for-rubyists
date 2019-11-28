package org.spbrug.meetups.november2019.kotlin._27_typesafe_builders.dsl

class HTML : TagWithText("html") {
    fun head(init: Head.() -> Unit) = initTag(Head(), init)

    fun body(init: Body.() -> Unit) = initTag(Body(), init)
}
