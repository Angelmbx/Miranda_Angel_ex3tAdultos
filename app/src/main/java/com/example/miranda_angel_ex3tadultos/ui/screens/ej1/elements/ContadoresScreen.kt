package com.example.miranda_angel_ex3tadultos.ui.screens.ej1.elements

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ContadoresScreen(
    contador: Int,
    onDecreaseCounter: () -> Unit,
    onIncreaseCounter: () -> Unit,
    modifier: Modifier = Modifier
) {

    Row(
        Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly,

        ){
        Button(onClick = {onDecreaseCounter()}) {
            Text(text = "Decrementar")
        }
        Text(text = "$contador")
        Button(onClick = {onIncreaseCounter()}) {
            Text(text = "Incrementar")
        }
    }


}

