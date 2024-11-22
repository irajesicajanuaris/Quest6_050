package com.example.navigationcompose.ui.view.viewmodel

import androidx.lifecycle.ViewModel
import com.example.navigationcompose.model.RencanaStudi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class RencanaStudyViewModel : ViewModel() {
    private val _krsState = MutableStateFlow(RencanaStudi())
    val krsStateUi: StateFlow<RencanaStudi> = _krsState.asStateFlow()

    fun setMataKuliah(mkPilihan: String) {
        _krsState.update { stateMK -> stateMK.copy(Matakuliah = mkPilihan) }
    }

    fun setKelas(kelasPilihan: String){
        _krsState.update{stateKelas -> stateKelas.copy(Kelas = kelasPilihan)}
    }

    fun saveDataKRS(Is: MutableList<String>){
        _krsState.update { status -> status.copy(
            Matakuliah = Is[0],
            Kelas = Is[1]
        ) }
    }
}