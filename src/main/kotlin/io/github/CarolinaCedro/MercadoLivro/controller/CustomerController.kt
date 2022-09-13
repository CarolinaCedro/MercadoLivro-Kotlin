package io.github.CarolinaCedro.MercadoLivro.controller

import io.github.CarolinaCedro.MercadoLivro.controller.request.PostCustomerRequest
import io.github.CarolinaCedro.MercadoLivro.controller.request.PutCustomerRequest
import io.github.CarolinaCedro.MercadoLivro.model.CustomerModel
import io.github.CarolinaCedro.MercadoLivro.service.CustomerService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("customer")
class CustomerController (
    val customerService: CustomerService
){
    @GetMapping
    fun getAll(@RequestParam name: String?): List<CustomerModel> {
        return customerService.getAll(name)
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody customer: PostCustomerRequest){
        customerService.create(customer.toCustomerModel())
    }

    @GetMapping("/{id}")
    fun getCustomer(@PathVariable id: Int): CustomerModel {
        return customerService.getById(id)
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun update(@PathVariable id: Int, @RequestBody customer: PutCustomerRequest) {
        customerService.update(customer.toCustomerModel())
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun delete(@PathVariable id: Int) {
        customerService.delete(id)
    }
}