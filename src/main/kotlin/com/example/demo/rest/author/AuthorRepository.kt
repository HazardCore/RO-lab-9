package com.example.demo.rest.author

import org.springframework.data.jdbc.repository.query.Modifying
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param

interface AuthorRepository : CrudRepository<Author, String> {
    @Query("select * from authors")
    fun getAll(): List<Author>

    @Modifying
    @Query("insert into authors(name) values (:name)")
    fun post(@Param("name") name: String)
}