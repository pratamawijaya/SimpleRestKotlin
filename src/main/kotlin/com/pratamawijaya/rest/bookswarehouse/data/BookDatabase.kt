package com.pratamawijaya.rest.bookswarehouse.data

import com.pratamawijaya.rest.bookswarehouse.entity.Book
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

/**
 * Created by pratama on 1/12/17.
 */
@Component
class BookDatabase {

  private val books = mutableListOf<Book>()

  @PostConstruct
  private fun init() {
    books.add(Book(
        "0765326353",
        "The Way of Kings",
        "Brandon Sanderson",
        coverURL = "https://d.gr-assets.com/books/1448127430l/7235533.jpg"
    ))

    books.add(Book(
        "0345391802",
        "The Hitchhiker's Guide to the Galaxy",
        "Douglas Adams",
        coverURL = "https://d.gr-assets.com/books/1327656754l/11.jpg"))

    books.add(Book(
        "076531178X",
        "Mistborn: The Final Empire",
        "Brandon Sanderson",
        coverURL = "https://d.gr-assets.com/books/1437254833l/68428.jpg"))
  }

  fun getBooks() = books

  fun getBookById(id: Int): Book {
    return books[0]
  }

  fun addBook(book: Book): Boolean {
    books.firstOrNull { it.ISBN == book.ISBN }?.let {
      return false
    }

    books.add(book)
    return true
  }


}