package com.example.movieappjet

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.movieappjet.navigation.MovieNavigation
import com.example.movieappjet.ui.theme.MovieAppJetTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {
                MovieNavigation()
            }
        }
    }
}

@Composable
fun MyApp(content: @Composable () -> Unit) {
    MovieAppJetTheme {
        content()
    }
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    MovieNavigation()
}