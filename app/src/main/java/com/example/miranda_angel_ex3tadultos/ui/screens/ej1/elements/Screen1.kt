package com.example.miranda_angel_ex3tadultos.ui.screens.ej1.elements

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.miranda_angel_ex3tadultos.ui.screens.ej1.stateHolders.ContadoresViewModel

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun Screen1() {

    val ContadoresViewModel: ContadoresViewModel = viewModel()

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text =  "Contadores") /* stringResource(id = R.string.app_name)) */},
                actions = {
                    if (ContadoresViewModel.numContadores != 0) {
                        IconButton(onClick = { ContadoresViewModel.onRefreshButton() }) {
                            Icon(
                                imageVector = Icons.Filled.Refresh,
                                contentDescription = "Go back to main screen"
                            )
                        }
                    }
                })
        }
    )
    { padding ->

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues = padding),
        ) {
            if (ContadoresViewModel.numContadores == 0) {
                TextFieldScreen(
                    texto = ContadoresViewModel.texto,
                    onTextFieldChange = {ContadoresViewModel.onTextFieldChange(it)},
                    onUpdateNumContadores = {ContadoresViewModel.onUpdateNumContadores(ContadoresViewModel.texto.toInt())} ,
                )
            } else {
                repeat(ContadoresViewModel.numContadores) {
                    ContadoresScreen(
                        contador = ContadoresViewModel.contador,
                        onDecreaseCounter = {ContadoresViewModel.onDecreaseCounter()},
                        onIncreaseCounter = {ContadoresViewModel.onIncreaseCounter()}
                    )
                }

            }
        }
    }
}


