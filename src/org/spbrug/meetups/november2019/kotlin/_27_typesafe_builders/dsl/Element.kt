package org.spbrug.meetups.november2019.kotlin._27_typesafe_builders.dsl

interface Element {
    fun render(builder: StringBuilder, indent: String)
}
