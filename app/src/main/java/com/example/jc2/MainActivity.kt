package com.example.jc2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jc2.model.CardModel
import com.example.jc2.ui.screen.helper.HeaderRow
import com.example.jc2.ui.screen.helper.TotalBalance
import com.example.jc2.ui.theme.AppGray
import com.example.jc2.ui.theme.JC2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            JC2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    mainView()
                }
            }
        }
    }
}

//try to type Somthing secend4
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun mainView() {
    val cardList = listOf(
        CardModel("6104 3378 0936 4412", "42/05", "Yaghob Ebrabhimi"),
        CardModel("6104 378 0936 5512", "43/05", "Yaghob Hashemi"),
        CardModel("5804 3378 0936 4412", "42/08", "Reza Cameri"),
        CardModel("5804 3378 0936 5512", "43/01", "Jasem Haghbarast")
    )
    Box(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.fillMaxWidth()) {
            HeaderRow()
            Spacer(modifier = Modifier.height(25.dp))
            TotalBalance()
            Spacer(modifier = Modifier.height(25.dp))
            LazyRow(contentPadding = PaddingValues(25.dp)) {
                items(cardList.size) {
                    Card(
                        modifier = Modifier
                            .width(280.dp)
                            .height(160.dp)
                            .padding(end = 10.dp),
                        onClick = {},
                        shape = RoundedCornerShape(15.dp),
                        elevation = CardDefaults.cardElevation(8.dp),
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(15.dp))
                        ) {
                            Column(
                                Modifier
                                    .fillMaxWidth()
                                    .background(AppGray)
                            ) {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(20.dp, 20.dp, 20.dp, 15.dp),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Text(text = "Debit Card", fontSize = 14.sp)
                                    Image(
                                        painter = painterResource(id = R.drawable.master),
                                        contentDescription = "master",
                                        Modifier.width(40.dp)
                                    )
                                }
                                Box(
                                    Modifier.fillMaxWidth().padding(5.dp,5.dp,5.dp,20.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(
                                        text = cardList[it].no,
                                        fontSize = 20.sp,
                                        color = Color.Black
                                    )
                                }
                                Box(Modifier.fillMaxWidth())
                                Row(
                                    Modifier.fillMaxWidth().background(Color.Black).padding(25.dp,13.dp),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Text(
                                        text = cardList[it].owner,
                                        fontSize = 15.sp,
                                        color = Color.White
                                    )
                                    Text(
                                        text = cardList[it].expire,
                                        fontSize = 15.sp,
                                        color = Color.White
                                    )
                                }
                            }
                        }

                    }
                }
            }

        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JC2Theme {
        mainView()
    }
}