package ru.netology.repository

import androidx.lifecycle.LiveData
import ru.netology.dto.Post

interface PostRepository {
    fun getAll(): LiveData<List<Post>>
    fun getPostById(id: Long) : Post?
    fun likeById(id: Long)
    fun shareById(id: Long)
    fun removeById(id: Long)
    fun save(post: Post)
    fun openVideo(post: Post)
}
