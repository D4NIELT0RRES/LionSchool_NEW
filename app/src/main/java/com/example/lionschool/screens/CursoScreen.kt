
package com.example.lionschool.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.lionschool.R
import com.example.lionschool.screens.components.cursoComponents
import kotlin.concurrent.timer


@Composable
fun CursoScreen(){
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
        ){
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
            ) {  }
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp),
                shape = RoundedCornerShape(12.dp),
                label = { Text(text = stringResource(R.string.procurarCurso))},
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
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(R.drawable.lion_list),
                    contentDescription = "",
                    modifier = Modifier
                        .width(26.dp)
                        .height(26.dp)
                )
                Text(
                    text = stringResource(R.string.cursos),
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = colorResource(R.color.blue),
                    modifier = Modifier
                        .padding(horizontal = 5.dp)
                )
            }
            Column (
                modifier = Modifier
                    .fillMaxHeight(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly
            ){
                cursoComponents(
                    logo = painterResource(R.drawable.ds),
                    text = stringResource(R.string.titulo_ds),
                    text2 = stringResource(R.string.subtitulo_ds),
                    description = stringResource(R.string.subdescricao_ds),
                    timer = stringResource(R.string.periodo)
                )
                cursoComponents(
                    logo = painterResource(R.drawable.redes),
                    text = stringResource(R.string.titulo_rds),
                    text2 = stringResource(R.string.subtitulo_rds),
                    description = stringResource(R.string.subdescricao_rds),
                    timer = stringResource(R.string.periodo)
                )
                cursoComponents(
                    logo = painterResource(R.drawable.eletro),
                    text = stringResource(R.string.titulo_ele),
                    text2 = stringResource(R.string.subtitulo_ele),
                    description = stringResource(R.string.subdescricao_ele),
                    timer = stringResource(R.string.periodo)
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
 @Composable
private fun CursoScreenPreview(){
    CursoScreen()
}