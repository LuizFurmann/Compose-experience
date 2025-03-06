package com.furmannsoft.composeexperience.data.model

import com.google.gson.annotations.SerializedName

data class Post(
    @SerializedName("id")
    val postId: String,

    @SerializedName("title")
    val title: String,

    @SerializedName("body")
    val description: String
)
