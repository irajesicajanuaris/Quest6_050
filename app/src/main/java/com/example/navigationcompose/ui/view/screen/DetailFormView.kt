package com.example.navigationcompose.ui.view.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.navigationcompose.model.Mahasiswa
import com.example.navigationcompose.model.RencanaStudi

@Composable
fun DetailFormView(
    mahasiswa: Mahasiswa,
    rencanaStudi: RencanaStudi,
    modifier: Modifier = Modifier,
    onBackButtonClicked: () -> Unit
) {
    val listDataForm = listOf(
        Pair("Nama", mahasiswa.nama),
        Pair("NIM", mahasiswa.nim),
        Pair("E-Mail", mahasiswa.email),
        Pair("MataKuliah", rencanaStudi.Matakuliah),
        Pair("Kelas",rencanaStudi.Kelas),
    )


}