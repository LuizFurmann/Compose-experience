package com.furmannsoft.composeexperience

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.furmannsoft.composeexperience.ui.theme.ComposeExperienceTheme
import com.furmannsoft.composeexperience.ui.view.PostListScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeExperienceTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    contentColor = Color.Green
                ) {
                    PostListScreen(paddingValues = it)
                }
            }
        }
    }
}