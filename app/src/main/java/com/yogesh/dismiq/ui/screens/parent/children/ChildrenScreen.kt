package com.yogesh.dismiq.ui.screens.parent.children

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.outlined.QrCodeScanner
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yogesh.dismiq.R
import com.yogesh.dismiq.ui.theme.EmeraldGreen
import com.yogesh.dismiq.ui.theme.NavyBlue
import com.yogesh.dismiq.ui.theme.TextSecondary


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ChildCard() {
    Row(
        modifier = Modifier.fillMaxWidth().padding(start = 20.dp, top= 50.dp, end = 20.dp, bottom = 20.dp),

        horizontalArrangement = Arrangement.SpaceBetween,

        verticalAlignment = Alignment.Top
    ) {

        Column {

            Text(
                text = "My Children",

                fontSize = 24.sp,

                fontWeight = FontWeight.Bold,

                color = NavyBlue
            )

            Spacer(modifier = Modifier.height(6.dp))

            Text(
                text = "Manage and monitor your children",

                color = TextSecondary,

                fontSize = 15.sp
            )
        }

        Row(
            modifier = Modifier
                .background(
                    EmeraldGreen,
                    RoundedCornerShape(50)
                )
                .padding(
                    horizontal = 8.dp,
                    vertical = 5.dp
                ),

            verticalAlignment = Alignment.CenterVertically
        ) {

            Icon(
                imageVector = Icons.Default.Add,

                contentDescription = null,

                tint = Color.White,

                modifier = Modifier.size(20.dp)
            )

            Spacer(modifier = Modifier.width(5.dp))

            Text(
                text = "Add Child",

                color = Color.White,

                fontWeight = FontWeight.SemiBold,

                fontSize = 15.sp
            )
        }
    }
    Spacer(Modifier.height(50.dp))
    Card(
        modifier = Modifier.fillMaxWidth().padding(10.dp, vertical = 120.dp),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp
        )
    ) {
        Column(
            modifier = Modifier.padding(12.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.student_avatar),
                    contentDescription = null,
                    Modifier.size(82.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
                Spacer(Modifier.width(16.dp))
                Column(
                    Modifier.weight(1f)
                ) {
                    Text(
                        "Aarav Sharma",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        color = NavyBlue
                    )
                    Spacer(Modifier.height(4.dp))
                    Text(
                        "Grade 5 • Section A",
                        color = TextSecondary,
                        fontSize = 16.sp
                    )
                    Spacer(Modifier.height(12.dp))
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.background(
                            EmeraldGreen.copy(alpha = 0.12f),
                            RoundedCornerShape(50)
                        )
                            .padding(horizontal = 14.dp, vertical = 8.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .size(10.dp)
                                .background(EmeraldGreen, CircleShape)
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = "Ready for Pick",
                            color = EmeraldGreen,
                            fontWeight = FontWeight.SemiBold
                        )

                    }
                    Spacer(modifier = Modifier.height(14.dp))
                    Text(
                        text = "Pickup by Rahul Sharma (Father)",
                        color = EmeraldGreen,
                        fontWeight = FontWeight.Medium
                    )

                }
                Box {

                    //QR box
                    Box(
                        modifier = Modifier
                            .padding(top = 12.dp)
                            .size(64.dp)
                            .background(
                                EmeraldGreen.copy(alpha = 0.06f),
                                RoundedCornerShape(18.dp)
                            ),

                        contentAlignment = Alignment.Center
                    ) {

                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {

                            Icon(
                                imageVector = Icons.Outlined.QrCodeScanner,

                                contentDescription = null,

                                tint = EmeraldGreen,

                                modifier = Modifier.size(24.dp)
                            )

                            Spacer(modifier = Modifier.height(4.dp))

                            Text(
                                text = "Scan QR",

                                color = EmeraldGreen,

                                fontSize = 11.sp,

                                fontWeight = FontWeight.SemiBold
                            )
                        }
                    }

                    // ARROW
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowRight,

                        contentDescription = null,

                        tint = Color.Gray,

                        modifier = Modifier
                            .align(Alignment.TopEnd)
                            .offset(
                                x = (-4).dp,
                                y = (-30).dp
                            )
                            .size(22.dp)
                    )
                }
                }


            Spacer(Modifier.height(6.dp))
            HorizontalDivider(
                color = Color(0xFFEAEAEA)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            )
            {
                Column {
                    Text(
                        "Today's Status",
                        color = TextSecondary
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        "present", color = EmeraldGreen,
                        fontWeight = FontWeight.SemiBold
                    )

                }
                Column {
                    Text(
                        "Dismissal Time",
                        color = TextSecondary
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        "3.30 PM",
                        color = NavyBlue,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }
}