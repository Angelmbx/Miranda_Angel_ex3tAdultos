package com.example.miranda_angel_ex3tadultos.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.miranda_angel_ex3tadultos.ui.screens.ej1.elements.Screen1
import com.example.miranda_angel_ex3tadultos.ui.screens.MainScreen


@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = Screens.MainScreen.route) {
        composable(route = Screens.MainScreen.route) { MainScreen(navController) }
        composable(route = Screens.Screen1.route) { Screen1() }
        // composable(route = Screens.Screen2.route) { Screens.Screen2() }
    }
}