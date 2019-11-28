package org.spbrug.meetups.november2019.kotlin._16_metaprogramming

import java.lang.reflect.Type
import kotlin.reflect.full.memberProperties

class AccountTransaction(val id: Int, private val amount: Double, var comment: String = "Default value") {
    companion object {
        const val MAX_AMOUNT = 10_000
    }

    fun validate() {
        if (amount > MAX_AMOUNT) {
            println("AccountTransaction is too large")
        }
    }
}

fun introspectInstance(obj: Any) {
    println("Class: ${obj.javaClass.simpleName}")
    println("--- Properties:")
    obj.javaClass.declaredFields.forEach {
        println("${it.name} of type ${it.type}")
    }
    println("--- Functions:")
    obj.javaClass.declaredMethods.forEach {
        println(it.name)
    }
}

fun introspectType(type: Type) {
    println(type.typeName)
}

fun main() {
    val transaction = AccountTransaction(id = 1, amount = 2000.0, comment = "A simple transaction")
    introspectInstance(transaction)

    introspectType(AccountTransaction::class.java)

    val constructor = ::AccountTransaction
    val transaction2 = constructor.call(1, 2000.0, "A transaction created meta-programmatically")

    val transaction3 = constructor.callBy(mapOf(
        constructor.parameters[0] to 1,
        constructor.parameters[1] to 2000.0
    ))

    val idParam = constructor.parameters.first { it.name == "id" }
    val amountParam = constructor.parameters.first { it.name == "amount" }

    val transaction4 = constructor.callBy(mapOf(
        idParam to 1,
        amountParam to 2000.0
    ))

    val transaction5 = AccountTransaction(1, 1000.0, "A new value")

    val commentProperty = AccountTransaction::class.memberProperties.find { it.name == "comment" }

    println(transaction2.comment)
    println(transaction3.comment)
    println(transaction4.comment)
    println(commentProperty!!.get(transaction5))
}
