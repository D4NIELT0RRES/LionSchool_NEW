import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
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
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Cabeçalho com logo e DS
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 10.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
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
                            .padding(start = 8.dp, bottom = 10.dp)
                    )
                }
                Card(
                    modifier = Modifier.size(53.dp),
                    shape = RoundedCornerShape(50),
                    colors = CardDefaults.cardColors(
                        containerColor = colorResource(R.color.yellow)
                    )
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize(), // Faz o Box ocupar toda a área do Card
                        contentAlignment = Alignment.Center // Centraliza o conteúdo no centro
                    ) {
                        Text(
                            text = stringResource(R.string.titulo_ds),
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = colorResource(R.color.blue)
                        )
                    }
                }
            }

            // Linha amarela
            Card(
                modifier = Modifier
                    .height(1.dp)
                    .fillMaxWidth(),
                colors = CardDefaults.cardColors(
                    colorResource(R.color.yellow)
                )
            ) {}

            // Campo de busca
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 10.dp),
                shape = RoundedCornerShape(12.dp),
                label = { Text(text = stringResource(R.string.cursoEstudante)) },
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

            // Botões de filtro (ajustado padding inferior)
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 4.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 4.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    val buttonHeight = 25.dp

                    Card(
                        modifier = Modifier
                            .weight(1f)
                            .padding(horizontal = 4.dp)
                            .height(buttonHeight),
                        shape = RoundedCornerShape(50),
                        colors = CardDefaults.cardColors(containerColor = colorResource(R.color.blue))
                    ) {
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = stringResource(R.string.filtro_todos),
                                color = Color.White,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }

                    Card(
                        modifier = Modifier
                            .weight(1f)
                            .padding(horizontal = 4.dp)
                            .height(buttonHeight),
                        shape = RoundedCornerShape(50),
                        colors = CardDefaults.cardColors(containerColor = colorResource(R.color.yellow))
                    ) {
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = stringResource(R.string.filtro_cursando),
                                color = colorResource(R.color.blue),
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }

                    Card(
                        modifier = Modifier
                            .weight(1f)
                            .padding(horizontal = 4.dp)
                            .height(buttonHeight),
                        shape = RoundedCornerShape(50),
                        colors = CardDefaults.cardColors(containerColor = colorResource(R.color.yellow))
                    ) {
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = stringResource(R.string.filtro_finalizado),
                                color = colorResource(R.color.blue),
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                }
            }

            // Título "Students List" (ajustado padding para reduzir espaço acima)
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 0.dp, bottom = 4.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Image(
                    painter = painterResource(R.drawable.capelo),
                    contentDescription = "",
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Students List",
                    color = colorResource(R.color.blue),
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            // Lista de estudantes
            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                estudanteComponents(
                    text = stringResource(R.string.user1),
                    text2 = "20151001018",
                    timer = "2022",
                    corLateral = colorResource(R.color.yellow),
                    logo = painterResource(R.drawable.user)
                )
                estudanteComponents(
                    text = stringResource(R.string.user2),
                    text2 = "20151001018",
                    timer = "2022",
                    corLateral = colorResource(R.color.yellow),
                    logo = painterResource(R.drawable.user2)
                )
                estudanteComponents(
                    text = stringResource(R.string.user3),
                    text2 = "20151001018",
                    timer = "2025",
                    corLateral = colorResource(R.color.blue),
                    logo = painterResource(R.drawable.user3)
                )
                estudanteComponents(
                    text = stringResource(R.string.user4),
                    text2 = "20151001018",
                    timer = "2022",
                    corLateral = colorResource(R.color.yellow),
                    logo = painterResource(R.drawable.user4)
                )
                estudanteComponents(
                    text = stringResource(R.string.user5),
                    text2 = "20151001018",
                    timer = "2025",
                    corLateral = colorResource(R.color.blue),
                    logo = painterResource(R.drawable.user5)
                )
                estudanteComponents(
                    text = stringResource(R.string.user6),
                    text2 = "20151001018",
                    timer = "2025",
                    corLateral = colorResource(R.color.blue),
                    logo = painterResource(R.drawable.user6)
                )
                estudanteComponents(
                    text = stringResource(R.string.user6),
                    text2 = "20151001018",
                    timer = "2025",
                    corLateral = colorResource(R.color.blue),
                    logo = painterResource(R.drawable.user6)
                )
            }
        }
    }
}

@Preview
@Composable
private fun estudanteScrenPreview() {
    estudanteScreen()
}