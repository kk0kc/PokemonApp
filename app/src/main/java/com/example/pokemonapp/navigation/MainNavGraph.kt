package com.example.pokemonapp.navigation

import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.navigation.*
import androidx.navigation.compose.composable
import com.example.pokemonapp.presentation.DetailScreen
import com.example.pokemonapp.presentation.HomeScreen

fun NavGraphBuilder.mainNavGraph(navController: NavHostController) {
    navigation(
        route = Graph.Main,
        startDestination = Screen.Home.route
    ) {
        composable(route = Screen.Home.route) { HomeScreen(navController) }
        composable(
            route = Screen.Detail.route + "/{dominantColor}" + "/{name}",
            arguments = listOf(
                navArgument(name = "dominantColor") { type = NavType.IntType },
                navArgument(name = "name") { type = NavType.StringType },
            )
        )
        { entry ->
            val dominantColor = remember {
                val color = entry.arguments?.getInt("dominantColor")
                color?.let { resColor -> Color(resColor) } ?: Color.White
            }
            val name = entry.arguments?.getString("name") ?: "Poke"
            DetailScreen(navController, dominantColor, name)
        }
    }
}
