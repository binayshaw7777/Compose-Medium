package com.binayshaw7777.compose_medium

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.SubcomposeAsyncImage
import coil.request.ImageRequest
import com.binayshaw7777.compose_medium.ui.theme.ComposeMediumTheme

class MainActivity : ComponentActivity() {

    val imageUrl = "https://i.pinimg.com/originals/3d/f4/2a/3df42a95e75f62ee4768c256fff25c39.jpg"
    val brokenImageUrl = "https://i.pinimg.com/originals/3d/f4/2a/3df42a95e755c.jpg"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeMediumTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Blue.copy(alpha = 0.01f)
                ) {
                    Column(
                        Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceAround
                    ) {
                        SubcomposeAsyncImage(
                            modifier = Modifier
                                .size(120.dp)
                                .clip(CircleShape),
                            model = ImageRequest.Builder(LocalContext.current)
                                .data(imageUrl)
                                .error(R.drawable.error_placeholder)
                                .crossfade(true)
                                .build(),
                            loading = {
                                CircularProgressIndicator(
                                    color = Color.Blue,
                                    modifier = Modifier.padding(36.dp)
                                )
                            },
                            contentDescription = null,
                            contentScale = ContentScale.Crop
                        )

                        SubcomposeAsyncImage(
                            modifier = Modifier
                                .size(120.dp)
                                .clip(CircleShape),
                            model = ImageRequest.Builder(LocalContext.current)
                                .data(brokenImageUrl)
                                .error(R.drawable.error_placeholder)
                                .crossfade(true)
                                .build(),
                            loading = {
                                CircularProgressIndicator(
                                    color = Color.Blue,
                                    modifier = Modifier.padding(36.dp)
                                )
                            },
                            contentDescription = null,
                            contentScale = ContentScale.Crop
                        )
                    }
                }
            }
        }
    }
}