package com.example.movieappjet.screen.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.movieappjet.model.Movie
import com.example.movieappjet.model.getMovies
import com.example.movieappjet.navigation.MovieScreen
import com.example.movieappjet.widget.MovieRow

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Movies") },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.LightGray
                )
            )
        }
    ) { innerPadding ->
        MainContent(movieList = getMovies(), padding = innerPadding, navController = navController)
    }
}


@Composable
fun MainContent(
    movieList: List<Movie>,
    padding: PaddingValues,
    navController: NavController
) {
    Column(modifier = Modifier.padding(padding)) {
        LazyColumn(modifier = Modifier.padding(12.dp)) {
            items(items = movieList) { movieName ->
                MovieRow(movie = movieName) { movie ->
                    navController.navigate(route = MovieScreen.DetailsScreen.name + "/$movie")
                }
            }
        }
    }
}