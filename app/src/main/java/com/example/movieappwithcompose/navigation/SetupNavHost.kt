package com.example.movieappwithcompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.movieappwithcompose.MainViewModel
import com.example.movieappwithcompose.screens.DetailsScreen
import com.example.movieappwithcompose.screens.MainScreen
import com.example.movieappwithcompose.screens.SplashScreen
import com.example.movieappwithcompose.utils.Constants.Screens.DETAILS_SCREEN
import com.example.movieappwithcompose.utils.Constants.Screens.MAIN_SCREEN
import com.example.movieappwithcompose.utils.Constants.Screens.SPLASH_SCREEN


sealed class Screens(val route: String){
    object Splash: Screens(SPLASH_SCREEN)
    object Main: Screens(MAIN_SCREEN)
    object Details: Screens(DETAILS_SCREEN)
}

@Composable
fun SetupNavHost(navController: NavHostController, viewModel: MainViewModel){
    NavHost(
        navController = navController,
        startDestination = Screens.Splash.route
    ){
        composable(Screens.Splash.route){
            SplashScreen(navController, viewModel)
        }
        composable(Screens.Main.route){
            MainScreen(navController, viewModel)
        }
        composable(Screens.Details.route + "/{Id}"){ backStackEntry ->
            DetailsScreen(viewModel = viewModel, itemId = backStackEntry.arguments?.getString("Id") ?: "1")
        }
    }
}