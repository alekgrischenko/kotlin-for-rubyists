package org.spbrug.meetups.november2019.kotlin.bookstore.service

import org.spbrug.meetups.november2019.kotlin.bookstore.entity.Book
import java.util.Optional

interface BookService {
    fun findAll(): List<Book>

    fun findById(id: Int): Optional<Book>
}
