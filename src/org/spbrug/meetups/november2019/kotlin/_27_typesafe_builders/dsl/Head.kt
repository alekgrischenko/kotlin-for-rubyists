package org.spbrug.meetups.november2019.kotlin._27_typesafe_builders.dsl

class Head : TagWithText("head") {
    fun title(init: Title.() -> Unit) = initTag(Title(), init)
}
