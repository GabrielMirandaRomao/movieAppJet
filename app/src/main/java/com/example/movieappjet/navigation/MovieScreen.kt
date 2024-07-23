package com.example.movieappjet.navigation

enum class MovieScreen {
    HomeScreen,
    DetailsScreen;
    companion object {
        fun fromRoute(route: String?): MovieScreen = when (route?.substringBefore("/")) {
            HomeScreen.name -> HomeScreen
            DetailsScreen.name -> DetailsScreen
            null -> HomeScreen
            else -> throw IllegalArgumentException("Route $route is not recognize")
        }
    }
}