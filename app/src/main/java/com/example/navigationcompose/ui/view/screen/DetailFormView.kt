package com.example.navigationcompose.ui.view.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
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

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        listDataForm.forEach {data->
            DetailForm (label = data.first,
                value = data.second)
        }

        Spacer(modifier = Modifier.padding(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Button(
                onClick = { onBackButtonClicked() }
            ) {
                Text("Kembali ke Halaman Utama")
            }
        }
    }
}

@Composable
fun DetailForm(
    label:String,value:String
){
    Row (
        modifier = Modifier.fillMaxWidth().padding(top = 10.dp)
    ){
        Text(text = label,
            modifier = Modifier.weight(0.8f))
        Text(text = ":",
            modifier = Modifier.weight(0.2f))
        Text(text = value,
            modifier = Modifier.weight(2f))
    }
}
