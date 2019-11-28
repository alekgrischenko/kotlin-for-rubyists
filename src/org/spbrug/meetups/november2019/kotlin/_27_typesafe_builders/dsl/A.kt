package org.spbrug.meetups.november2019.kotlin._27_typesafe_builders.dsl

class A : BodyTag("a") {
    var href: String
        get() = attributes["href"]!!
        set(value) {
            attributes["href"] = value
        }
}
