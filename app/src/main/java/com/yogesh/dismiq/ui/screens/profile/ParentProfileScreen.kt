package com.yogesh.dismiq.ui.screens.profile

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.automirrored.outlined.Logout
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Verified
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
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
import com.yogesh.dismiq.ui.components.DismiQBottomBar
import com.yogesh.dismiq.ui.theme.EmeraldGreen
import com.yogesh.dismiq.ui.theme.LightBackground
import com.yogesh.dismiq.ui.theme.NavyBlue
import com.yogesh.dismiq.ui.theme.TextSecondary
import androidx.compose.material.icons.outlined.Campaign
import androidx.compose.material.icons.outlined.ContactPhone

import androidx.compose.material.icons.outlined.Groups
import androidx.compose.material.icons.outlined.HelpOutline
import androidx.compose.material.icons.outlined.Key
import androidx.compose.material.icons.outlined.MarkChatUnread
import androidx.compose.material.icons.outlined.NotificationsActive
import androidx.compose.material.icons.outlined.PrivacyTip
import androidx.compose.material.icons.outlined.QrCode2
import androidx.compose.material.icons.outlined.SupportAgent
import androidx.compose.material.icons.outlined.VerifiedUser
@Preview

@Composable
fun ParentProfileScreen() {

    Scaffold(

        containerColor = LightBackground,

        bottomBar = {

            DismiQBottomBar(
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

                // TOP HEADER
                Row(
                    modifier = Modifier.fillMaxWidth(),

                    horizontalArrangement = Arrangement.SpaceBetween,

                    verticalAlignment = Alignment.Top
                ) {

                    Column {

                        Text(
                            text = "Profile",

                            fontSize = 32.sp,

                            fontWeight = FontWeight.Bold,

                            color = NavyBlue
                        )

                        Spacer(modifier = Modifier.height(4.dp))

                        Text(
                            text = "Manage your account and preferences",

                            color = TextSecondary,

                            fontSize = 16.sp
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
                        containerColor = Color(0xFFF5FBF5)
                    ),

                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 4.dp
                    )
                ) {

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(20.dp),

                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        Box {

                            Image(
                                painter = painterResource(
                                    id =R.drawable.student_avatar
                                ),

                                contentDescription = null,

                                modifier = Modifier
                                    .size(88.dp)
                                    .clip(CircleShape),

                                contentScale = ContentScale.Crop
                            )

                            Box(
                                modifier = Modifier
                                    .align(Alignment.BottomEnd)
                                    .size(32.dp)
                                    .background(
                                        EmeraldGreen,
                                        CircleShape
                                    ),

                                contentAlignment = Alignment.Center
                            ) {

                                Icon(
                                    imageVector = Icons.Outlined.CameraAlt,

                                    contentDescription = null,

                                    tint = Color.White,

                                    modifier = Modifier.size(18.dp)
                                )
                            }
                        }

                        Spacer(modifier = Modifier.width(18.dp))

                        Column(
                            modifier = Modifier.weight(1f)
                        ) {

                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {

                                Text(
                                    text = "Rahul Sharma",

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

                            Box(
                                modifier = Modifier
                                    .background(
                                        EmeraldGreen.copy(alpha = 0.12f),
                                        RoundedCornerShape(50)
                                    )
                                    .padding(
                                        horizontal = 12.dp,
                                        vertical = 6.dp
                                    )
                            ) {

                                Text(
                                    text = "Verified Parent",

                                    color = EmeraldGreen,

                                    fontWeight = FontWeight.SemiBold,

                                    fontSize = 13.sp
                                )
                            }

                            Spacer(modifier = Modifier.height(12.dp))

                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {

                                Icon(
                                    imageVector = Icons.Outlined.Email,

                                    contentDescription = null,

                                    tint = EmeraldGreen,

                                    modifier = Modifier.size(18.dp)
                                )

                                Spacer(modifier = Modifier.width(8.dp))

                                Text(
                                    text = "rahul@gmail.com",

                                    color = TextSecondary
                                )
                            }

                            Spacer(modifier = Modifier.height(8.dp))

                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {

                                Icon(
                                    imageVector = Icons.Outlined.Call,

                                    contentDescription = null,

                                    tint = EmeraldGreen,

                                    modifier = Modifier.size(18.dp)
                                )

                                Spacer(modifier = Modifier.width(8.dp))

                                Text(
                                    text = "+91 9876543210",

                                    color = TextSecondary
                                )
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.height(24.dp))

                // SETTINGS SECTION
                SettingsCard(

                    title = "Account",

                    options = listOf(

                        Icons.Outlined.VerifiedUser to "Pickup Permissions",

                        Icons.Outlined.ContactPhone to "Emergency Contacts",

                        Icons.Outlined.Groups to "Linked Guardians"
                    )
                )
                Spacer(modifier = Modifier.height(20.dp))

                SettingsCard(

                    title = "Security",

                    options = listOf(

                        Icons.Outlined.Fingerprint to "Face ID",

                        Icons.Outlined.Key to "Change Password",

                        Icons.Outlined.QrCode2 to "QR Code Security"
                    )
                )

                Spacer(modifier = Modifier.height(20.dp))

                SettingsCard(

                    title = "Notifications",

                    options = listOf(

                        Icons.Outlined.NotificationsActive to "Pickup Alerts",

                        Icons.Outlined.Campaign to "School Announcements",

                        Icons.Outlined.MarkChatUnread to "Message Notifications"
                    )
                )

                Spacer(modifier = Modifier.height(20.dp))

                SettingsCard(

                    title = "Support",

                    options = listOf(

                        Icons.Outlined.HelpOutline to "Help Center",

                        Icons.Outlined.SupportAgent to "Contact School",

                        Icons.Outlined.PrivacyTip to "Privacy Policy"
                    )
                )

                Spacer(modifier = Modifier.height(26.dp))

                // LOGOUT BUTTON
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
                            .size(42.dp)
                            .background(
                                EmeraldGreen.copy(alpha = 0.08f),
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