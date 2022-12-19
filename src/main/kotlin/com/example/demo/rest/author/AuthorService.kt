package com.example.demo.rest.author

import org.springframework.stereotype.Service

@Service
class AuthorService(val db: AuthorRepository) {
    fun getAll(): List<Author> = db.getAll()

    fun post(author: Author) {
        db.post(author.name)
    }

    fun delete(id: String) {
        db.deleteById(id)
    }
}