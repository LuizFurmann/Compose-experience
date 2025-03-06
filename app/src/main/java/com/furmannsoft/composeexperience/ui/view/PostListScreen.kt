package com.furmannsoft.composeexperience.ui.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.furmannsoft.composeexperience.data.model.Post
import com.furmannsoft.composeexperience.ui.theme.PurpleGrey40
import com.furmannsoft.composeexperience.viewModel.PostViewModel

@Composable
fun PostListScreen(postViewModel: PostViewModel = PostViewModel(), paddingValues: PaddingValues) {

    val posts by postViewModel.posts

    if(posts.isEmpty()){
        CircularProgressIndicator()
    }else {
        LazyColumn (
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.padding(paddingValues)
            ) {

            items(posts){
                PostCard(it)
            }
        }
    }
}

@Composable
fun PostCard(post: Post) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(PurpleGrey40)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = "Post #${post.postId}", style = MaterialTheme.typography.bodyLarge, color = Color.Blue)
            Text(text = "Post #${post.title}", style = MaterialTheme.typography.bodyLarge, color = Color.Gray)
            Text(text = "Post #${post.description}", style = MaterialTheme.typography.bodyLarge, color = Color.Black)
        }
    }
}