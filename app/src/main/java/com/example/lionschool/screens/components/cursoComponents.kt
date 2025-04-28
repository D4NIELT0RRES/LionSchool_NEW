package com.example.lionschool.screens.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.relocation.BringIntoViewRequester
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import com.example.lionschool.R
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.math.log

@Composable
fun cursoComponents(
    logo: Painter = painterResource(id = R.drawable.ds ),
    text: String = "",
    text2: String = "",
    description: String = "",
    timer: String = "",
    isFilled: Boolean = false
){
    Card (
        modifier = Modifier
            .width(322.dp)
            .height(190.dp),
        shape = RoundedCornerShape(15.dp),
        border = BorderStroke(1.dp, colorResource(R.color.yellow))
    ){
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.horizontalGradient(
                        listOf(
                            colorResource(R.color.blue),
                            colorResource(R.color.light_white)
                        )
                    )
                )
        ){
            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(18.dp),
                verticalArrangement = Arrangement.SpaceAround
            ){
                Row (
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Image(
                        painter = logo,
                        contentDescription = "",
                        modifier = Modifier
                            .height(102.dp)
                            .width(101.dp)
                    )
                    Text(
                        text = text,
                        fontSize = 64.sp,
                        color = colorResource(R.color.yellow),
                        fontWeight = FontWeight.Bold
                    )
                }
                Column {
                    Text(
                        text = text2,
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = description,
                        color = Color.White,
                        fontWeight = FontWeight.Thin
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.timer),
                        contentDescription = "",
                        modifier = Modifier
                            .width(17.dp)
                            .height(17.dp)
                    )
                    Text(
                        text = timer,
                        color = Color.White,
                        modifier = Modifier
                            .padding(horizontal = 5.dp)
                    )
                }
            }
        }
    }
}

@Preview
@Composable
private fun cursoComponentsPreview() {
    cursoComponents()
}