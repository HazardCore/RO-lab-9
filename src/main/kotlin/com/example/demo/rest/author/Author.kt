package com.example.demo.rest.author

import org.springframework.data.relational.core.mapping.Table

@Table(name = "authors")
data class Author(val name: String)