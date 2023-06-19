package com.example.facompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt
import com.example.facompose.ui.theme.ComposeFADemoTheme
import com.example.facompose.ui.theme.FarmaciasDelAhorroBlue
import com.example.facompose.ui.theme.Shapes

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeFADemoTheme {
                Scaffold(
                    topBar = {
                        TopAppBar(

                            title = {
                                Column(  modifier = Modifier
                                    .fillMaxWidth()
                                    .offset(x = (-16).dp)) {
                                    Text(
                                        "Monedero plus - Farmacias del…",
                                        fontWeight = FontWeight.W500,
                                        color = Color("#2F2F30".toColorInt()),
                                        fontSize = 16.sp,
                                        textAlign = TextAlign.Center,
                                        modifier = Modifier.fillMaxWidth()
                                    )
                                    Text(
                                        "tudiapp.com.mx",
                                        fontWeight = FontWeight.W500,
                                        textAlign = TextAlign.Center,
                                        color = Color("#2F2F30".toColorInt()).copy(alpha = 0.5f),
                                        fontSize = 10.sp,
                                        modifier = Modifier.fillMaxWidth()

                                    )
                                }
                            },
                            actions = {
                                IconButton(onClick = { println("prueba") }) {
                                    Icon(imageVector = Icons.Filled.MoreVert, contentDescription = "search")
                                }


                            },
                            navigationIcon = {
                                IconButton(onClick = { println("prueba") }) {
                                    Icon(imageVector = Icons.Filled.Close, contentDescription = "search")
                                }
                            },
                            backgroundColor = Color.White
                        )
                    }
                ) { contentPadding ->
                    // Screen content
                    Box(
                        Modifier
                            .fillMaxSize()
                            .padding(contentPadding)
                            .background(color = Color("#F2F2F2".toColorInt()))
                    ) {
                        BodyContent()
                    }
                }
            }
        }
    }
}



@Composable
fun SimpleCard(){
    Card(elevation = 0.dp, modifier = Modifier.padding(0.dp)) {
        Image(painter = painterResource(id = R.drawable.background_fa_card), contentDescription = "empty", modifier = Modifier.width(IntrinsicSize.Max))
        Column() {
            Row(modifier = Modifier.fillMaxWidth()) {
                Image(painter = painterResource(id = R.drawable.ic_fa_coin), contentDescription = null, modifier = Modifier.padding(20.dp))

                Row(modifier = Modifier
                    .padding(20.dp)
                    .fillMaxWidth(0.85f), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.End) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_fa_coin),
                        contentDescription = "coin",
                        modifier = Modifier
                            .width(23.dp)
                            .height(23.dp)
                    )
                    Text(
                        text = "350.00",
                        modifier = Modifier.padding(5.dp, 0.dp, 0.dp, 0.dp),
                        color = Color("#001588".toColorInt()),
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp,
                        maxLines = 1)
                }
            }

            Text(
                text = "Carla Sanchez",
                modifier = Modifier
                    .align(alignment = Alignment.CenterHorizontally)
                    .padding(0.dp, 10.dp, 0.dp, 11.dp),
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp,
                maxLines = 1
            )

            Text(
                text = "Cuenta Clabe:",
                modifier = Modifier
                    .align(alignment = Alignment.CenterHorizontally)
                    .padding(1.dp),
                fontSize = 12.sp,
                color = Color("#3A3C40".toColorInt())
            )

            Text(
                text = "2342492341042901294",
                color = FarmaciasDelAhorroBlue,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
            )

        }
    }
}

@Composable
fun FaCard(){

    Card(shape = RoundedCornerShape(14.dp), modifier = Modifier.padding(10.dp)) {
        Column() {
            SimpleCard()
            Row(modifier = Modifier.fillMaxWidth(1f)) {

                Text(text = "Ver historial",
                    modifier = Modifier
                        .weight(0.5f)
                        .requiredHeight(IntrinsicSize.Min)
                        .align(alignment = Alignment.CenterVertically),
                    maxLines = 1,
                    textAlign = TextAlign.Center,
                    color = Color("#001588".toColorInt()),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium
                )

                Box(modifier = Modifier
                    .size(height = 53.dp, width = 1.dp)
                    .background(color = Color("#ECECEC".toColorInt()))
                ) {
                }

                Text(text = "Ir a Monedero Plus",
                    modifier = Modifier
                        .weight(0.5f)
                        .requiredHeight(IntrinsicSize.Min)
                        .align(alignment = Alignment.CenterVertically),
                    maxLines = 1,
                    textAlign = TextAlign.Center,
                    color = Color("#001588".toColorInt()),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium
                    )
            }
        }
    }
}

@Composable
fun ReturnToFA(){
    Row(modifier = Modifier
        .fillMaxWidth()
        .size(height = 70.dp, width = 1.dp)
        .padding(10.dp)
        .border(
            width = 1.dp,
            color = Color("#D5D9EE".toColorInt()),
            shape = RoundedCornerShape(4.dp)
        )
        .background(color = Color("#E6F2FE".toColorInt())),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Image(
            painter = painterResource(id = R.drawable.ic_arrow_left_fa_color),
            contentDescription = "go back arrow",
            Modifier.padding(12.dp, 0.dp, 0.dp, 0.dp)
        )
        Text(text = "Regresar a Farmacias del Ahorro",
            maxLines = 1,
            textAlign = TextAlign.Center,
            color = Color("#001588".toColorInt()),
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.fillMaxWidth(.95f)
        )

    }
}

@Composable
fun FaFeatureCard(title: String, description: String){
    Row(
        Modifier
            .padding(0.dp, 0.dp, 0.dp, 10.dp)
            .background(color = Color.White)
            .fillMaxWidth()) {
        Column(
            Modifier
                .fillMaxWidth()
                .padding(16.dp, 15.dp, 16.dp, 16.dp)) {

            Text(
                text = title,
                modifier = Modifier
                    .padding(1.dp),
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                color = Color("#3A3C40".toColorInt())
            )

            Text(
                text = description,
                modifier = Modifier
                    .padding(1.dp),
                fontSize = 12.sp,
                fontWeight = FontWeight.W400,
                color = Color("#919090".toColorInt())
            )
        }


        
    }
}

@Composable
fun FaBenefits(benefitList: List<FaBenefits>){
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White),
        contentPadding = PaddingValues(16.dp)
    ){
        item {
            Text(
                text = "BENEFICIOS",
                modifier = Modifier
                    .padding(1.dp),
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                color = Color("#3A3C40".toColorInt())
            )
        }
        items(benefitList){
            BenefitItem(benefit = it)
        }
    }
}

@Composable
fun BenefitItem(benefit: FaBenefits){
    Column(
        Modifier
            .background(Color.White)
            .padding(start = 16.dp, end = 16.dp)) {

        Row(
            Modifier
                .fillMaxWidth()
                .padding(0.dp, 11.dp, 0.dp, 11.dp)) {
            Image(
                painter = painterResource(id = benefit.benefitIcon), contentDescription = "${benefit.benefitIcon}",
                Modifier
                    .weight(0.1f)
                    .padding(0.dp, 5.dp, 10.dp, 0.dp)
            )
            Column(Modifier.weight(0.9f)) {

                Text(
                    text = benefit.benefitTitle,
                    modifier = Modifier
                        .padding(1.dp),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color("#3A3C40".toColorInt())
                )

                Text(
                    text = benefit.benefitDescription,
                    modifier = Modifier
                        .padding(1.dp),
                    fontSize = 12.sp,
                    fontWeight = FontWeight.W400,
                    color = Color("#919090".toColorInt())
                )
            }
        }

        Divider(
            color = Color("#EDEDF3".toColorInt()),
            modifier = Modifier
                .fillMaxWidth()
                .width(2.dp)
        )


    }

}

@Composable
fun Footer(){
    Column(
        Modifier
            .fillMaxWidth()
            .padding(top = 20.dp)) {

        Text(text = "Desasociar mi cuenta Monedero Plus",
            modifier = Modifier.fillMaxWidth(),
            maxLines = 1,
            textAlign = TextAlign.Center,
            color = Color("#001588".toColorInt()),
            fontSize = 14.sp,
            fontWeight = FontWeight.W400
        )

        Text(
            text = "Último acceso: 11/03/2023 11:35",
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 25.dp),
            fontSize = 14.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.W400,
            color = Color("#919090".toColorInt())
        )

        Text(
            text = "Propiedad de Tu Dinero Digital S.A. de C.V. IFPE",
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 12.dp, bottom = 23.dp),
            fontSize = 14.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.W400,
            color = Color("#919090".toColorInt())
        )
    }
}

fun getBenefitItems(): List<FaBenefits>{
    var benefitList = mutableListOf<FaBenefits>()
    benefitList.add(FaBenefits("Bonificaciones en tu Monedero del Ahorro", "Te premiamos en cada compra que realices, acumulando puntos en tu Monedero del Ahorro", R.drawable.ic_coins_benefit))
    benefitList.add(FaBenefits("Paga en tienda", "Genera un código QR de pago para cualquier tienda afiliada a Tudi", R.drawable.ic_mini_qr_code_benefit))
    benefitList.add(FaBenefits("Pago de servicios", "Paga tus servicios desde Tudi y ahórrate tiempo en traslados y filas", R.drawable.ic_mini_payment_benefit))

    return benefitList.toList()
}

@Composable
fun BodyContent() {
    LazyColumn() {
        item {
            ReturnToFA()
            FaCard()
            FaFeatureCard(title = "DEPOSITA EN TIENDAS", description = "Crea un código QR para ingresar dinero a tu cuenta Tudi.")
            FaFeatureCard(title = "CREA UN CÓDIGO QR DE PAGO", description = "Crea un código QR para pagar en algún comercio afiliado a Tudi.")
            Text(
                text = "BENEFICIOS",
                modifier = Modifier
                    .background(Color.White)
                    .padding(start = 16.dp, top = 15.dp)
                    .fillMaxWidth(),
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                color = Color("#3A3C40".toColorInt())
            )

        }
        items(getBenefitItems()){
            BenefitItem(benefit = it)
        }

        item{
            Footer()
        }
    }

}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {

    ComposeFADemoTheme {

        Scaffold(
            topBar = {
                TopAppBar(

                    title = {
                        Column(  modifier = Modifier
                            .fillMaxWidth()
                            .offset(x = (-16).dp)) {
                            Text(
                                "Monedero plus - Farmacias del…",
                                fontWeight = FontWeight.W500,
                                color = Color("#2F2F30".toColorInt()),
                                fontSize = 16.sp,
                                textAlign = TextAlign.Center,
                                modifier = Modifier.fillMaxWidth()
                                )
                            Text(
                                "tudiapp.com.mx",
                                fontWeight = FontWeight.W500,
                                textAlign = TextAlign.Center,
                                color = Color("#2F2F30".toColorInt()).copy(alpha = 0.5f),
                                fontSize = 10.sp,
                                modifier = Modifier.fillMaxWidth()

                            )
                        }
                    },
                    actions = {
                              IconButton(onClick = { println("prueba") }) {
                                  Icon(imageVector = Icons.Filled.MoreVert, contentDescription = "search")
                              }


                    },
                    navigationIcon = {
                        IconButton(onClick = { println("prueba") }) {
                            Icon(imageVector = Icons.Filled.Close, contentDescription = "search")
                        }
                    },
                    backgroundColor = Color.White
                )
            }
        ) { contentPadding ->
            Box(
                Modifier
                    .fillMaxSize()
                    .padding(contentPadding)
                    .background(color = Color("#F2F2F2".toColorInt()))
            ) {
                BodyContent()
            }
        }




    }
}
