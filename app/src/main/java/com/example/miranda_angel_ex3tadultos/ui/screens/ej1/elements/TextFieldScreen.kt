package com.example.miranda_angel_ex3tadultos.ui.screens.ej1.elements

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldScreen(
    texto: String,
    onUpdateNumContadores: (Int) -> Unit,
    onTextFieldChange: (String) -> Unit,
    modifier: Modifier = Modifier
) {


    val context = LocalContext.current

    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        OutlinedTextField(
            value = texto,
            onValueChange = { onTextFieldChange(it) },
            label = { Text(text = "Numero de contadores") }
        )

        Button(
            onClick = {
                if (texto.isNotBlank()) {
                    onUpdateNumContadores(texto.toIntOrNull() ?: 0)
                    onTextFieldChange("")
                } else
                    Toast.makeText(context, " Debes introducir un número", Toast.LENGTH_SHORT).show()
            }) {
            Text(text = "Mostrar contadores")
        }

    }
}