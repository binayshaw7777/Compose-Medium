package com.binayshaw7777.compose_medium

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.binayshaw7777.compose_medium.ui.theme.ComposeMediumTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeMediumTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column(
        Modifier.padding(8.dp)
    ) {

        Text(
            fontSize = 14.sp,
            text = "Buttons with Arrangement.SpaceEvenly",
            modifier = Modifier.padding(top = 20.dp, bottom = 10.dp)
        )

        Row(
            Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(onClick = {
                // Do something
            }) {
                Text(text = "Button")
            }
            Button(onClick = {
                // Do something
            }) {
                Text(text = "Second Button")
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            fontSize = 14.sp,
            text = "Buttons with 1f Weight & 16dp Horizontal Padding",
            modifier = Modifier.padding(top = 20.dp, bottom = 10.dp)
        )

        Row(
            Modifier.fillMaxWidth(),
        ) {
            Button(modifier = Modifier
                .weight(1f)
                .padding(horizontal = 16.dp), onClick = {
                // Do something
            }) {
                Text(text = "Button")
            }

            Button(modifier = Modifier
                .weight(1f)
                .padding(horizontal = 16.dp), onClick = {
                // Do something
            }) {
                Text(text = "Second Button")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeMediumTheme {
        Greeting()
    }
}