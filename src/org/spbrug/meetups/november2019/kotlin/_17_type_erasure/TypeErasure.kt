package org.spbrug.meetups.november2019.kotlin._17_type_erasure

inline fun <reified T> checkWithTypeErasure(list: List<Any>) {
    if (list is T) {
        println(list)
    }
}
