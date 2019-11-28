package org.spbrug.meetups.november2019.kotlin._08_companion_objects

class Logger private constructor(private val className: String) {
    companion object Factory {
        @JvmStatic
        fun getLogger(className: String): Logger {
            return Logger(className)
        }
    }

    fun log(message: String) {
        println("$className: $message")
    }
}

fun main() {
    val logger = Logger.getLogger("MyClass")

    logger.log("This is a log message")
}
