package org.spbrug.meetups.november2019.kotlin._19_collections

import java.util.stream.Collectors

fun main() {
    val listOfNumbers = (1..6).toList()

    println(listOfNumbers.reduce { accumulator, element -> accumulator + element })

    println(listOfNumbers.map { it * 2 }.filter { it < 10 }.toSet())

    println(
        listOfNumbers
            .stream()
            .map { it * 2 }
            .collect(
                Collectors.filtering(
                    { it < 10 },
                    Collectors.toSet<Int>()
                )
            )
    )
}
