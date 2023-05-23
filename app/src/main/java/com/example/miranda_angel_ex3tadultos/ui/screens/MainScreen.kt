package com.example.miranda_angel_ex3tadultos.ui.screens

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.navigation.NavController
import com.example.miranda_angel_ex3tadultos.ui.navigation.Screens


@Composable
fun MainScreen(navController: NavController) {

    when (LocalConfiguration.current.orientation) {
        Configuration.ORIENTATION_PORTRAIT -> {

            Column(
                modifier = Modifier
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Button(onClick = { navController.navigate(route = Screens.Screen1.route) }) {
                    Text(text = "Ejercicio 1")
                }
                Button(onClick = { navController.navigate(route = Screens.Screen2.route) }) {
                    Text(text = "Ejercicio 2")
                }

            }
        }


        Configuration.ORIENTATION_LANDSCAPE -> {
            Box(Modifier.fillMaxSize(), Alignment.Center) {
                Column() {
                    Button(onClick = { navController.navigate(route = Screens.Screen1.route) }) {
                        Text(text = "Ejercicio 1")
                    }
                    Button(onClick = { navController.navigate(route = Screens.Screen2.route) }) {
                        Text(text = "Ejercicio 2")
                    }
                }
            }
        }
        else -> throw RuntimeException()
    }
}
