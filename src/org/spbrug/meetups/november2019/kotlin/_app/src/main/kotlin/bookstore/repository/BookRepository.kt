package org.spbrug.meetups.november2019.kotlin.bookstore.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import org.spbrug.meetups.november2019.kotlin.bookstore.entity.Book

@Repository
interface BookRepository: JpaRepository<Book, Int>
