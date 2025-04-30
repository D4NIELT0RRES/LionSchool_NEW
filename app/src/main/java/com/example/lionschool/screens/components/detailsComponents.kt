package br.senai.sp.jandira.bmi.screens.components


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Performance(text: String, progresso: Int, color: Color) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp), // Espaçamento maior entre os itens
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = text,
            color = Color.White,
            modifier = Modifier.width(50.dp)
        )
        Box(
            modifier = Modifier
                .height(20.dp)
                .weight(1f)
                .background(Color.White, shape = RoundedCornerShape(5.dp))
        ) {
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth(progresso / 100f)
                    .background(color, shape = RoundedCornerShape(5.dp))
            )
        }
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = "$progresso",
            color = Color.White
        )
    }
}


@Preview(showBackground = true)
@Composable
fun PerformanceBarPreview() {
    Column(modifier = Modifier.padding(16.dp)) {
        Performance("SIOP", 80, Color(0xFF4CAF50))
    }
}