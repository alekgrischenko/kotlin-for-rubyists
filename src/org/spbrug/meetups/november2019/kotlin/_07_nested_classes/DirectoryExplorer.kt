package org.spbrug.meetups.november2019.kotlin._07_nested_classes

import java.lang.Exception

class DirectoryExplorer(private val user: String) {

    fun listFolder(folder: String) {
        val validator = PermissionsValidator()

        validator.validatePermissions()
    }

    private inner class PermissionsValidator {
        fun validatePermissions() {
            if (user != "admin") {
                throw PermissionValidationException("Insufficient permissions for '$user'")
            }

            // perform other validations...
        }
    }
}

class PermissionValidationException(message: String): Exception(message)

fun main() {
    val directoryExplorer = DirectoryExplorer("user")

    directoryExplorer.listFolder(".")

    // DirectoryExplorer.PermissionsValidator
}
