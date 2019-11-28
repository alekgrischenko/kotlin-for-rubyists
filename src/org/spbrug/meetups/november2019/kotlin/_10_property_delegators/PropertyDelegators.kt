package org.spbrug.meetups.november2019.kotlin._10_property_delegators

import kotlin.reflect.KProperty

interface Service {
    var value: String
}

class PropertyDelegatorService: Service {
    override var value: String by ExternalFunctionality()

    override fun toString(): String = this.javaClass.canonicalName
}

class ExternalFunctionality {
    private var propertyField = "Foo Bar"

    operator fun getValue(service: PropertyDelegatorService, property: KProperty<*>): String {
        println("getValue called with params:\n service: $service\n property name: ${property.name}")
        return propertyField
    }

    operator fun setValue(service: PropertyDelegatorService, property: KProperty<*>, value: String) {
        println("setValue called with params:\n service: $service\n property name: ${property.name}, new value: $value")
        propertyField = value
    }
}

fun Service.logValue() {
    println("Current service value: $value")
}

fun main() {
    val service = PropertyDelegatorService()

    service.logValue()

    service.value = "Baz Quux"

    service.logValue()
}
