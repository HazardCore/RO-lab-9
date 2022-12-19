package com.example.demo.rest.album

import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class AlbumResource(val service: AlbumService) {
    @GetMapping("/albums")
    fun index(): List<Album> = service.getAll()

    @PostMapping("/albums")
    fun post(@RequestBody album: Album) {
        service.post(album)
    }

    @DeleteMapping("/albums/{author}/{name}")
    fun delete(@PathVariable("author") author: String, @PathVariable("name") name: String) = service.delete(AlbumId(author, name))

    @PatchMapping("/albums")
    fun update(@RequestBody album: Album) = service.update(album)
}