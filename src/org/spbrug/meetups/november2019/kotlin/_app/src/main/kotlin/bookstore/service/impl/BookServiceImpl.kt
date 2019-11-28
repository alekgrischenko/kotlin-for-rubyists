package org.spbrug.meetups.november2019.kotlin.bookstore.service.impl

import org.springframework.stereotype.Service
import org.spbrug.meetups.november2019.kotlin.bookstore.entity.Book
import org.spbrug.meetups.november2019.kotlin.bookstore.repository.BookRepository
import org.spbrug.meetups.november2019.kotlin.bookstore.service.BookService

@Service
class BookServiceImpl(val bookRepository: BookRepository): BookService {
    override fun findAll(): List<Book> = bookRepository.findAll()

    override fun findById(id: Int) = bookRepository.findById(id)
}
