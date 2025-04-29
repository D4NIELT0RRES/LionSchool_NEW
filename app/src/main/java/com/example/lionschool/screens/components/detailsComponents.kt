package br.senai.sp.jandira.bmi.screens.components

import android.net.http.UrlRequest.Status
import android.text.BoringLayout
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lionschool.R
import com.example.lionschool.screens.detailsScreen

@Composable
fun detailComponents(
    text: String = "SIOP",
    text1: String = "71",
    isFilled: Boolean = false

) {
    Row (
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(top = 5.dp)
            .width(300.dp)
            .background(Color.Cyan)
    ){
        Card (
            modifier = Modifier
                .padding(start = 10.dp)

        ){  }
        Text(
            text = text,
            fontSize = 10.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(
            modifier = Modifier
                .width(25.dp)
        )
        Card(
            modifier = Modifier
                .width(200.dp)
                .height(20.dp),
            shape = RoundedCornerShape(5.dp),
            colors = CardDefaults.cardColors(
                containerColor = colorResource(R.color.white)
            )
        ){
            Card (
                modifier = Modifier
                    .width(100.dp)
                    .height(20.dp),
                shape = RoundedCornerShape(5.dp),
                colors = CardDefaults.cardColors(
                    containerColor = colorResource(R.color.light_green)
                )
            ){}
        }
        Row (
            modifier = Modifier
                .padding(start = 10.dp)
        ){
            Text(
                text = text1,
                fontSize = 11.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}



@Preview
@Composable
private fun detailComponentsPreview() {
    detailComponents()
}