package org.spbrug.meetups.november2019.kotlin.bookstore.controller

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.spbrug.meetups.november2019.kotlin.bookstore.service.BookService

@RestController
@RequestMapping(value = ["/api/v1/books"], produces = [MediaType.APPLICATION_JSON_VALUE])
class BookController(private val bookService: BookService) {

    @GetMapping
    fun index() = bookService.findAll()

    @GetMapping("/{id}")
    fun show(@PathVariable(name = "id") id: Int) = bookService.findById(id)
}
