package io.github.CarolinaCedro.MercadoLivro.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class CustomerController {
    @GetMapping
    fun helloWorld(): String {
        return "Hello word"
    }


}