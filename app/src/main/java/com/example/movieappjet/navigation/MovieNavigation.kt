package com.example.movieappjet.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.movieappjet.screen.details.DetailsScreen
import com.example.movieappjet.screen.home.HomeScreen

@Composable
fun MovieNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = MovieScreen.HomeScreen.name
    ) {

        composable(MovieScreen.HomeScreen.name) {
            HomeScreen(navController = navController)
        }

        composable(
            MovieScreen.DetailsScreen.name + "/{movie}",
            arguments = listOf(navArgument(name = "movie") { type = NavType.StringType })
        ) { backstackEntry ->
            DetailsScreen(
                navController = navController,
                backstackEntry.arguments?.getString("movie")
            )
        }

    }
}