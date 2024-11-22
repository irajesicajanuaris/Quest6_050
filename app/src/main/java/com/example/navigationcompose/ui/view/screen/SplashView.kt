package com.example.navigationcompose.ui.view.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import com.example.navigationcompose.R

@Composable
fun SplashView(
    onMulaiButton: () -> Unit,
){
    Column(
        modifier = Modifier.fillMaxSize()
            .background(
            color = colorResource(
                id = R.color.primary
            )
        ),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){}
