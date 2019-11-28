package org.spbrug.meetups.november2019.kotlin._24_local_returns

fun performIterationsA() {
    (1..100).forEach {
        if (it % 5 == 0) {
            return // non-local returns are only allowed for non-inline functions
        }
    }
    println("performIterationsA done")
}

fun performIterationsB() {
    (1..100).forEach {
        if (it % 5 == 0) {
            return@forEach
        }
    }
    println("performIterationsB done")
}

fun performIterationsC() {
    (1..100).forEach iterationsLabel@ {
        if (it % 5 == 0) {
            return@iterationsLabel
        }
    }
    println("performIterationsC done")
}

fun performIterationsD() {
    (1..100).forEach (fun(element) {
        if (element % 5 == 0) {
            return
        }
    })
    println("performIterationsD done")
}

fun main() {
    performIterationsA()
    performIterationsB()
    performIterationsC()
    performIterationsD()
}
