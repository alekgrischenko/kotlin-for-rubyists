@file:JvmName("CustomerUtility")
package org.spbrug.meetups.november2019.kotlin

const val CopyrightYear = 2019

data class Customer(val id: Int, var name: String, var status: Status = Status.NEW) {
    @JvmField
    val kind = "customer"

    @JvmOverloads
    fun changeStatus(newStatus: Status = Status.PENDING) {
        status = newStatus
    }

    @JvmName("preferential")
    fun makePreferred() {

    }

    @Throws(java.lang.IllegalArgumentException::class)
    fun loadStatistics(filename: String) {
        if (filename == "") {
            throw IllegalArgumentException("Filename can not be empty")
        }
    }
}

fun Customer.extension() = println("Extension called")

enum class Status {
    NEW,
    PENDING,
    PROCESSED
}

