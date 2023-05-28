package com.example.pokemonapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost

@Composable
fun rootNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Graph.Main) {
        mainNavGraph(navController)
    }
}


object Graph {
    const val Main = "main"
}
