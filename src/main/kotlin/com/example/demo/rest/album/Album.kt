package com.example.demo.rest.album

import org.springframework.data.relational.core.mapping.Table

@Table(name = "albums")
data class Album(val folder: String, val name: String, val content: String)

data class AlbumId(val folder: String, val name: String)