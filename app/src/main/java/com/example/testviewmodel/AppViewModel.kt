package com.example.testviewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.testviewmodel.Data.Dataform
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class AppViewModel : ViewModel(){
    var usrName:String by mutableStateOf("")
        private set
    var telphone:String by mutableStateOf("")
        private set
    var email:String by mutableStateOf("")
        private set
    var jk:String by mutableStateOf("")
        private set
    var statuspn:String by mutableStateOf("")
        private set
    var alamat:String by mutableStateOf("")
        private set

    private val _uiState = MutableStateFlow(Dataform())
    val uiState: StateFlow<Dataform> = _uiState.asStateFlow()
}