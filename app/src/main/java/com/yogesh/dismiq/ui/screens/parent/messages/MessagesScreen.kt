package com.yogesh.dismiq.ui.screens.parent.messages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yogesh.dismiq.ui.components.DismiQBottomBar
import com.yogesh.dismiq.ui.theme.EmeraldGreen
import com.yogesh.dismiq.ui.theme.NavyBlue
import com.yogesh.dismiq.ui.theme.TextSecondary

@Preview(showBackground = true, showSystemUi = true)

@Composable
fun MessagesScreen() {

    Scaffold(

        containerColor = Color(0xFFF6F7FB),

        bottomBar = {

            DismiQBottomBar(
                selectedTab = "messages",
                onScanClick = {}
            )
        }

    ) { paddingValues ->

        LazyColumn(

            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(horizontal = 20.dp),

            contentPadding = PaddingValues(bottom = 120.dp)
        ) {

            item {

                Spacer(modifier = Modifier.height(18.dp))

                // TOP BAR
                Row(
                    modifier = Modifier.fillMaxWidth(),

                    horizontalArrangement = Arrangement.SpaceBetween,

                    verticalAlignment = Alignment.Top
                ) {

                    Column {

                        Text(
                            text = "Messages",

                            fontSize = 30.sp,

                            fontWeight = FontWeight.Bold,

                            color = NavyBlue
                        )

                        Spacer(modifier = Modifier.height(6.dp))

                        Text(
                            text = "Stay connected with school",

                            fontSize = 15.sp,

                            color = TextSecondary
                        )
                    }

                    Row {

                        CircleIconButton(
                            icon = Icons.Outlined.Search
                        )

                        Spacer(modifier = Modifier.width(12.dp))

                        CircleIconButton(
                            icon = Icons.Outlined.Tune
                        )
                    }
                }

                Spacer(modifier = Modifier.height(30.dp))

                // TABS
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            Color.White,
                            RoundedCornerShape(22.dp)
                        )
                        .padding(4.dp)
                ) {

                    MessageTab(
                        title = "Chats",
                        icon = Icons.Outlined.ChatBubbleOutline,
                        isSelected = true,
                        modifier = Modifier.weight(1f)
                    )

                    MessageTab(
                        title = "Announcements",
                        icon = Icons.Outlined.Campaign,
                        isSelected = false,
                        modifier = Modifier.weight(1f)
                    )
                }

                Spacer(modifier = Modifier.height(34.dp))

                // RECENT CHATS
                SectionTitle("Recent Chats")

                Spacer(modifier = Modifier.height(18.dp))

                ChatCard(
                    title = "Class Teacher",
                    subtitle = "Ms. Priya Sharma",
                    message = "Aarav did a great job in today's activity.",
                    time = "2:45 PM",
                    unreadCount = "2"
                )

                Spacer(modifier = Modifier.height(16.dp))

                ChatCard(
                    title = "Transport Admin",
                    subtitle = "",
                    message = "Bus is arriving in 5 minutes.",
                    time = "2:30 PM",
                    unreadCount = "1"
                )

                Spacer(modifier = Modifier.height(34.dp))

                // ANNOUNCEMENTS
                SectionTitle("Announcements")

                Spacer(modifier = Modifier.height(18.dp))

                AnnouncementCard(
                    title = "School Closed Tomorrow",
                    description = "School will remain closed on Friday.",
                    time = "10:30 AM"
                )

                Spacer(modifier = Modifier.height(16.dp))

                AnnouncementCard(
                    title = "Annual Day Celebration",
                    description = "Annual Day celebration details coming soon.",
                    time = "Yesterday"
                )
            }
        }
    }
}

@Composable
fun CircleIconButton(
    icon: ImageVector
) {

    Box(
        modifier = Modifier
            .size(58.dp)
            .background(
                EmeraldGreen.copy(alpha = 0.06f),
                CircleShape
            ),

        contentAlignment = Alignment.Center
    ) {

        Icon(
            imageVector = icon,

            contentDescription = null,

            tint = EmeraldGreen,

            modifier = Modifier.size(28.dp)
        )
    }
}

@Composable
fun MessageTab(
    title: String,
    icon: ImageVector,
    isSelected: Boolean,
    modifier: Modifier = Modifier
) {

    Row(
        modifier = modifier
            .background(
                if (isSelected)
                    EmeraldGreen.copy(alpha = 0.08f)
                else
                    Color.Transparent,

                RoundedCornerShape(16.dp)
            )
            .padding(vertical = 16.dp),

        horizontalArrangement = Arrangement.Center,

        verticalAlignment = Alignment.CenterVertically
    ) {

        Icon(
            imageVector = icon,

            contentDescription = null,

            tint = if (isSelected) EmeraldGreen else TextSecondary
        )

        Spacer(modifier = Modifier.width(10.dp))

        Text(
            text = title,

            color = if (isSelected) EmeraldGreen else TextSecondary,

            fontWeight = FontWeight.SemiBold,
                    fontSize = 15.sp,
        )
    }
}

@Composable
fun SectionTitle(title: String) {

    Row(
        modifier = Modifier.fillMaxWidth(),

        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        Text(
            text = title,

            fontSize = 22.sp,

            fontWeight = FontWeight.Bold,

            color = NavyBlue
        )

        Text(
            text = "View all",

            color = EmeraldGreen,

            fontWeight = FontWeight.SemiBold
        )
    }
}
