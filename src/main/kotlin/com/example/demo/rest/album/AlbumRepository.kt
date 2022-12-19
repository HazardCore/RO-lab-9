package com.example.demo.rest.album


import org.springframework.data.jdbc.repository.query.Modifying
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param

interface AlbumRepository : CrudRepository<Album, AlbumId> {
    @Query("select * from albums")
    fun getAll(): List<Album>

    @Modifying
    @Query("insert into albums(author, name, content) values (:author, :name, :content)")
    fun post(@Param("author") folder: String, @Param("name") name: String, @Param("content") content: String)

    @Modifying
    @Query("delete from albums where author = :author and name = :name")
    fun delete(@Param("author") folder: String, @Param("name") name: String)

    @Modifying
    @Query("update albums set content = :content where author = :author and name = :name")
    fun update(@Param("author") folder: String, @Param("name") name: String, @Param("content") content: String)
}