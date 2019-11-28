package org.spbrug.meetups.november2019.kotlin.bookstore.entity

import org.spbrug.meetups.november2019.kotlin.bookstore.enumeration.Employment
import org.spbrug.meetups.november2019.kotlin.bookstore.enumeration.VacancyStatus
import org.spbrug.meetups.november2019.kotlin.bookstore.enumeration.WorkingExperience
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.SequenceGenerator
import javax.persistence.Table

@Entity
@Table(name = "books")
class Book(
        @Id
        @Column(updatable = false)
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "books_sequence")
        @SequenceGenerator(name = "books_sequence", sequenceName = "books_id_seq", allocationSize = 1)
        val id: Int? = null,

        @Column(length = 250, nullable = false)
        val title: String,

        @ManyToOne
        @JoinColumn(name = "author_id", referencedColumnName = "id", nullable = false)
        val author: Author
)
