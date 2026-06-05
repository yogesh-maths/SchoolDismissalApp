package com.yogesh.dismiq.ui.screens.admin.profile

import androidx.compose.foundation.BorderStroke
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
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.Logout
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Verified
import androidx.compose.material.icons.outlined.Campaign
import androidx.compose.material.icons.outlined.Devices
import androidx.compose.material.icons.outlined.Groups
import androidx.compose.material.icons.outlined.HelpOutline
import androidx.compose.material.icons.outlined.LockReset
import androidx.compose.material.icons.outlined.NotificationsNone
import androidx.compose.material.icons.outlined.PrivacyTip
import androidx.compose.material.icons.outlined.School
import androidx.compose.material.icons.outlined.Security
import androidx.compose.material.icons.outlined.SupportAgent
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yogesh.dismiq.R
import com.yogesh.dismiq.ui.components.AdminBottomBar
import com.yogesh.dismiq.ui.theme.EmeraldGreen
import com.yogesh.dismiq.ui.theme.LightBackground
import com.yogesh.dismiq.ui.theme.NavyBlue
import com.yogesh.dismiq.ui.theme.TextSecondary
@Preview(showSystemUi = true, showBackground = true)

@Composable
fun AdminProfileScreen() {

    Scaffold(

        containerColor = LightBackground,

        bottomBar = {

            AdminBottomBar(
                selectedTab = "profile",
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

                // HEADER
                Row(
                    modifier = Modifier.fillMaxWidth(),

                    horizontalArrangement = Arrangement.SpaceBetween,

                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Column {

                        Text(
                            text = "Admin Profile",

                            fontSize = 30.sp,

                            fontWeight = FontWeight.Bold,

                            color = NavyBlue
                        )

                        Spacer(modifier = Modifier.height(4.dp))

                        Text(
                            text = "Manage school settings",

                            fontSize = 16.sp,

                            color = TextSecondary
                        )
                    }

                    Box(
                        modifier = Modifier
                            .size(54.dp)
                            .background(
                                Color.White,
                                CircleShape
                            ),

                        contentAlignment = Alignment.Center
                    ) {

                        Icon(
                            imageVector = Icons.Outlined.NotificationsNone,

                            contentDescription = null,

                            tint = EmeraldGreen,

                            modifier = Modifier.size(28.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(24.dp))

                // PROFILE CARD
                Card(

                    modifier = Modifier.fillMaxWidth(),

                    shape = RoundedCornerShape(30.dp),

                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    ),

                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 4.dp
                    )
                ) {

                    Column(
                        modifier = Modifier.padding(22.dp)
                    ) {

                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {

                            Image(
                                painter = painterResource(
                                    id = R.drawable.ic_update_pickup
                                ),

                                contentDescription = null,

                                modifier = Modifier
                                    .size(84.dp)
                                    .clip(CircleShape),

                                contentScale = ContentScale.Crop
                            )

                            Spacer(modifier = Modifier.width(18.dp))

                            Column(
                                modifier = Modifier.weight(1f)
                            ) {

                                Row(
                                    verticalAlignment = Alignment.CenterVertically
                                ) {

                                    Text(
                                        text = "Ananya Mehta",

                                        fontSize = 24.sp,

                                        fontWeight = FontWeight.Bold,

                                        color = NavyBlue
                                    )

                                    Spacer(modifier = Modifier.width(8.dp))

                                    Icon(
                                        imageVector = Icons.Filled.Verified,

                                        contentDescription = null,

                                        tint = EmeraldGreen,

                                        modifier = Modifier.size(22.dp)
                                    )
                                }

                                Spacer(modifier = Modifier.height(8.dp))

                                Text(
                                    text = "School Administrator",

                                    fontSize = 15.sp,

                                    color = TextSecondary
                                )

                                Spacer(modifier = Modifier.height(12.dp))

                                Box(
                                    modifier = Modifier
                                        .background(
                                            EmeraldGreen.copy(alpha = 0.10f),
                                            RoundedCornerShape(50)
                                        )
                                        .padding(
                                            horizontal = 14.dp,
                                            vertical = 7.dp
                                        )
                                ) {

                                    Text(
                                        text = "Green Valley School",

                                        color = EmeraldGreen,

                                        fontWeight = FontWeight.SemiBold,

                                        fontSize = 13.sp
                                    )
                                }
                            }
                        }

                        Spacer(modifier = Modifier.height(22.dp))

                        Row(

                            modifier = Modifier.fillMaxWidth(),

                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {

                            AdminInfoItem(
                                title = "Students",
                                value = "1,248"
                            )

                            AdminInfoItem(
                                title = "Teachers",
                                value = "84"
                            )

                            AdminInfoItem(
                                title = "Buses",
                                value = "12"
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.height(24.dp))

                // SCHOOL MANAGEMENT
                SettingsCard(

                    title = "School Management",

                    options = listOf(

                        Icons.Outlined.Groups to "Manage Staff",

                        Icons.Outlined.School to "School Settings",

                        Icons.Outlined.Campaign to "Announcements"
                    )
                )

                Spacer(modifier = Modifier.height(20.dp))

                // SECURITY
                SettingsCard(

                    title = "Security",

                    options = listOf(

                        Icons.Outlined.Security to "Admin Permissions",

                        Icons.Outlined.LockReset to "Reset Password",

                        Icons.Outlined.Devices to "Device Access"
                    )
                )

                Spacer(modifier = Modifier.height(20.dp))

                // SUPPORT
                SettingsCard(

                    title = "Support",

                    options = listOf(

                        Icons.Outlined.HelpOutline to "Help Center",

                        Icons.Outlined.SupportAgent to "Contact Support",

                        Icons.Outlined.PrivacyTip to "Privacy Policy"
                    )
                )

                Spacer(modifier = Modifier.height(28.dp))

                // LOGOUT
                OutlinedButton(

                    onClick = {},

                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp),

                    shape = RoundedCornerShape(20.dp),

                    border = BorderStroke(
                        1.dp,
                        Color.Red.copy(alpha = 0.35f)
                    )
                ) {

                    Icon(
                        imageVector = Icons.AutoMirrored.Outlined.Logout,

                        contentDescription = null,

                        tint = Color.Red
                    )

                    Spacer(modifier = Modifier.width(10.dp))

                    Text(
                        text = "Logout",

                        color = Color.Red,

                        fontWeight = FontWeight.SemiBold,

                        fontSize = 16.sp
                    )
                }
            }
        }
    }
}
@Composable
fun AdminInfoItem(
    title: String,
    value: String
) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = value,

            fontSize = 24.sp,

            fontWeight = FontWeight.Bold,

            color = EmeraldGreen
        )

        Spacer(modifier = Modifier.height(4.dp))

        Text(
            text = title,

            fontSize = 14.sp,

            color = TextSecondary
        )
    }
}
@Composable
fun SettingsCard(

    title: String,

    options: List<Pair<ImageVector, String>>

) {

    Card(

        modifier = Modifier.fillMaxWidth(),

        shape = RoundedCornerShape(28.dp),

        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),

        elevation = CardDefaults.cardElevation(
            defaultElevation = 3.dp
        )
    ) {

        Column(
            modifier = Modifier.padding(20.dp)
        ) {

            Text(
                text = title,

                fontSize = 20.sp,

                fontWeight = FontWeight.Bold,

                color = EmeraldGreen
            )

            Spacer(modifier = Modifier.height(16.dp))

            options.forEachIndexed { index, option ->

                Row(

                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 14.dp),

                    verticalAlignment = Alignment.CenterVertically
                ) {

                    // ICON CONTAINER
                    Box(

                        modifier = Modifier
                            .size(44.dp)
                            .background(
                                EmeraldGreen.copy(alpha = 0.10f),
                                RoundedCornerShape(14.dp)
                            ),

                        contentAlignment = Alignment.Center
                    ) {

                        Icon(
                            imageVector = option.first,

                            contentDescription = null,

                            tint = EmeraldGreen,

                            modifier = Modifier.size(22.dp)
                        )
                    }

                    Spacer(modifier = Modifier.width(16.dp))

                    Text(
                        text = option.second,

                        modifier = Modifier.weight(1f),

                        fontSize = 16.sp,

                        color = NavyBlue
                    )

                    Icon(
                        imageVector = Icons.Default.KeyboardArrowRight,

                        contentDescription = null,

                        tint = Color.Gray
                    )
                }

                if (index != options.lastIndex) {

                    HorizontalDivider(
                        color = Color.LightGray.copy(alpha = 0.4f)
                    )
                }
            }
        }
    }

    @Composable
    fun SettingsCard(

        title: String,

        options: List<Pair<ImageVector, String>>

    ) {

        Card(

            modifier = Modifier.fillMaxWidth(),

            shape = RoundedCornerShape(28.dp),

            colors = CardDefaults.cardColors(
                containerColor = Color.White
            ),

            elevation = CardDefaults.cardElevation(
                defaultElevation = 3.dp
            )

        ) {

            Column(
                modifier = Modifier.padding(20.dp)
            ) {

                Text(
                    text = title,

                    fontSize = 20.sp,

                    fontWeight = FontWeight.Bold,

                    color = EmeraldGreen
                )

                Spacer(modifier = Modifier.height(16.dp))

                options.forEachIndexed { index, option ->

                    Row(

                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 14.dp),

                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        // ICON BOX
                        Box(

                            modifier = Modifier
                                .size(44.dp)
                                .background(
                                    EmeraldGreen.copy(alpha = 0.10f),
                                    RoundedCornerShape(14.dp)
                                ),

                            contentAlignment = Alignment.Center

                        ) {

                            Icon(
                                imageVector = option.first,

                                contentDescription = null,

                                tint = EmeraldGreen,

                                modifier = Modifier.size(22.dp)
                            )
                        }

                        Spacer(modifier = Modifier.width(16.dp))

                        Text(
                            text = option.second,

                            modifier = Modifier.weight(1f),

                            fontSize = 16.sp,

                            color = NavyBlue
                        )

                        Icon(
                            imageVector = Icons.Default.KeyboardArrowRight,

                            contentDescription = null,

                            tint = Color.Gray
                        )
                    }

                    if (index != options.lastIndex) {

                        HorizontalDivider(
                            color = Color.LightGray.copy(alpha = 0.45f)
                        )
                    }
                }
            }
        }
    }
}
