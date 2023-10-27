package com.example.testviewmodel

import android.provider.ContactsContract.CommonDataKinds.Email
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.testviewmodel.Data.Dataform
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

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

    fun insertData(unm: String, tlp: String, mail: String, jkel: String, sts: String, almt: String){
        usrName = unm;
        telphone = tlp;
        email = mail;
        jk = jkel;
        statuspn = sts;
        alamat = almt;
    }

    fun setJenisK(pilihJK: String){
        _uiState.update { currentState -> currentState.copy(sex = pilihJK) }
    }

}