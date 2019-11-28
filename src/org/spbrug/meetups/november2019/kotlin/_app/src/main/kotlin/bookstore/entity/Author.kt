package org.spbrug.meetups.november2019.kotlin.bookstore.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.SequenceGenerator
import javax.persistence.Table

@Entity
@Table(name = "authors")
class Author(
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "authors_sequence")
        @SequenceGenerator(name = "authors_sequence", sequenceName = "authors_id_seq", allocationSize = 1)
        val id: Int,

        @Column(length = 250, nullable = false)
        val name: String
)
