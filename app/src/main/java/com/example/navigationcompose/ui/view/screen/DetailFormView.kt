package com.example.navigationcompose.ui.view.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.navigationcompose.R
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
            modifier = Modifier
                .fillMaxSize()
                .background(color = colorResource(id = R.color.primary))
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp), verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.karina),
                    contentDescription = "",
                    modifier = Modifier
                        .clip(shape = CircleShape)
                        .size(60.dp)
                )

                Spacer(modifier = Modifier.padding(start = 16.dp))
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = mahasiswa.nama,
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp,
                        color = Color.White
                    )
                    Text(
                        text = mahasiswa.nim,
                        fontWeight = FontWeight.Light,
                        fontSize = 12.sp,
                        color = Color.White
                    )
                }
                Box {
                    Icon(
                        imageVector = Icons.Filled.Notifications,
                        contentDescription = "",
                        tint = Color.White
                    )
                }
            }
        Box( modifier = Modifier
            .background(
                color = Color.White,
                shape = RoundedCornerShape(
                    topEnd = 15.dp,
                    topStart = 15.dp
                )
            )
            .fillMaxSize()) {

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Data Diri",
                    fontWeight = FontWeight.Bold,
                    fontSize = 19.sp
                )
                Text(
                    text = "Hasil Rencana Study kamu",
                    fontSize = 14.sp
                )
                Spacer(modifier = Modifier.padding(8.dp))
                DetailForm(label = "Nama", value = mahasiswa.nama)
                Spacer(modifier = Modifier.padding(4.dp))
                DetailForm(label = "NIM", value = mahasiswa.nim)
                Spacer(modifier = Modifier.padding(4.dp))
                DetailForm(label = "Email", value = mahasiswa.email)
                Spacer(modifier = Modifier.padding(4.dp))
                DetailForm(label = "Matakuliah", value = rencanaStudi.Matakuliah)
                Spacer(modifier = Modifier.padding(4.dp))
                DetailForm(label = "Kelas", value = rencanaStudi.Kelas)
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
