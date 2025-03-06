package com.furmannsoft.composeexperience.data.network

import com.furmannsoft.composeexperience.data.model.Post
import retrofit2.http.GET

interface ApiService {

    @GET("posts")
    suspend fun getPosts(): List<Post>
}