package com.example.lionschool.screens.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lionschool.R
import kotlin.math.log

@Composable
fun estudanteComponents(
    logo: Painter = painterResource(R.drawable.user), // foto do aluno
    text: String = "",    // nome do aluno
    text2: String = stringResource(R.string.rm),   // RA do aluno
    timer: String = stringResource(R.string.date),   // ano de conclusão
    corLateral: Color = colorResource(R.color.yellow)
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(80.dp),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(R.color.lion_color_purple_white)
        )
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            // Faixa amarela
            Card(
                modifier = Modifier
                    .width(8.dp)
                    .fillMaxHeight(),
                shape = RoundedCornerShape(topStart = 8.dp, bottomStart = 8.dp),
                colors = CardDefaults.cardColors(
                    containerColor = corLateral
                )
            ) {}

            Row(
                modifier = Modifier
                    .padding(start = 8.dp)
                    .weight(1f)
                    .fillMaxHeight(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = logo,
                    contentDescription = "",
                    modifier = Modifier
                        .size(50.dp)
                        .padding(end = 8.dp)
                )

                Column(
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = text,
                        fontSize = 16.sp,
                        color = Color.White
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            imageVector = Icons.Default.AccountBox,
                            contentDescription = "",
                            colorFilter = ColorFilter.tint(colorResource(R.color.light_gray)),
                            modifier = Modifier.size(15.dp)
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = text2, // RA do aluno
                            color = colorResource(R.color.light_gray),
                            fontSize = 12.sp
                        )
                    }
                }
            }

            // Calendário + Ano
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(bottom = 8.dp, end = 8.dp),
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        imageVector = Icons.Default.DateRange,
                        contentDescription = "",
                        colorFilter = ColorFilter.tint(Color.White),
                        modifier = Modifier.size(18.dp)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = stringResource(R.string.date),
                        color = colorResource(R.color.yellow),
                        fontSize = 14.sp
                    )
                }
            }
        }
    }
}

@Preview
@Composable
private fun estudanteComponentsPreview() {
    estudanteComponents()
}