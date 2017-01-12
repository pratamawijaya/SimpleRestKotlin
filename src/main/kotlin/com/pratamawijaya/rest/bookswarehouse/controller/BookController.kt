package com.pratamawijaya.rest.bookswarehouse.controller

import com.pratamawijaya.rest.bookswarehouse.data.BookDatabase
import com.pratamawijaya.rest.bookswarehouse.entity.Book
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

/**
 * Created by pratama on 1/12/17.
 */
@RestController
class BookController {

  @Autowired
  private lateinit var database: BookDatabase

  @RequestMapping("/books", method = arrayOf(RequestMethod.GET))
  fun books() = database.getBooks()

  @RequestMapping("/book", method = arrayOf(RequestMethod.GET))
  fun book() = database.getBookById(1)

  @RequestMapping("/book", method = arrayOf(RequestMethod.POST))
  fun addBook(@RequestBody book: Book) {

  }
}