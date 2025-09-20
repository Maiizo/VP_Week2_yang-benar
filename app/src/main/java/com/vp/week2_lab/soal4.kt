package com.vp.week2_lab

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

val PoppinsFont = FontFamily(
    Font(R.font.poppins_regular, FontWeight.Normal),
    Font(R.font.poppins_medium, FontWeight.Medium),
    Font(R.font.poppins_bold, FontWeight.Bold)
)

@Composable
fun View4() {
    var trip by remember { mutableStateOf("") }
    var favorite by remember { mutableStateOf("") }
    var additional by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        // Bg
        Image(
            painter = painterResource(id = R.drawable.sail),
            contentDescription = "Sydney Opera House",
            modifier = Modifier
                .fillMaxSize()
                .size(10.dp)
                .offset { IntOffset(0, -300) }
                .padding(bottom = 200.dp),
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Bottom
        ) {

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape( topEnd =  25.dp, topStart = 25.dp))
                    .background(Color(0xFF876e69).copy(alpha = 1f))
                    .padding(25.dp)
            ) {
                Column {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ){ Text(
                            text = "My Travel Log",
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            fontFamily = PoppinsFont,
                            modifier = Modifier.padding(bottom = 15.dp)
                        )
                    }
                    Text(
                        text = "Sydney Opera House",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.White,
                        fontFamily = PoppinsFont
                    )

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(bottom = 20.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.LocationOn,
                            contentDescription = "Location",
                            tint = Color.White,
                            modifier = Modifier.size(20.dp)
                        )
                        Spacer(modifier = Modifier.width(10.dp))
                        Text(
                            text = "Sydney, Australia",
                            fontSize = 15.sp,
                            color = Color.White,
                            fontFamily = PoppinsFont
                        )
                    }

                    // rating
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(bottom = 25.dp)
                    ) {
                        repeat(4) {
                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = "Star",
                                tint = Color(0xFFFFD700),
                                modifier = Modifier.size(25.dp)
                            )
                        }
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "Star",
                            tint = Color.Gray,
                            modifier = Modifier.size(25.dp)
                        )
                        Spacer(modifier = Modifier.width(10.dp))
                        Text(
                            text = "4.0",
                            fontSize = 15.sp,
                            color = Color.White,
                            fontFamily = PoppinsFont,
                            fontWeight = FontWeight.Medium
                        )
                    }

                    OutlinedTextField(
                        value = trip,
                        onValueChange = { trip = it },
                        label = { Text("What did you enjoy most about your trip?") },
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.ThumbUp,
                                contentDescription = "Trip",
                                        tint = Color.White
                            )
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 12.dp)
                    )

                    OutlinedTextField(
                        value = favorite,
                        onValueChange = { favorite = it },
                        label = { Text("What was your favorite spot?") },
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Favorite,
                                contentDescription = "Favorite",
                                tint = Color.White
                            )
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 12.dp)
                    )

                    OutlinedTextField(
                        value = additional,
                        onValueChange = { additional = it },
                        label = { Text("Anything else you'd like to add?") },
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Info,
                                contentDescription = "Additional",
                                tint = Color.White
                            )
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 25.dp)
                    )


                    // Buttons
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(15.dp)
                    ) {
                        Button(
                            onClick = { },
                            modifier = Modifier
                                .weight(1f)
                                .height(48.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xFFFF3B30)
                            ),
                            shape = RoundedCornerShape(8.dp)
                        ) {
                            Text(
                                text = "Discard",
                                color = Color.White,
                                fontFamily = PoppinsFont,
                                fontWeight = FontWeight.Medium,
                                fontSize = 15.sp
                            )
                        }

                        Button(
                            onClick = { },
                            modifier = Modifier
                                .weight(1f)
                                .height(50.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color.White.copy(alpha = 0.3f)
                            ),
                            shape = RoundedCornerShape(8.dp)
                        ) {
                            Text(
                                text = "Save",
                                color = Color.White,
                                fontFamily = PoppinsFont,
                                fontWeight = FontWeight.Medium,
                                fontSize = 15.sp
                            )
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ViewPreview4() {
    View4()
}
