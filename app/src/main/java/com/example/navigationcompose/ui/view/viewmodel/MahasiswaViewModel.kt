package com.example.navigationcompose.ui.view.viewmodel

import androidx.lifecycle.ViewModel
import com.example.navigationcompose.model.Mahasiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MahasiswaViewModel : ViewModel() {

    //requ
    private val mahasiswaStateUI =
        MutableStateFlow(Mahasiswa())

   val mahasiswaUiState: StateFlow<Mahasiswa> = mahasiswaStateUI.asStateFlow()

    fun saveDataMahasiswa(ls: MutableList<String>) {
        mahasiswaStateUI.update { statusSaatIni ->
            statusSaatIni.copy(
                nim = ls[0],
                nama = ls[1],
                email = ls[2]
            )
        }
    }
}

