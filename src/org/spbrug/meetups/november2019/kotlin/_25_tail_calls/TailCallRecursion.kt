package org.spbrug.meetups.november2019.kotlin._25_tail_calls

fun nonTailRecursionFactorial(number: Int): Int {
    return when (number) {
        0, 1 -> 1
        else -> number + nonTailRecursionFactorial(number - 1)
    }
}

tailrec fun tailRecursionFactorial(number: Int, accumulator: Int = 1): Int {
    return when(number) {
        0, 1 -> accumulator
        else -> tailRecursionFactorial(number - 1, accumulator + number)
    }
}

const val Value = 5000

fun main() {
    println(nonTailRecursionFactorial(Value))
    println(tailRecursionFactorial(Value))
}
