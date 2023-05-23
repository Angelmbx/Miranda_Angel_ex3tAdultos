package com.example.miranda_angel_ex3tadultos.ui.screens.ej1.stateHolders

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel


class ContadoresViewModel: ViewModel() {

    private var _numContadores by mutableStateOf(0)
    val numContadores get() = _numContadores

    private var _texto by  mutableStateOf("")
    val texto get() = _texto

    private var _contador by mutableStateOf(0)
    val contador get() = _contador

    private val _listacount = mutableListOf<Int>()
    val listacount: List <Int> get() = _listacount

    fun onTextFieldChange(newText : String) {
        _texto = newText
    }

    fun onUpdateNumContadores(newNumber : Int) {
        _numContadores = newNumber
    }

    fun onIncreaseCounter (){
        _contador++
    }

    fun onDecreaseCounter(){
        _contador--
    }

    fun onRefreshButton(){
        _numContadores = 0
        _texto=""
    }
}