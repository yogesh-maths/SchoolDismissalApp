package com.yogesh.dismiq.ui.screens.admin.dashboard

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import com.yogesh.dismiq.ui.components.DismiQBottomBar
import com.yogesh.dismiq.ui.theme.LightBackground
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.outlined.AccessTime
import androidx.compose.material.icons.outlined.Campaign
import androidx.compose.material.icons.outlined.CheckCircle
import androidx.compose.material.icons.outlined.DirectionsBus
import androidx.compose.material.icons.outlined.Groups
import androidx.compose.material.icons.outlined.ListAlt
import androidx.compose.material.icons.outlined.QrCodeScanner
import androidx.compose.material.icons.outlined.Security
import androidx.compose.material.icons.outlined.WarningAmber
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.Icon

import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yogesh.dismiq.R

import com.yogesh.dismiq.ui.theme.EmeraldGreen

import com.yogesh.dismiq.ui.theme.NavyBlue
import com.yogesh.dismiq.ui.theme.TextSecondary
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yogesh.dismiq.ui.theme.NavyBlue
import com.yogesh.dismiq.ui.theme.TextSecondary

@Preview

@Composable
fun StaffDashboardScreen() {

    Scaffold(

        containerColor = LightBackground,

        bottomBar = {

            DismiQBottomBar(
                selectedTab = "dashboard",
                onScanClick = {}
            )
        }

    ) { padding ->

        LazyColumn(

            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .statusBarsPadding(),

            contentPadding = PaddingValues(
                start = 20.dp,
                end = 20.dp,
                top = 16.dp,
                bottom = 140.dp
            )

        ) {

            item {

                // TOP BAR
                Row(
                    modifier = Modifier.fillMaxWidth(),

                    horizontalArrangement = Arrangement.SpaceBetween,

                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        Box(
                            modifier = Modifier
                                .size(52.dp)
                                .background(
                                    Color.White,
                                    CircleShape
                                ),

                            contentAlignment = Alignment.Center
                        ) {

                            Icon(
                                imageVector = Icons.Default.Menu,

                                contentDescription = null,

                                tint = NavyBlue,

                                modifier = Modifier.size(28.dp)
                            )
                        }

                        Spacer(modifier = Modifier.width(14.dp))

                        Column {

                            Text(
                                text = "Dashboard",

                                fontSize = 30.sp,

                                fontWeight = FontWeight.Bold,

                                color = NavyBlue
                            )

                            Text(
                                text = "Welcome back, Admin",

                                fontSize = 16.sp,

                                color = TextSecondary
                            )
                        }
                    }

                    Image(
                        painter = painterResource(
                            id = R.drawable.student_avatar
                        ),

                        contentDescription = null,

                        modifier = Modifier
                            .size(54.dp)
                            .clip(CircleShape),

                        contentScale = ContentScale.Crop
                    )
                }

                Spacer(modifier = Modifier.height(26.dp))

                // STATS SECTION
                LazyRow(
                    horizontalArrangement = Arrangement.spacedBy(14.dp)
                ) {

                    item {

                        DashboardStatCard(
                            title = "Picked Up",
                            value = "120",
                            subtitle = "Today",
                            icon = Icons.Outlined.Groups,
                            iconColor = EmeraldGreen
                        )
                    }

                    item {

                        DashboardStatCard(
                            title = "Waiting",
                            value = "32",
                            subtitle = "For Pickup",
                            icon = Icons.Outlined.AccessTime,
                            iconColor = Color(0xFFFF9800)
                        )
                    }

                    item {

                        DashboardStatCard(
                            title = "Emergency",
                            value = "5",
                            subtitle = "Requests",
                            icon = Icons.Outlined.WarningAmber,
                            iconColor = Color.Red
                        )
                    }

                    item {

                        DashboardStatCard(
                            title = "Buses",
                            value = "12",
                            subtitle = "Active",
                            icon = Icons.Outlined.DirectionsBus,
                            iconColor = Color(0xFF2962FF)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(24.dp))

                // QUICK ACTIONS
                SectionHeader(
                    title = "Quick Actions"
                )

                Spacer(modifier = Modifier.height(16.dp))

                LazyRow(
                    horizontalArrangement = Arrangement.spacedBy(14.dp)
                ) {

                    item {

                        QuickActionCard(
                            title = "Scan QR",
                            subtitle = "Verify Pickup",
                            icon = Icons.Outlined.QrCodeScanner
                        )
                    }

                    item {

                        QuickActionCard(
                            title = "Students",
                            subtitle = "Student List",
                            icon = Icons.Outlined.Groups
                        )
                    }

                    item {

                        QuickActionCard(
                            title = "Queue",
                            subtitle = "Waiting List",
                            icon = Icons.Outlined.ListAlt
                        )
                    }

                    item {

                        QuickActionCard(
                            title = "Announcements",
                            subtitle = "Send Updates",
                            icon = Icons.Outlined.Campaign
                        )
                    }
                }

                Spacer(modifier = Modifier.height(28.dp))

                // LIVE ACTIVITY
                SectionHeader(
                    title = "Live Activity"
                )

                Spacer(modifier = Modifier.height(16.dp))

                LiveActivityCard(
                    title = "Rahul picked Aarav Sharma",
                    subtitle = "Grade 3 • Green House",
                    time = "01:42 PM",
                    icon = Icons.Outlined.CheckCircle,
                    iconColor = EmeraldGreen
                )

                Spacer(modifier = Modifier.height(14.dp))

                LiveActivityCard(
                    title = "Bus Route 12 arrived",
                    subtitle = "12 students onboard",
                    time = "01:35 PM",
                    icon = Icons.Outlined.DirectionsBus,
                    iconColor = Color(0xFF2962FF)
                )

                Spacer(modifier = Modifier.height(14.dp))

                LiveActivityCard(
                    title = "Emergency pickup requested",
                    subtitle = "Requested by parent",
                    time = "01:20 PM",
                    icon = Icons.Outlined.WarningAmber,
                    iconColor = Color.Red
                )

                Spacer(modifier = Modifier.height(28.dp))

                // ALERTS
                SectionHeader(
                    title = "Alerts"
                )

                Spacer(modifier = Modifier.height(16.dp))

                AlertCard(
                    title = "Late Pickup",
                    subtitle = "3 students waiting",
                    icon = Icons.Outlined.AccessTime,
                    iconColor = Color(0xFFFF9800)
                )

                Spacer(modifier = Modifier.height(14.dp))

                AlertCard(
                    title = "Invalid QR Attempt",
                    subtitle = "2 attempts",
                    icon = Icons.Outlined.Security,
                    iconColor = Color.Red
                )
            }
        }
    }
}
@Composable
fun DashboardStatCard(

    title: String,

    value: String,

    subtitle: String,

    icon: ImageVector,

    iconColor: Color

) {

    Card(

        modifier = Modifier
            .width(150.dp)
            .height(190.dp),

        shape = RoundedCornerShape(28.dp),

        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),

        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp
        )

    ) {

        Column(

            modifier = Modifier
                .fillMaxSize()
                .padding(15.dp),

            horizontalAlignment = Alignment.CenterHorizontally,

            verticalArrangement = Arrangement.Center

        ) {

            Box(

                modifier = Modifier
                    .size(70.dp)
                    .background(
                        iconColor.copy(alpha = 0.12f),
                        CircleShape
                    ),

                contentAlignment = Alignment.Center

            ) {

                Icon(
                    imageVector = icon,

                    contentDescription = null,

                    tint = iconColor,

                    modifier = Modifier.size(30.dp)
                )
            }

            Spacer(modifier = Modifier.height(24.dp))

            Text(
                text = value,

                fontSize = 25.sp,

                fontWeight = FontWeight.Bold,

                color = iconColor
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = title,

                fontSize = 18.sp,

                fontWeight = FontWeight.SemiBold,

                color = NavyBlue
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = subtitle,

                fontSize = 16.sp,

                color = TextSecondary
            )
        }
    }
}
@Composable
fun SectionHeader(
    title: String
) {

    Row(
        modifier = Modifier.fillMaxWidth(),

        horizontalArrangement = Arrangement.SpaceBetween,

        verticalAlignment = Alignment.CenterVertically
    ) {

        Text(
            text = title,

            fontSize = 24.sp,

            fontWeight = FontWeight.Bold,

            color = NavyBlue
        )

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                text = "View All",

                fontSize = 15.sp,

                fontWeight = FontWeight.SemiBold,

                color = EmeraldGreen
            )

            Spacer(modifier = Modifier.width(4.dp))

            Icon(
                imageVector = Icons.Default.KeyboardArrowRight,

                contentDescription = null,

                tint = EmeraldGreen,

                modifier = Modifier.size(20.dp)
            )
        }
    }
}
@Composable
fun LiveActivityCard(

    title: String,

    subtitle: String,

    time: String,

    icon: ImageVector,

    iconColor: Color

) {

    Card(

        modifier = Modifier.fillMaxWidth(),

        shape = RoundedCornerShape(24.dp),

        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),

        elevation = CardDefaults.cardElevation(
            defaultElevation = 3.dp
        )
    ) {

        Row(

            modifier = Modifier
                .fillMaxWidth()
                .padding(18.dp),

            verticalAlignment = Alignment.CenterVertically
        ) {

            Box(

                modifier = Modifier
                    .size(54.dp)
                    .background(
                        iconColor.copy(alpha = 0.12f),
                        CircleShape
                    ),

                contentAlignment = Alignment.Center

            ) {

                Icon(
                    imageVector = icon,

                    contentDescription = null,

                    tint = iconColor,

                    modifier = Modifier.size(28.dp)
                )
            }

            Spacer(modifier = Modifier.width(16.dp))

            Column(
                modifier = Modifier.weight(1f)
            ) {

                Text(
                    text = title,

                    fontSize = 17.sp,

                    fontWeight = FontWeight.SemiBold,

                    color = NavyBlue
                )

                Spacer(modifier = Modifier.height(4.dp))

                Text(
                    text = subtitle,

                    fontSize = 14.sp,

                    color = TextSecondary
                )
            }

            Text(
                text = time,

                fontSize = 13.sp,

                color = TextSecondary
            )
        }
    }
}
@Composable
fun QuickActionCard(

    title: String,

    subtitle: String,

    icon: ImageVector

) {

    Card(

        modifier = Modifier
            .width(150.dp)
            .height(150.dp),

        shape = RoundedCornerShape(28.dp),

        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),

        elevation = CardDefaults.cardElevation(
            defaultElevation = 3.dp
        )
    ) {

        Column(

            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),

            horizontalAlignment = Alignment.CenterHorizontally,

            verticalArrangement = Arrangement.Center
        ) {

            Box(

                modifier = Modifier
                    .size(72.dp)
                    .background(
                        EmeraldGreen.copy(alpha = 0.12f),
                        CircleShape
                    ),

                contentAlignment = Alignment.Center
            ) {

                Icon(
                    imageVector = icon,

                    contentDescription = null,

                    tint = EmeraldGreen,

                    modifier = Modifier.size(30.dp)
                )
            }

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = title,

                fontSize = 18.sp,

                fontWeight = FontWeight.Bold,

                color = NavyBlue
            )

            Spacer(modifier = Modifier.height(6.dp))

            Text(
                text = subtitle,

                fontSize = 15.sp,

                color = TextSecondary
            )
        }
    }
}
@Composable
fun AlertCard(

    title: String,

    subtitle: String,

    icon: ImageVector,

    iconColor: Color

) {

    Card(

        modifier = Modifier.fillMaxWidth(),

        shape = RoundedCornerShape(24.dp),

        colors = CardDefaults.cardColors(
            containerColor = iconColor.copy(alpha = 0.06f)
        )
    ) {

        Row(

            modifier = Modifier
                .fillMaxWidth()
                .padding(18.dp),

            verticalAlignment = Alignment.CenterVertically
        ) {

            Box(

                modifier = Modifier
                    .size(52.dp)
                    .background(
                        Color.White,
                        CircleShape
                    ),

                contentAlignment = Alignment.Center
            ) {

                Icon(
                    imageVector = icon,

                    contentDescription = null,

                    tint = iconColor,

                    modifier = Modifier.size(28.dp)
                )
            }

            Spacer(modifier = Modifier.width(16.dp))

            Column(
                modifier = Modifier.weight(1f)
            ) {

                Text(
                    text = title,

                    fontSize = 17.sp,

                    fontWeight = FontWeight.SemiBold,

                    color = NavyBlue
                )

                Spacer(modifier = Modifier.height(4.dp))

                Text(
                    text = subtitle,

                    fontSize = 14.sp,

                    color = TextSecondary
                )
            }

            Icon(
                imageVector = Icons.Default.KeyboardArrowRight,

                contentDescription = null,

                tint = Color.Gray
            )
        }
    }
}