package io.github.CarolinaCedro.MercadoLivro.service

import io.github.CarolinaCedro.MercadoLivro.enums.BookStatus
import io.github.CarolinaCedro.MercadoLivro.model.BookModel
import io.github.CarolinaCedro.MercadoLivro.repository.BookRepository
import org.springframework.stereotype.Service

@Service
class BookService(
    val bookRepository: BookRepository
) {

    fun create(book: BookModel) {
        bookRepository.save(book)
    }

    fun findAll(): List<BookModel> {
        return bookRepository.findAll().toList();
    }

    fun findActives(): List<BookModel> {
        return bookRepository.findByStatus(BookStatus.ATIVO);
    }

    fun findById(id: Int): BookModel {
        return bookRepository.findById(id).orElseThrow();
    }

    fun delete(id: Int) {
        val book = findById(id)
        book.status = BookStatus.CANCELADO
        update(book)
    }

    fun update(book: BookModel) {
        bookRepository.save(book)
    }


}
