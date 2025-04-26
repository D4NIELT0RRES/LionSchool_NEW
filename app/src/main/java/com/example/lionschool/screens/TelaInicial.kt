package com.example.lionschool.screens

import com.example.lionschool.R

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.windowInsetsTopHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TelaInicial(){

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ){
        Column (
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround
        ){
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = stringResource(R.string.logo_description),
                    modifier = Modifier
                        .height(166.dp)
                        .width(133.dp)
                )
                Text(
                    modifier = Modifier
                        .width(100.dp),
                    text = stringResource(R.string.name_school),
                    fontSize = 30.sp,
                    color = colorResource(R.color.blue)
                )

            }
            Column (
                modifier = Modifier
                    .padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
            ){
                Text(modifier = Modifier
                    .padding(bottom = 10.dp),
                    text = stringResource(R.string.legend),
                    fontSize = 20.sp,
                    color = colorResource(R.color.blue)
                )
                Card (
                    modifier = Modifier
                        .width(90.dp)
                        .background(Color.Yellow)
                        .padding(horizontal = 1.dp, vertical = 2.dp)
                ){
                }
                Text(
                    text = stringResource(R.string.Subtext),
                    fontSize = 15.sp,
                    color = Color.Gray,
                    modifier = Modifier
                        .padding(top = 20.dp),
                    textAlign = TextAlign.Center
                )
            }
            Button(
                onClick = {},
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .width(300.dp)
                    .height(48.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(R.color.yellow)
                ),
                shape = RoundedCornerShape(30.dp),
                border = BorderStroke(2.dp, Color.Black)
            ) {
                Text(
                    text = stringResource(R.string.button),
                    color = Color.Black
                )
            }
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 50.dp , end = 50.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Image(
                    painter = painterResource(R.drawable.youtube),
                    contentDescription = stringResource(R.string.youtube),
                    modifier = Modifier
                        .width(33.dp)
                        .height(33.dp)
                )
                Image(
                    painter = painterResource(R.drawable.twitter),
                    contentDescription = stringResource(R.string.twitter),
                    modifier = Modifier
                        .width(33.dp)
                        .height(33.dp)
                )
                Image(
                    painter = painterResource(R.drawable.instagram),
                    contentDescription = stringResource(R.string.Instagram),
                    modifier = Modifier
                        .width(33.dp)
                        .height(33.dp)
                )
                Image(
                    painter = painterResource(R.drawable.facebook),
                    contentDescription = stringResource(R.string.Facebook),
                    modifier = Modifier
                        .width(33.dp)
                        .height(33.dp)
                )
            }
        }

    }
}

@Preview(showSystemUi = true)
@Composable
private fun TelaInicialPreview() {
    TelaInicial()
}