package com.furmannsoft.composeexperience.viewModel

import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.furmannsoft.composeexperience.data.model.Post
import com.furmannsoft.composeexperience.data.network.RetrofitInstance
import kotlinx.coroutines.launch

class PostViewModel: ViewModel() {
    private val _posts = mutableStateOf<List<Post>>(emptyList())
    val posts: State<List<Post>> = _posts

    init {
        fechPosts()
    }

    private fun fechPosts(){
        viewModelScope.launch {
            try {
                _posts.value = RetrofitInstance.api.getPosts()
            } catch(e: Exception) {
                Log.d("error", "$e")
            }
        }
    }
}