package com.pratamawijaya.rest.bookswarehouse.controller

import com.pratamawijaya.rest.bookswarehouse.BookDatabase
import org.springframework.beans.factory.annotation.Autowired
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


}