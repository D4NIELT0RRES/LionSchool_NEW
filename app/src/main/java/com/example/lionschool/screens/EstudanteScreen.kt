package com.example.lionschool.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
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
import com.example.lionschool.R
import com.example.lionschool.screens.components.estudanteComponents

@Composable
fun estudanteScreen() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.BottomCenter
    ){
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(25.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Row (
                    verticalAlignment = Alignment.CenterVertically
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
                Card (
                    modifier = Modifier
                        .width(53.dp)
                        .height(53.dp),
                    shape = RoundedCornerShape(50.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = colorResource(R.color.yellow)
                    )
                ){
                    Box(
                        modifier = Modifier
                            .fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ){
                        Text(
                            text = stringResource(R.string.titulo_ds),
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = colorResource(R.color.blue)
                        )
                    }
                }
            }
            Card (
                modifier = Modifier
                    .height(1.dp)
                    .fillMaxWidth(),
                colors = CardDefaults.cardColors(
                    colorResource(R.color.yellow)
                )
            ){}
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp),
                shape = RoundedCornerShape(12.dp),
                label = { Text(text = stringResource(R.string.cursoEstudante))},
                trailingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "",
                        tint = colorResource(R.color.gray)
                    )
                },
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = colorResource(R.color.yellow),
                    unfocusedContainerColor = colorResource(R.color.light_gray)
                )
            )
            Row (
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painter = painterResource(R.drawable.capelo),
                    contentDescription = "",
                    modifier = Modifier
                        .width(32.dp)
                        .height(32.dp)
                )
                Text(
                    text = stringResource(R.string.lista_estudante),
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = colorResource(R.color.blue),
                    modifier = Modifier
                        .padding(horizontal = 5.dp)
                )
            }
            val yellow = colorResource(R.color.yellow)
            val blue = colorResource(R.color.blue)
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(top = 8.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                estudanteComponents(
                    logo = painterResource(R.drawable.user),
                    text = stringResource(R.string.user1)
                )
                Spacer(modifier = Modifier.size(8.dp))
                estudanteComponents(
                    logo = painterResource(R.drawable.user2),
                    text = stringResource(R.string.user2)
                )
                Spacer(modifier = Modifier.size(8.dp))
                estudanteComponents(
                    logo = painterResource(R.drawable.user3),
                    text = stringResource(R.string.user3),
                    corLateral = blue
                )
                Spacer(modifier = Modifier.size(8.dp))
                estudanteComponents(
                    logo = painterResource(R.drawable.user4),
                    text = stringResource(R.string.user4)
                )
                Spacer(modifier = Modifier.size(8.dp))
                estudanteComponents(
                    logo = painterResource(R.drawable.user5),
                    text = stringResource(R.string.user5),
                    corLateral = blue
                )
                Spacer(modifier = Modifier.size(8.dp))
                estudanteComponents(
                    logo = painterResource(R.drawable.user6),
                    text = stringResource(R.string.user6),
                    corLateral = blue
                )
                Spacer(modifier = Modifier.size(8.dp))
                estudanteComponents(
                    logo = painterResource(R.drawable.user6),
                    text = stringResource(R.string.user6),
                    corLateral = blue
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun estudanteScreenPreview() {
    estudanteScreen()
}