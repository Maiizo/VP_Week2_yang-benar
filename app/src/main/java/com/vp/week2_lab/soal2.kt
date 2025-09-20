package com.vp.week2_lab

import android.R.attr.fontWeight
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun View2() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFE1A54B))
                .padding(30.dp),
            verticalAlignment = Alignment.CenterVertically

        ) {
            Spacer(modifier = Modifier.height(50.dp))


            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Go back",
                    tint = Color.White,
                    modifier = Modifier.size(20.dp)
                )
                Text(
                    text = "Go back",
                    color = Color.White,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold

                )
            }


            Spacer(modifier = Modifier.width(50.dp))

            Text(
                text = "My Basket",
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFB9B9B9))
                .padding(15.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.quinoa_fruit_salad),
                contentDescription = "Product Image",
                modifier = Modifier.size(60.dp)
            )

            Spacer(modifier = Modifier.width(15.dp))

            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = "Quinoa fruit salad",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Text(
                    text = "2 x Rp 100.000",
                    fontSize = 15.sp,
                    color = Color(0xFF666666)
                )
            }

            Text(
                text = "Rp 200.000",
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
        }


        Spacer(modifier = Modifier.height(30.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                Icon(
                    imageVector = Icons.Default.Close,
                    contentDescription = "Close",
                    tint = Color.Gray,
                    modifier = Modifier.size(25.dp)
                )
            }
            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "Card Holders Name",
                fontSize = 15.sp,
                fontWeight = FontWeight.Medium,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(8.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFFF5F5F5), RoundedCornerShape(8.dp))
                    .padding(15.dp)
            ) {
                var cardHolderName by remember { mutableStateOf("") }
                Column(modifier = Modifier.fillMaxWidth()) {
                    Text("Bella hadid", color = Color.Gray, fontSize = 15.sp)
                    BasicTextField(
                        value = cardHolderName,
                        onValueChange = { cardHolderName = it },
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }

            Spacer(modifier = Modifier.height(15.dp))

            Text(
                text = "Card Number",
                fontSize = 15.sp,
                fontWeight = FontWeight.Medium,
                color = Color.Black
            )

            Spacer(modifier = Modifier.height(8.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFFF5F5F5), RoundedCornerShape(8.dp))
                    .padding(15.dp)
            ) {
                var cardNum by remember { mutableStateOf("") }
                Column(modifier = Modifier.fillMaxWidth()) {
                    Text("1234 5678 9012 1314", color = Color.Gray, fontSize = 15.sp)
                    BasicTextField(
                        value = cardNum,
                        onValueChange = { cardNum = it },
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }

            Spacer(modifier = Modifier.height(15.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(15.dp)
            ) {
                Column(
                    modifier = Modifier.weight(1f)
                ) {
                    Text(
                        text = "Date",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.Black
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color(0xFFF5F5F5), RoundedCornerShape(8.dp))
                            .padding(15.dp)
                    ) {
                        var date by remember { mutableStateOf("") }
                        Column(modifier = Modifier.fillMaxWidth()) {
                            Text("10/30", color = Color.Gray, fontSize = 15.sp)
                            BasicTextField(
                                value = date,
                                onValueChange = { date = it },
                                modifier = Modifier.fillMaxWidth()
                            )
                        }
                    }
                }

                Column(
                    modifier = Modifier.weight(1f)
                ) {
                    Text(
                        text = "CCV",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.Black
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color(0xFFF5F5F5), RoundedCornerShape(8.dp))
                            .padding(15.dp)
                    ) {
                        var ccv by remember { mutableStateOf("") }
                        Column(modifier = Modifier.fillMaxWidth()) {
                            Text("123", color = Color.Gray, fontSize = 15.sp)
                            BasicTextField(
                                value = ccv,
                                onValueChange = { ccv = it },
                                modifier = Modifier.fillMaxWidth()
                            )
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(32.dp))

            Button(
                onClick = { },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFE1A54B)
                ),
                shape = RoundedCornerShape(12.dp)
            ) {
                Text(
                    text = "Complete Order",
                    color = Color.White,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Medium
                )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Preview2() {
    View2()
}