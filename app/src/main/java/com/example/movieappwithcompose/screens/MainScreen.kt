package com.example.movieappwithcompose.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun MainScreen(){
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = "Test")
    }
}