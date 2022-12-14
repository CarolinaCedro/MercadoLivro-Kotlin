package io.github.CarolinaCedro.MercadoLivro.controller.request

import com.fasterxml.jackson.annotation.JsonAlias
import java.math.BigDecimal
import javax.persistence.Id

data class PostBookRequest(
    var name: String,
    var price: BigDecimal,
    @JsonAlias("customer_id")
    var customerId: Int
) {

}
