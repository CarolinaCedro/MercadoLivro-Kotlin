package io.github.CarolinaCedro.MercadoLivro.controller

import io.github.CarolinaCedro.MercadoLivro.controller.request.PostCustomerRequest
import io.github.CarolinaCedro.MercadoLivro.model.CustomerModel
import io.github.CarolinaCedro.MercadoLivro.service.CustomerService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class CustomerController(
    val customerService: CustomerService
) {
    @GetMapping
    fun getCustomer(): CustomerModel {
        return CustomerModel("1", "Ana", "ana@email.com")
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody customer: PostCustomerRequest) {
        println(customer)
    }


}