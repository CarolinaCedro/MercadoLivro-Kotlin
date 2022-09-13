package io.github.CarolinaCedro.MercadoLivro.service

import io.github.CarolinaCedro.MercadoLivro.model.CustomerModel
import io.github.CarolinaCedro.MercadoLivro.repository.CustomerRepository
import org.springframework.stereotype.Service

@Service
class CustomerService(
    val customerRepository: CustomerRepository
) {
    fun getAll(name: String?): List<CustomerModel> {
        name?.let {
            return customerRepository.findByNameContaining(name)
        }
        return customerRepository.findAll().toList()
    }

    fun create(customer: CustomerModel) {
        customerRepository.save(customer)
    }

    fun getById(id: Int): CustomerModel {
        return customerRepository.findById(id).orElseThrow()
    }

    fun update(customer: CustomerModel) {

        if (!customerRepository.existsById(customer.id!!)) {
            throw Exception()
        }

        customerRepository.save(customer)
    }

    fun delete(id: Int) {

        if (!customerRepository.existsById(id)) {
            throw Exception()
        }

        customerRepository.deleteById(id)
    }
}