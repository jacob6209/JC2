package com.example.jc2.ui.screen.helper

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jc2.ui.theme.AppGray

@Composable
fun TotalBalance() {
    Column(
        Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = "Total Balance", fontSize = 21.sp, color = AppGray)
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "$54,869.00", fontSize = 35.sp,
            fontWeight = FontWeight.Bold, color = Color.Black
        )


    }
}