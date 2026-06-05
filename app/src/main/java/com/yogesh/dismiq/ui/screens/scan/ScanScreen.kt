package com.yogesh.dismiq.ui.screens.scan

import com.yogesh.dismiq.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FlashOn
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.QrCodeScanner
import androidx.compose.material.icons.outlined.SafetyCheck
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yogesh.dismiq.ui.theme.EmeraldGreen
import com.yogesh.dismiq.ui.theme.NavyBlue
import com.yogesh.dismiq.ui.theme.TextSecondary
import androidx.compose.foundation.Canvas
import androidx.compose.material.icons.outlined.AccessTime
import androidx.compose.material.icons.outlined.Lightbulb
import androidx.compose.material.icons.outlined.PersonOutline
import androidx.compose.material3.HorizontalDivider
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke

@Preview(showBackground = true, showSystemUi = true)

@Composable
fun ScanScreen() {
    Scaffold(
        containerColor = Color(0xFFF6F8FB)
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding),
            contentPadding = PaddingValues(
                horizontal = 20.dp,
                vertical = 20.dp
            ),
            verticalArrangement = Arrangement.spacedBy(28.dp)
        ) {
            item { ScanTopBar() }

           item { ScannerPreview()
               Column(
                   horizontalAlignment = Alignment.CenterHorizontally
               ) {



                   Spacer(modifier = Modifier.height(14.dp))

                   Text(
                       text = "Align QR code inside frame",

                       color = TextSecondary,

                       fontSize = 15.sp,
                       modifier = Modifier.fillMaxWidth(),

                       textAlign = TextAlign.Center
                   )

               }}
            item { VerificationCard() }
        }

    }
}
//Functions
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ScanTopBar() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ){
        Box(
            modifier = Modifier
                .size(52.dp)
                .background(
                    Color.White,
                    CircleShape
                ),
            contentAlignment = Alignment.Center
        ){
            Icon(
                imageVector = Icons.Default.KeyboardArrowLeft,
                contentDescription = null,
                modifier = Modifier
                    .size(52.dp)
                    .shadow(
                        elevation = 6.dp,
                        shape = CircleShape,
                        clip = false
                    )
                    .background(
                        Color.White,
                        CircleShape
                    ),
                tint = NavyBlue
            )
        }
        Text(
            text = "Scan QR",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = NavyBlue
        )

        Box(
            modifier = Modifier
                .size(52.dp)
                .background(
                    Color.White,
                    CircleShape
                ),
            Alignment.Center
        ) {
            Box(
                modifier = Modifier
                    .size(52.dp)
                    .shadow(
                        elevation = 6.dp,
                        shape = CircleShape,
                        clip = false
                    )
                    .background(
                        Color.White,
                        CircleShape
                    ),

                contentAlignment = Alignment.Center
            ) {

                Icon(
                    imageVector = Icons.Default.FlashOn,

                    contentDescription = null,

                    tint = EmeraldGreen,

                    modifier = Modifier.size(24.dp)
                )
            }
        }

    }
    Spacer(modifier = Modifier.width(16.dp))
    Text(
        text = "Scan school pickup code",

        color = TextSecondary,

        fontSize = 13.sp,

        textAlign = TextAlign.Center,

        modifier = Modifier.fillMaxWidth()
    )
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ScannerPreview() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(350.dp)
            .background(
                Color(0xFF111827),
                RoundedCornerShape(42.dp)

            )
    )
    {
        Canvas(
            modifier = Modifier
                .size(260.dp)
                .align(Alignment.Center)
        ) {

            val stroke = 10f
            val green = EmeraldGreen

            val arcSize = 50f
            val line = 55f

            // TOP LEFT
            drawArc(
                color = green,
                startAngle = 180f,
                sweepAngle = 90f,
                useCenter = false,
                topLeft = Offset(0f, 0f),
                size = Size(arcSize, arcSize),
                style = Stroke(
                    width = stroke,
                    cap = StrokeCap.Round
                )
            )

            drawLine(
                color = green,
                start = Offset(arcSize / 2, 0f),
                end = Offset(line + arcSize / 2, 0f),
                strokeWidth = stroke,
                cap = StrokeCap.Round
            )

            drawLine(
                color = green,
                start = Offset(0f, arcSize / 2),
                end = Offset(0f, line + arcSize / 2),
                strokeWidth = stroke,
                cap = StrokeCap.Round
            )

            // TOP RIGHT
            drawArc(
                color = green,
                startAngle = 270f,
                sweepAngle = 90f,
                useCenter = false,
                topLeft = Offset(size.width - arcSize, 0f),
                size = Size(arcSize, arcSize),
                style = Stroke(
                    width = stroke,
                    cap = StrokeCap.Round
                )
            )

            drawLine(
                color = green,
                start = Offset(size.width - line - arcSize / 2, 0f),
                end = Offset(size.width - arcSize / 2, 0f),
                strokeWidth = stroke,
                cap = StrokeCap.Round
            )

            drawLine(
                color = green,
                start = Offset(size.width, arcSize / 2),
                end = Offset(size.width, line + arcSize / 2),
                strokeWidth = stroke,
                cap = StrokeCap.Round
            )

            // BOTTOM LEFT
            drawArc(
                color = green,
                startAngle = 90f,
                sweepAngle = 90f,
                useCenter = false,
                topLeft = Offset(0f, size.height - arcSize),
                size = Size(arcSize, arcSize),
                style = Stroke(
                    width = stroke,
                    cap = StrokeCap.Round
                )
            )

            drawLine(
                color = green,
                start = Offset(0f, size.height - line - arcSize / 2),
                end = Offset(0f, size.height - arcSize / 2),
                strokeWidth = stroke,
                cap = StrokeCap.Round
            )

            drawLine(
                color = green,
                start = Offset(arcSize / 2, size.height),
                end = Offset(line + arcSize / 2, size.height),
                strokeWidth = stroke,
                cap = StrokeCap.Round
            )

            // BOTTOM RIGHT
            drawArc(
                color = green,
                startAngle = 0f,
                sweepAngle = 90f,
                useCenter = false,
                topLeft = Offset(
                    size.width - arcSize,
                    size.height - arcSize
                ),
                size = Size(arcSize, arcSize),
                style = Stroke(
                    width = stroke,
                    cap = StrokeCap.Round
                )
            )

            drawLine(
                color = green,
                start = Offset(size.width - line - arcSize / 2, size.height),
                end = Offset(size.width - arcSize / 2, size.height),
                strokeWidth = stroke,
                cap = StrokeCap.Round
            )

            drawLine(
                color = green,
                start = Offset(size.width, size.height - line - arcSize / 2),
                end = Offset(size.width, size.height - arcSize / 2),
                strokeWidth = stroke,
                cap = StrokeCap.Round
            )
        }

        Icon(
            imageVector = Icons.Default.QrCodeScanner,

            contentDescription = null,

            tint = Color.White.copy(alpha = 0.85f),

            modifier = Modifier
                .size(120.dp)
                .background(
                    Color.White.copy(alpha = 0.06f),
                    CircleShape
                )
                .padding(20.dp)
                .align(Alignment.Center)
        )
        Row(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 60.dp),

            verticalAlignment = Alignment.CenterVertically
        ) {

            Box(
                modifier = Modifier
                    .size(30.dp)
                    .background(
                        Color.White.copy(alpha = 0.08f),
                        CircleShape
                    ),

                contentAlignment = Alignment.Center
            )

            {

                Icon(
                    imageVector = Icons.Outlined.Lightbulb,

                    contentDescription = null,

                    tint = Color.White.copy(0.85f),

                    modifier = Modifier.size(18.dp)
                )
            }

            Spacer(modifier = Modifier.width(12.dp))

            Text(
                text = "Make sure the QR code is clear\nand well lit",

                color = Color.LightGray.copy(alpha = 0.5f),

                fontSize = 14.sp,

                lineHeight = 18.sp
            )
        }


    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun VerificationCard() {

    Card(
        modifier = Modifier.fillMaxWidth(),

        shape = RoundedCornerShape(32.dp),

        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),

        elevation = CardDefaults.cardElevation(
            defaultElevation = 3.dp
        )
    ) {

        Column(
            modifier = Modifier.padding(12.dp)
        ) {

            // TOP SECTION
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {

                Image(
                    painter = painterResource(
                        id = R.drawable.student_avatar
                    ),

                    contentDescription = null,

                    modifier = Modifier
                        .size(60.dp)
                        .clip(CircleShape),

                    contentScale = ContentScale.Crop
                )

                Spacer(modifier = Modifier.width(13.dp))

                Column(
                    modifier = Modifier.weight(1f)
                ) {

                    Text(
                        text = "Aarav Sharma",

                        fontSize = 20.sp,

                        fontWeight = FontWeight.Bold,

                        color = NavyBlue
                    )

                    Spacer(modifier = Modifier.height(4.dp))

                    Text(
                        text = "Greenfield International School",

                        fontSize = 10.sp,

                        color = TextSecondary
                    )
                }

                Box(
                    modifier = Modifier
                        .background(
                            EmeraldGreen.copy(alpha = 0.12f),
                            RoundedCornerShape(50)
                        )
                        .padding(
                            horizontal = 10.dp,
                            vertical = 4.dp
                        )
                ) {

                    Text(
                        text = "Grade 5 • Section A",

                        color = EmeraldGreen,

                        fontWeight = FontWeight.SemiBold,

                        fontSize = 10.sp
                    )
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            HorizontalDivider(
                color = Color(0xFFEAEAEA)
            )

            Spacer(modifier = Modifier.height(12.dp))

            // BOTTOM SECTION
            Row(
                modifier = Modifier.fillMaxWidth(),

                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                // LEFT INFO
                Row(
                    modifier = Modifier.weight(1f)
                ) {

                    Icon(
                        imageVector = Icons.Outlined.PersonOutline,

                        contentDescription = null,

                        tint = EmeraldGreen,

                        modifier = Modifier.size(24.dp)
                    )

                    Spacer(modifier = Modifier.width(12.dp))

                    Column {

                        Text(
                            text = "Authorized Pickup",

                            color = TextSecondary,

                            fontSize = 13.sp
                        )

                        Spacer(modifier = Modifier.height(4.dp))

                        Text(
                            text = "Rahul Sharma (Father)",

                            color = NavyBlue,

                            fontWeight = FontWeight.Bold,

                            fontSize = 16.sp
                        )
                    }
                }

                Box(
                    modifier = Modifier
                        .width(1.dp)
                        .height(44.dp)
                        .background(Color(0xFFEAEAEA))
                )

                Spacer(modifier = Modifier.width(20.dp))

                // RIGHT INFO
                Row(
                    modifier = Modifier.weight(1f)
                ) {

                    Icon(
                        imageVector = Icons.Outlined.AccessTime,

                        contentDescription = null,

                        tint = EmeraldGreen,

                        modifier = Modifier.size(24.dp)
                    )

                    Spacer(modifier = Modifier.width(12.dp))

                    Column {

                        Text(
                            text = "Valid Until",

                            color = TextSecondary,

                            fontSize = 13.sp
                        )

                        Spacer(modifier = Modifier.height(4.dp))

                        Text(
                            text = "3:30 PM • Today",

                            color = NavyBlue,

                            fontWeight = FontWeight.Bold,

                            fontSize = 16.sp
                        )
                    }
                }
            }
        }
    }

    Spacer(Modifier.height(24.dp))
    Card(
        modifier = Modifier.fillMaxWidth(),

        shape = RoundedCornerShape(40.dp),

        colors = CardDefaults.cardColors(
            containerColor = EmeraldGreen.copy(0.07f)
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp),

            verticalAlignment = Alignment.CenterVertically
        ) {

            Box(
                modifier = Modifier
                    .size(40.dp)
                    .background(
                        Color.White,
                        CircleShape
                    ),

                contentAlignment = Alignment.Center
            ) {

                Icon(
                    imageVector = Icons.Outlined.SafetyCheck,

                    contentDescription = null,

                    tint = EmeraldGreen,

                    modifier = Modifier.size(30.dp)
                )
            }

            Spacer(modifier = Modifier.width(16.dp))

            Column {

                Text(
                    text = "Secure & Verified",

                    fontWeight = FontWeight.Bold,

                    fontSize = 16.sp,

                    color = EmeraldGreen
                )

                Spacer(modifier = Modifier.height(4.dp))

                Text(
                    text = "This QR is encrypted and valid for single use only.",

                    color = TextSecondary,

                    fontSize = 13.sp
                )
            }
        }
    }
}
