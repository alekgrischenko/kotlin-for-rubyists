package org.spbrug.meetups.november2019.kotlin._04_sealed_classes

sealed class Result {
    abstract val isSuccess: Boolean
    abstract val isFailure: Boolean

    class Success(val value: String) : Result() {
        override val isSuccess: Boolean
            get() = true
        override val isFailure: Boolean
            get() = false
    }

    class Failure(val error: Exception) : Result() {
        override val isSuccess: Boolean
            get() = false
        override val isFailure: Boolean
            get() = true
    }
}

fun main() {
    val result: Result = Result.Success(value = "a message written by author")

    when (result) {
        is Result.Success -> println(result.value + result.isSuccess)
        is Result.Failure -> System.err.println(result.error.message + result.isSuccess)
    }
}

