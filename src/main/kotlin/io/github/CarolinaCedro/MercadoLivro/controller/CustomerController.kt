package io.github.CarolinaCedro.MercadoLivro.controller

import io.github.CarolinaCedro.MercadoLivro.controller.request.PostCustomerRequest
import io.github.CarolinaCedro.MercadoLivro.model.CustomerModel
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class CustomerController {
    @GetMapping
    fun getCustomer(): CustomerModel {
        return CustomerModel("1","Ana","ana@email.com")
    }

    fun create(@RequestBody customer:PostCustomerRequest){
        println(customer)
    }


}