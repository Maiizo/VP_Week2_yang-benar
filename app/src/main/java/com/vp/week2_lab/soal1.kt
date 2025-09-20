package com.vp.week2_lab

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FruitSaladView() {
    var searchText by remember { mutableStateOf("") }
    val horizontalScrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F5F5))
            .padding(20.dp)
    ) {


        Spacer(modifier = Modifier.width(35.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.Menu,
                contentDescription = "Menu Icon",
                modifier = Modifier.size(30.dp),
                tint = Color.Black
            )
            Button(
                onClick = {  },
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.White),
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = Icons.Default.ShoppingCart,
                        contentDescription = "My Basket",
                        tint = Color(0xFFFFA500),
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(text = "My Basket", color = Color(0xFFFFA500))
                }
            }
        }
        Spacer(modifier = Modifier.height(20.dp))

        Column {
            Text(
                text = "Hello Bella,",
                fontSize = 20.sp,
                color = Color.Black
            )
            Text(
                text = "What fruit salad combo do you want today?",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
        }
        Spacer(modifier = Modifier.height(25.dp))

        OutlinedTextField(
            value = searchText,
            onValueChange = { searchText = it },
            placeholder = { Text("Search for fruit salad combos", color = Color.Gray) },
            leadingIcon = { Icon(Icons.Default.Search, contentDescription = "Search Icon") },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(15.dp),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.White,
                unfocusedContainerColor = Color.White,
                unfocusedIndicatorColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent
            )
        )
        Spacer(modifier = Modifier.height(30.dp))

        Column {
            Text(
                text = "Recommended Combo",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(15.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(
                    modifier = Modifier
                        .width(170.dp)
                        .clip(RoundedCornerShape(16.dp))
                        .background(Color.White)
                        .padding(12.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.FavoriteBorder,
                        contentDescription = "Favorite",
                        tint = Color(0xFFFFA500),
                        modifier = Modifier.align(Alignment.End).size(25.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.salad),
                        contentDescription = "Honey lime combo",
                        modifier = Modifier.size(100.dp).clip(CircleShape).align(Alignment.CenterHorizontally),
                        contentScale = ContentScale.Crop
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                    Text(
                        text = "Honey lime combo",
                        fontWeight = FontWeight.Bold, fontSize = 15.sp,
                        textAlign = TextAlign.Start, modifier = Modifier.fillMaxWidth()
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text("Rp 70.000",
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFFFA726),
                            fontSize = 15.sp)
                        Icon(
                            imageVector = Icons.Default.Add,
                            contentDescription = "Add to cart",
                            tint = Color(0xFFFFA500)
                        )
                    }
                }

                Column(
                    modifier = Modifier
                        .width(170.dp)
                        .clip(RoundedCornerShape(16.dp))
                        .background(Color.White)
                        .padding(12.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.FavoriteBorder,
                        contentDescription = "Favorite",
                        tint = Color(0xFFFFA500),
                        modifier = Modifier.align(Alignment.End).size(25.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.salad2),
                        contentDescription = "Berry Mango Combo",
                        modifier = Modifier.size(100.dp).clip(CircleShape).align(Alignment.CenterHorizontally),
                        contentScale = ContentScale.Crop
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                    Text(
                        text = "Berry Mango Combo",
                        fontWeight = FontWeight.Bold, fontSize = 15.sp,
                        textAlign = TextAlign.Start, modifier = Modifier.fillMaxWidth()
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text("Rp 80.000",
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFFFA726),
                            fontSize = 15.sp)
                        Icon(
                            imageVector = Icons.Default.Add,
                            contentDescription = "Add to cart",
                            tint = Color(0xFFFFA500)
                        )
                    }
                }
            }
        }
        Spacer(modifier = Modifier.height(30.dp))


        Column {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("Hottest",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black)
                Text("Popular",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.Gray)
                Text("New combo",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.Gray)
                Text("Top",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.Gray)
            }
            Spacer(modifier = Modifier.height(15.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(horizontalScrollState),
                horizontalArrangement = Arrangement.spacedBy(15.dp)
            ) {
                Column(
                    modifier = Modifier
                        .width(150.dp)
                        .clip(RoundedCornerShape(13.dp))
                        .background(Color(0xFFFFF3E0))
                        .padding(10.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.FavoriteBorder,
                        contentDescription = "Favorite",
                        tint = Color.Red,
                        modifier = Modifier.align(Alignment.End).size(22.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.salad3),
                        contentDescription = "Quinoa fruit salad",
                        modifier = Modifier.size(100.dp).clip(CircleShape)
                            .align(Alignment.CenterHorizontally),
                        contentScale = ContentScale.Crop
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        "Quinoa fruit salad",
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            "Rp 100.000",
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFFFA726),
                            fontSize = 14.sp
                        )
                        Icon(
                            imageVector = Icons.Default.Add, contentDescription = "Add to cart",
                            tint = Color(0xFFFFA500),
                        )
                    }
                }

                Column(
                    modifier = Modifier
                        .width(160.dp)
                        .clip(RoundedCornerShape(16.dp))
                        .background(Color(0xFFE3F2FD))
                        .padding(12.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.FavoriteBorder,
                        contentDescription = "Favorite",
                        tint = Color.Red,
                        modifier = Modifier.align(Alignment.End).size(22.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.salad3),
                        contentDescription = "tropical fruit salad",
                        modifier = Modifier.size(100.dp).clip(CircleShape)
                            .align(Alignment.CenterHorizontally),
                        contentScale = ContentScale.Crop
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        "Tropical fruit salad",
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            "Rp 97.000",
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFFFA726),
                            fontSize = 14.sp
                        )
                        Icon(
                            imageVector = Icons.Default.Add, contentDescription = "Add to cart",
                            tint = Color(0xFFFFA500),
                        )
                    }
                }

                Column(
                    modifier = Modifier
                        .width(160.dp)
                        .clip(RoundedCornerShape(16.dp))
                        .background(Color(0xFFFAF0F5))
                        .padding(12.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.FavoriteBorder,
                        contentDescription = "Favorite",
                        tint = Color.Red,
                        modifier = Modifier.align(Alignment.End).size(22.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.salad3),
                        contentDescription = "tropical fruit salad",
                        modifier = Modifier.size(100.dp).clip(CircleShape)
                            .align(Alignment.CenterHorizontally),
                        contentScale = ContentScale.Crop
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        "Melon fruit salad",
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            "Rp 97.000",
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFFFA726),
                            fontSize = 14.sp
                        )
                        Icon(
                            imageVector = Icons.Default.Add, contentDescription = "Add to cart",
                            tint = Color(0xFFFFA500),
                        )
                    }

                }

            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun FruitSaladViewPreview() {
    FruitSaladView()
}