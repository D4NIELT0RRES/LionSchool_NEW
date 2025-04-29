package com.example.lionschool.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.bmi.screens.components.detailComponents

import com.example.lionschool.R

@Composable
fun detailsScreen() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.BottomCenter
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(25.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ){
                Image(
                    painter = painterResource(R.drawable.logo),
                    contentDescription = stringResource(R.string.name_school),
                    modifier = Modifier
                        .width(45.dp)
                        .height(56.dp)
                        .padding(vertical = 5.dp)
                )
                Text(
                    text = stringResource(R.string.name_school),
                    fontSize = 15.sp,
                    color = colorResource(R.color.blue),
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Default,
                    modifier = Modifier
                        .width(50.dp)
                        .padding(bottom = 10.dp)
                )
            }
            Card(
                modifier = Modifier
                    .height(1.dp)
                    .fillMaxWidth(),
                colors = CardDefaults.cardColors(
                    colorResource(R.color.yellow)
                )
            ){}
            Box(
                modifier = Modifier
                    .padding(top = 20.dp)
                    .background(
                        color = colorResource(R.color.yellow),
                        shape = RoundedCornerShape(100.dp),
                    )
            ){
                Image(
                    painter = painterResource(R.drawable.luana),
                    contentDescription = "",
                    modifier = Modifier
                        .width(152.dp)
                        .height(152.dp)
                )
            }
            Text(
                text = "Luana Oliveira Dias",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                color = colorResource(R.color.blue),
                modifier = Modifier
                    .padding(top = 12.dp)
            )
            Text(
                text = stringResource(R.string.text),
                fontSize = 14.sp,
                color = colorResource(R.color.blue)
            )
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp),
                colors = CardDefaults.cardColors(
                    colorResource(R.color.lion_color_purple_white)
                )
            ) {
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .height(500.dp)
                ) {
                    Text(
                        text = stringResource(R.string.desempenho),
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }
            }
            detailComponents(
                text = stringResource(R.string.text1),
                text1 = stringResource(R.string.)
            )
        }
    }
}

@Preview
@Composable
private fun detailsScreenPreview() {
    detailsScreen()
}