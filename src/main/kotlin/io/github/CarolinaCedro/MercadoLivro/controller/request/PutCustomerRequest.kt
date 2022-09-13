package io.github.CarolinaCedro.MercadoLivro.controller.request

import io.github.CarolinaCedro.MercadoLivro.model.CustomerModel
import java.math.BigDecimal

data class PutCustomerRequest (
    var name: String,
    var email: String
){
    fun toCustomerModel(): CustomerModel{
        return CustomerModel(name = this.name, email = this.email)
    }
}

