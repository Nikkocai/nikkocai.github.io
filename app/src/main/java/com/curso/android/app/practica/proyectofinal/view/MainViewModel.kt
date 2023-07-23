package com.curso.android.app.practica.proyectofinal.view

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.curso.android.app.practica.proyectofinal.model.InputResult
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {
    val inputResult: LiveData<InputResult> get() = _inputResult
    private var _inputResult = MutableLiveData(InputResult("", "", true))

    fun compareTextFields(text1: String, text2: String) {
        updateResult(text1, text2)
    }

    private fun updateResult(text1:String, text2:String){
        viewModelScope.launch {
            _inputResult.value = InputResult(text1, text2, text1 == text2)
        }
    }
}
