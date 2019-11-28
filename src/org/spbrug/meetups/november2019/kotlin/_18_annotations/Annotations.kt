package org.spbrug.meetups.november2019.kotlin._18_annotations

@MustBeDocumented
@Target(AnnotationTarget.CLASS)
annotation class Table(val name: String)

@MustBeDocumented
@Target(AnnotationTarget.PROPERTY)
annotation class Column(val name: String)



@Table(name = "contacts")
data class Contact(
    @Column(name = "id")
    val id: Int,

    @Column(name = "first_name")
    val firstName: String,

    @Column(name = "last_name")
    val lastName: String,

    @Column(name = "email")
    val email: String
)

fun main() {
    val annotation = Contact::class.annotations.find { it.annotationClass.simpleName == "Table" }

    println(annotation)
}
