package com.example.demo.rest.author

import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class AuthorResource(val service: AuthorService) {
    @GetMapping("/authors")
    fun index(): List<Author> = service.getAll()

    @PostMapping("/authors")
    fun post(@RequestBody author: Author) {
        service.post(author)
    }

    @DeleteMapping("/authors/{name}")
    fun delete(@PathVariable("name") name: String) = service.delete(name)
}