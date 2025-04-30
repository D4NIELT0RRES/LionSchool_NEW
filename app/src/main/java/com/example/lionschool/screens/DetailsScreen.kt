package com.example.lionschool.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.bmi.screens.components.Performance
import com.example.lionschool.R

@Composable
fun detailsScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.BottomCenter
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(25.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
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
                    modifier = Modifier
                        .padding(start = 8.dp)
                )
            }

            Card(
                modifier = Modifier
                    .height(1.dp)
                    .fillMaxWidth(),
                colors = CardDefaults.cardColors(
                    colorResource(R.color.yellow)
                )
            ) {}

            Box(
                modifier = Modifier
                    .padding(top = 20.dp)
                    .size(152.dp)
                    .clip(CircleShape)
                    .border(4.dp, colorResource(R.color.yellow), CircleShape)
            ) {
                Image(
                    painter = painterResource(R.drawable.luana),
                    contentDescription = "",
                    modifier = Modifier.fillMaxSize()
                )
            }

            Text(
                text = "Luana Oliveira Dias",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                color = colorResource(R.color.blue),
                modifier = Modifier.padding(top = 12.dp)
            )
            Text(
                text = stringResource(R.string.text),
                fontSize = 14.sp,
                color = colorResource(R.color.blue)
            )

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(500.dp)
                    .padding(top = 20.dp),
                shape = RoundedCornerShape(25.dp),
                colors = CardDefaults.cardColors(
                    colorResource(R.color.lion_color_purple_white)
                )
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(20.dp)
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = stringResource(R.string.desempenho),
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )

                        Spacer(modifier = Modifier.height(20.dp))

                        Performance("SIOP", 77, Color(0xFF4CAF50))
                        Spacer(modifier = Modifier.height(12.dp))
                        Performance("INRI", 86, Color(0xFF4CAF50))
                        Spacer(modifier = Modifier.height(12.dp))
                        Performance("INNU", 59, Color(0xFFFFC107))
                        Spacer(modifier = Modifier.height(12.dp))
                        Performance("HA", 100, Color(0xFF4CAF50))
                        Spacer(modifier = Modifier.height(12.dp))
                        Performance("SERE", 44, Color(0xFFF44336))
                        Spacer(modifier = Modifier.height(12.dp))
                        Performance("CAES", 52, Color(0xFFFFC107))
                    }

                    // Texto "Concluído" no canto inferior direito
                    Row(
                        modifier = Modifier
                            .align(Alignment.BottomEnd),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.End
                    ) {
                        Icon(
                            imageVector = Icons.Default.CheckCircle,
                            contentDescription = "Concluído",
                            tint = Color(0xFF4CAF50)
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = "Concluído",
                            color = Color.White,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }
            }
        }
    }
}

@Preview
@Composable
private fun detailsScreenPreview() {
    detailsScreen()
}