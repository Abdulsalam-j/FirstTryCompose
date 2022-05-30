package com.example.firsttry

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.FavoriteBorder
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ListItemDemo()
        }
    }
}


@Preview(showBackground = true)
@Composable
fun ListItemDemo(modifier: Modifier = Modifier) {
    Box(modifier = modifier
        .padding(16.dp)
        .background(Color.White)
        .height(100.dp)) {
        Card(
            shape = RoundedCornerShape(15.dp),
            elevation = 5.dp,
            backgroundColor = Color.LightGray
        ) {
            Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(8.dp)) {
                Text(
                    fontWeight = FontWeight.Light,
                    color = Color.DarkGray,
                    text = "Mercedes Benz Motors",
                    textAlign = TextAlign.Center
                )
                Icon(
                    painter = painterResource(id = R.drawable.ic_mercedes_benz_logo),
                    contentDescription = null,
                    modifier.scale(0.35f, 0.35f).absoluteOffset((-20).dp,0.dp),
                    Color.Gray
                )
                Column {
                    modifier.padding(16.dp)
                    Text(
                        text = "5 of 5 Author Rating",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Light,
                        color = Color.DarkGray
                    )
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        for (i in 1..5) {
                            Icon(
                                Icons.Rounded.FavoriteBorder,
                                contentDescription = null,
                                modifier.scale(0.7f)
                            )
                        }
                    }
                }
            }
        }
    }
}