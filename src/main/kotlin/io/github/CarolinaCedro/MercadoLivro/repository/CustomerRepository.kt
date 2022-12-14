package io.github.CarolinaCedro.MercadoLivro.repository

import io.github.CarolinaCedro.MercadoLivro.model.CustomerModel
import org.springframework.data.repository.CrudRepository

interface CustomerRepository : CrudRepository<CustomerModel, Int>{

    fun findByNameContaining(name: String): List<CustomerModel>
}