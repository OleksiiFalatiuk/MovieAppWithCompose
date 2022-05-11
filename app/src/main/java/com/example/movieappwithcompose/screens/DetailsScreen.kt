package com.example.movieappwithcompose.screens

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.movieappwithcompose.MainViewModel

@Composable
fun DetailsScreen(navController: NavController, viewModel: MainViewModel, itemId: String){
    Text(text = "DetailsScreen itemId: ${itemId}")
}