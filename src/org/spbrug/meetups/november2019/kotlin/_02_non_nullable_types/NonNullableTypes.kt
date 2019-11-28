package org.spbrug.meetups.november2019.kotlin._02_non_nullable_types

fun main() {
    val nullableString: String? = null
    val nonNullableString: String = ""

    nonNullableString.length

    nullableString?.length

    nullableString!!.length

    nullableString.let {
        // Elvis operator :?
        val length = it?.length ?: 0

        println("Length of a nullable string: $length")
    }

    // Class casting safety
    /*
    val scanner = nonNullableString as? Scanner

    while (scanner.hasNextLine()) {
        println(scanner.nextLine())
    }
    */
}
