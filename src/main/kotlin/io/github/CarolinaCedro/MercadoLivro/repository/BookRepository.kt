package io.github.CarolinaCedro.MercadoLivro.repository

import io.github.CarolinaCedro.MercadoLivro.enums.BookStatus
import io.github.CarolinaCedro.MercadoLivro.model.BookModel
import io.github.CarolinaCedro.MercadoLivro.model.CustomerModel
import org.springframework.data.repository.CrudRepository

interface BookRepository : CrudRepository<BookModel, Int>{
    abstract fun findByStatus(status: BookStatus): List<BookModel>
}