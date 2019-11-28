package org.spbrug.meetups.november2019.kotlin._26_operators

import java.lang.StringBuilder

data class Time(val hours: Int, val minutes: Int, val seconds: Int) {
    operator fun plus(time: Time): Time {
        return Time(
            hours + time.hours,
            minutes + time.minutes,
            seconds + time.seconds
        )
    }
}

operator fun StringBuilder.plusAssign(builder: StringBuilder) {
    builder.forEach { append(it) }
}

fun main() {
    val newTime = Time(
        10,
        40,
        0
    ) + Time(3, 20, 10)

    println(newTime)

    val stringBuilder1 = StringBuilder("Hello")
    val stringBuilder2 = StringBuilder("World")

    stringBuilder1 += stringBuilder2

    println(stringBuilder1)

    // Scala: (1 to 1000).reduceLeft ( _ * _ )
}
