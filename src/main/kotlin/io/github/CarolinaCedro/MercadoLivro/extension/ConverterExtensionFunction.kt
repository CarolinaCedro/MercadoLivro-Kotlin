package io.github.CarolinaCedro.MercadoLivro.extension

import io.github.CarolinaCedro.MercadoLivro.controller.request.PostBookRequest
import io.github.CarolinaCedro.MercadoLivro.controller.request.PostCustomerRequest
import io.github.CarolinaCedro.MercadoLivro.controller.request.PutBookRequest
import io.github.CarolinaCedro.MercadoLivro.controller.request.PutCustomerRequest
import io.github.CarolinaCedro.MercadoLivro.enums.BookStatus
import io.github.CarolinaCedro.MercadoLivro.model.BookModel
import io.github.CarolinaCedro.MercadoLivro.model.CustomerModel

fun PostCustomerRequest.toCustomerModel(): CustomerModel{
    return CustomerModel(name = this.name, email = this.email)
}

fun PutCustomerRequest.toCustomerModel(id: Int): CustomerModel{
    return CustomerModel(id = id, name = this.name, email = this.email)
}

fun PostBookRequest.toBookModel(customer: CustomerModel): BookModel {
    return BookModel(
        name = this.name,
        price = this.price,
        status = BookStatus.ATIVO,
        customer = customer
    )
}

fun PutBookRequest.toBookModel(previousValue: BookModel): BookModel{
    return BookModel(
        id = previousValue.id,
        name = this.name ?: previousValue.name, //se for nulo passa o valor q está após o elvis
        price = this.price ?: previousValue.price,
        status = previousValue.status,
        customer = previousValue.customer
    )
}