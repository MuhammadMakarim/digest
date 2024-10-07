package com.example.digest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import com.example.digest.ui.theme.DigestTheme
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp

class MonitoringDigest : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DigestTheme {
                MonitoringDigestPreview()
            }
        }
    }
}
@Composable
fun Monitoring(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 387.dp)
            .requiredHeight(height = 812.dp)
            .clip(shape = RoundedCornerShape(28.dp))
            .background(brush = Brush.radialGradient(
                0f to Color(0xff222039),
                1f to Color(0xff222039),
                center = Offset(154.98f, 406f),
                radius = 234.51f))
    ) {
        Image(
            painter = painterResource(id = R.drawable.bg_kondisi),
            contentDescription = "Kondisi Digeter 1",
            modifier = Modifier
                .requiredWidth(width = 387.dp)
                .requiredHeight(height = 812.dp))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 32.dp,
                    y = 164.dp)
                .requiredWidth(width = 322.dp)
                .requiredHeight(height = 138.dp)
        ) {
            Text(
                text = "Capacity",
                color = Color.White,
                lineHeight = 1.6.em,
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold),
                modifier = Modifier
                    .align(alignment = Alignment.CenterStart)
                    .offset(x = 0.dp,
                        y = (-57.2034330368042).dp)
                    .fillMaxWidth()
                    .requiredHeight(height = 24.dp))
            Row(
                horizontalArrangement = Arrangement.spacedBy(24.dp, Alignment.Start),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 0.dp,
                        y = 33.dp)
                    .requiredWidth(width = 322.dp)
                    .requiredHeight(height = 105.dp)
                    .clip(shape = RoundedCornerShape(14.dp))
                    .background(color = Color(0xffe8e8e8).copy(alpha = 0.4f))
                    .padding(horizontal = 24.dp,
                        vertical = 8.dp)
            ) {
                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(
                        verticalArrangement = Arrangement.spacedBy(4.dp, Alignment.Top),
                        modifier = Modifier
                            .padding(start = 8.dp,
                                bottom = 8.dp)
                    ) {
                        Text(
                            text = "73%",
                            color = Color(0xff4057e3),
                            textAlign = TextAlign.Center,
                            lineHeight = 1.45.em,
                            style = TextStyle(
                                fontSize = 22.sp,
                                fontWeight = FontWeight.Bold),
                            modifier = Modifier
                                .requiredWidth(width = 58.dp)
                                .requiredHeight(height = 25.dp))
                    }
                    Box(
                        modifier = Modifier
                            .requiredSize(size = 72.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .requiredSize(size = 72.dp)
                                .clip(shape = CircleShape)
                                .border(border = BorderStroke(2.dp, Color(0xffa9a9a9)),
                                    shape = CircleShape))
                        Image(
                            painter = painterResource(id = R.drawable.diagrama),
                            contentDescription = "Ellipse 7",
                            modifier = Modifier
                                .requiredSize(size = 72.dp)
                                .border(border = BorderStroke(10.dp, Color(0xff4057e3))))
                    }
                }
                Column(
                    verticalArrangement = Arrangement.spacedBy(4.dp, Alignment.Top),
                    modifier = Modifier
                        .requiredWidth(width = 120.dp)
                        .requiredHeight(height = 47.dp)
                ) {
                    Text(
                        text = "3,65 L",
                        color = Color(0xff151e35),
                        lineHeight = 1.2.em,
                        style = TextStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold),
                        modifier = Modifier
                            .wrapContentHeight(align = Alignment.CenterVertically))
                    Text(
                        text = "of 5L max Capaity",
                        color = Color(0xff151e35),
                        lineHeight = 1.33.em,
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Black),
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight(align = Alignment.CenterVertically))
                }
            }
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 314.dp,
                    y = 58.dp)
                .requiredWidth(width = 31.dp)
                .requiredHeight(height = 29.dp)
                .clip(shape = RoundedCornerShape(30.dp))
                .padding(all = 8.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.ikona),
                contentDescription = "Functions w",
                contentScale = ContentScale.Inside,
                modifier = Modifier
                    .requiredWidth(width = 37.dp)
                    .requiredHeight(height = 34.dp))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 31.dp,
                    y = 58.dp)
                .requiredWidth(width = 146.dp)
                .requiredHeight(height = 32.dp)
        ) {
            Text(
                text = "Digester",
                color = Color.White,
                lineHeight = 0.89.em,
                style = TextStyle(
                    fontSize = 36.sp,
                    fontWeight = FontWeight.Bold),
                modifier = Modifier
                    .align(alignment = Alignment.CenterStart)
                    .offset(x = 0.dp,
                        y = 0.dp)
                    .fillMaxWidth())
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 32.dp,
                    y = 341.dp)
                .requiredWidth(width = 322.dp)
                .requiredHeight(height = 287.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(60.dp, Alignment.Start),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 0.dp,
                        y = 33.0360107421875.dp)
                    .requiredWidth(width = 322.dp)
                    .requiredHeight(height = 254.dp)
                    .clip(shape = RoundedCornerShape(15.dp))
                    .background(color = Color(0xffe8e8e8).copy(alpha = 0.4f))
                    .padding(horizontal = 19.dp,
                        vertical = 24.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 110.dp)
                        .requiredHeight(height = 49.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .requiredWidth(width = 110.dp)
                            .clip(shape = RoundedCornerShape(15.dp))
                            .background(color = Color(0xff3ce5fc))
                    ) {
                        Box(
                            modifier = Modifier
                                .requiredWidth(width = 62.dp)
                                .requiredHeight(height = 30.dp)
                        ) {
                            Text(
                                text = "C",
                                color = Color.Black,
                                style = TextStyle(
                                    fontSize = 25.sp,
                                    fontWeight = FontWeight.Medium),
                                modifier = Modifier
                                    .align(alignment = Alignment.TopStart)
                                    .offset(x = 39.32421875.dp,
                                        y = 0.dp)
                                    .requiredWidth(width = 20.dp))
                            Text(
                                text = "22",
                                color = Color.Black,
                                style = TextStyle(
                                    fontSize = 25.sp,
                                    fontWeight = FontWeight.Medium),
                                modifier = Modifier
                                    .requiredWidth(width = 62.dp))
                            Box(
                                modifier = Modifier
                                    .align(alignment = Alignment.TopStart)
                                    .offset(x = 29.858154296875.dp,
                                        y = 4.75927734375.dp)
                                    .requiredSize(size = 9.dp)
                                    .clip(shape = CircleShape)
                                    .border(border = BorderStroke(2.dp, Color.Black),
                                        shape = CircleShape))
                        }
                        Text(
                            text = "Temp",
                            color = Color.Black,
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                fontSize = 16.sp))
                    }
                }
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 110.dp)
                        .requiredHeight(height = 49.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .requiredWidth(width = 110.dp)
                            .clip(shape = RoundedCornerShape(15.dp))
                            .background(color = Color(0xff3ce5fc))
                    ) {
                        Box(
                            modifier = Modifier
                                .requiredWidth(width = 62.dp)
                                .requiredHeight(height = 30.dp)
                        ) {
                            Text(
                                text = "30 ml",
                                color = Color.Black,
                                style = TextStyle(
                                    fontSize = 25.sp,
                                    fontWeight = FontWeight.Medium))
                        }
                        Text(
                            text = "CO3",
                            color = Color.Black,
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                fontSize = 16.sp))
                    }
                }
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 110.dp)
                        .requiredHeight(height = 49.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .requiredWidth(width = 110.dp)
                            .clip(shape = RoundedCornerShape(15.dp))
                            .background(color = Color(0xff3ce5fc))
                    ) {
                        Box(
                            modifier = Modifier
                                .requiredWidth(width = 62.dp)
                                .requiredHeight(height = 30.dp)
                        ) {
                            Text(
                                text = "6,2",
                                color = Color.Black,
                                textAlign = TextAlign.Center,
                                style = TextStyle(
                                    fontSize = 25.sp,
                                    fontWeight = FontWeight.Medium),
                                modifier = Modifier
                                    .requiredWidth(width = 62.dp))
                        }
                        Text(
                            text = "pH",
                            color = Color.Black,
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                fontSize = 16.sp))
                    }
                }
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 110.dp)
                        .requiredHeight(height = 49.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .requiredWidth(width = 110.dp)
                            .clip(shape = RoundedCornerShape(15.dp))
                            .background(color = Color(0xff3ce5fc))
                    ) {
                        Box(
                            modifier = Modifier
                                .requiredWidth(width = 77.dp)
                                .requiredHeight(height = 30.dp)
                        ) {
                            Text(
                                text = "100 ml",
                                color = Color.Black,
                                style = TextStyle(
                                    fontSize = 25.sp,
                                    fontWeight = FontWeight.Medium))
                        }
                        Text(
                            text = "CH4",
                            color = Color.Black,
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                fontSize = 16.sp))
                    }
                }
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 110.dp)
                        .requiredHeight(height = 49.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .requiredWidth(width = 110.dp)
                            .clip(shape = RoundedCornerShape(15.dp))
                            .background(color = Color(0xff3ce5fc))
                    ) {
                        Box(
                            modifier = Modifier
                                .requiredWidth(width = 48.dp)
                                .requiredHeight(height = 30.dp)
                        ) {
                            Text(
                                text = "1 ml",
                                color = Color.Black,
                                style = TextStyle(
                                    fontSize = 25.sp,
                                    fontWeight = FontWeight.Medium))
                        }
                        Text(
                            text = "H2S",
                            color = Color.Black,
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                fontSize = 16.sp))
                    }
                }
                Column(
                    verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.Top),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .requiredWidth(width = 110.dp)
                        .requiredHeight(height = 48.dp)
                        .clip(shape = RoundedCornerShape(15.dp))
                        .background(color = Color(0xff3ce5fc))
                ) {
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 61.dp)
                            .requiredHeight(height = 45.dp)
                    ) {
                        Text(
                            text = "Pressure",
                            color = Color.Black,
                            style = TextStyle(
                                fontSize = 16.sp),
                            modifier = Modifier
                                .align(alignment = Alignment.TopCenter)
                                .offset(x = 0.dp,
                                    y = 26.dp))
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(3.dp, Alignment.Start),
                            verticalAlignment = Alignment.Bottom,
                            modifier = Modifier
                                .align(alignment = Alignment.TopCenter)
                                .offset(x = 0.77734375.dp,
                                    y = 0.dp)
                        ) {
                            Text(
                                text = "2",
                                color = Color.Black,
                                style = TextStyle(
                                    fontSize = 25.sp,
                                    fontWeight = FontWeight.Medium))
                            Text(
                                text = "mBar",
                                color = Color.Black,
                                style = TextStyle(
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Medium),
                                modifier = Modifier
                                    .requiredWidth(width = 24.dp)
                                    .requiredHeight(height = 15.dp))
                        }
                    }
                }
            }
            Text(
                text = "Condition ",
                color = Color.White,
                lineHeight = 1.6.em,
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold),
                modifier = Modifier
                    .align(alignment = Alignment.CenterStart)
                    .offset(x = 0.dp,
                        y = (-127.49820137023926).dp)
                    .fillMaxWidth()
                    .requiredHeight(height = 32.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MonitoringDigestPreview() {
    DigestTheme{
        Monitoring()
    }
}