package org.spbrug.meetups.november2019.kotlin._22_anonymous_functions

fun operation(x: Int, op: (Int) -> Int): Int = op(x)

fun main() {
    val result1 = operation(3) { it * it } // lambdas can have only single return value
    val result2 = operation(2, fun(x): Int { return if (x < 0) 0 else x * x })
    val result3 = operation(-2, fun(x): Int { return if (x < 0) 0 else x * x })

    println(result1)
    println(result2)
    println(result3)
}
