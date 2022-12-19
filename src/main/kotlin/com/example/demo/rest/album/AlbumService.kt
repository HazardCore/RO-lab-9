package com.example.demo.rest.album

import org.springframework.stereotype.Service

@Service
class AlbumService(val db: AlbumRepository) {
    fun getAll(): List<Album> = db.getAll()

    fun post(album: Album) {
        db.post(album.folder, album.name, album.content)
    }

    fun delete(id: AlbumId) {
        db.delete(id.folder, id.name)
    }

    fun update(album: Album) {
        db.update(album.folder, album.name, album.content)
    }
}