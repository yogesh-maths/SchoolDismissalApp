package com.yogesh.dismiq.ui.screens.parent.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yogesh.dismiq.R
import com.yogesh.dismiq.ui.theme.EmeraldGreen
import com.yogesh.dismiq.ui.theme.LightBackground
import com.yogesh.dismiq.ui.theme.NavyBlue
import com.yogesh.dismiq.ui.theme.TextSecondary
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.yogesh.dismiq.ui.components.DismiQBottomBar
import com.yogesh.dismiq.ui.screens.scan.ScanScreen
@Preview(showBackground = true, showSystemUi = true)

@Composable
fun ParentDashboardScreen() {
    var selectedScreen by remember {
        mutableStateOf("home")
    }

    val configuration = LocalConfiguration.current

    val screenWidth = configuration.screenWidthDp

    val isSmallDevice = screenWidth < 360

    val horizontalPadding = if (isSmallDevice) 14.dp else 20.dp

    val greetingTitleSize = if (isSmallDevice) 28.sp else 34.sp

    val greetingSubtitleSize = if (isSmallDevice) 14.sp else 16.sp

    val studentImageSize = if (isSmallDevice) 82.dp else 100.dp

    val studentNameSize = if (isSmallDevice) 18.sp else 22.sp

    val statusTextSize = if (isSmallDevice) 16.sp else 18.sp

    val gradeTextSize = if (isSmallDevice) 12.sp else 14.sp

    val schoolTextSize = if (isSmallDevice) 11.sp else 12.sp

    val iconBoxSize = if (isSmallDevice) 50.dp else 56.dp

    val notificationSize = if (isSmallDevice) 52.dp else 58.dp

    val cardRadius = if (isSmallDevice) 24.dp else 30.dp

    Scaffold(
        containerColor = LightBackground,
        bottomBar = {

            if (selectedScreen != "scan") {


                DismiQBottomBar(
                    selectedTab = selectedScreen,
                    onScanClick = {
                        selectedScreen = "scan"
                    }
                )
            }
        }

    ) { padding ->
        when (selectedScreen) {

            "home" -> {

                LazyColumn(
                    modifier = Modifier
                        .fillMaxSize()
                        .statusBarsPadding()
                        .background(LightBackground),

                    contentPadding = PaddingValues(
                        start = horizontalPadding,
                        end = horizontalPadding,
                        top = 16.dp,
                        bottom = 150.dp
                    ),

                    verticalArrangement = Arrangement.spacedBy(24.dp)
                ) {
                    item {
                        Row(
                            modifier = Modifier.fillMaxWidth(),

                            horizontalArrangement = Arrangement.SpaceBetween,

                            verticalAlignment = Alignment.CenterVertically
                        ) {

                            Column(
                                modifier = Modifier
                                    .weight(1f)
                                    .padding(vertical = 20.dp)

                            ) {

                                Text(
                                    text = "Good Morning,",

                                    fontSize = 18.sp,

                                    color = TextSecondary
                                )

                                Spacer(modifier = Modifier.height(4.dp))

                                Row(
                                    verticalAlignment = Alignment.CenterVertically
                                ) {

                                    Text(
                                        text = "Rahul Sharma",

                                        fontSize = 26.sp,

                                        fontWeight = FontWeight.Bold,

                                        color = NavyBlue.copy(0.9f),

                                        maxLines = 2
                                    )

                                    Spacer(modifier = Modifier.width(6.dp))

                                    Text(
                                        text = "👋",

                                        fontSize = 28.sp
                                    )
                                }

                                Spacer(modifier = Modifier.height(10.dp))

                                Text(
                                    text = "Track your child's dismissal in real time",

                                    fontSize = greetingSubtitleSize,

                                    color = TextSecondary
                                )
                            }

                            Spacer(modifier = Modifier.width(12.dp))

                            Box(
                                modifier = Modifier
                                    .size(notificationSize)
                                    .shadow(
                                        elevation = 5.dp,
                                        shape = CircleShape
                                    )
                                    .background(
                                        Color.White,
                                        CircleShape
                                    ),

                                contentAlignment = Alignment.Center
                            ) {

                                Icon(
                                    imageVector = Icons.Outlined.Notifications,
                                    contentDescription = null,

                                    tint = NavyBlue,

                                    modifier = Modifier.size(28.dp)
                                )
                            }
                        }

                        Spacer(modifier = Modifier.height(2.dp))
                    }
                    item {
                        Card(
                            modifier = Modifier.fillMaxWidth(),

                            shape = RoundedCornerShape(cardRadius),

                            colors = CardDefaults.cardColors(
                                containerColor = Color.White
                            ),

                            elevation = CardDefaults.cardElevation(
                                defaultElevation = 5.dp
                            )
                        ) {

                            Column {

                                Box(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .background(
                                            NavyBlue,
                                            RoundedCornerShape(
                                                topStart = cardRadius,
                                                topEnd = cardRadius
                                            )
                                        )
                                ) {

                                    Row(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .padding(
                                                horizontal = 10.dp,
                                                vertical = 10.dp
                                            ),

                                        verticalAlignment = Alignment.Top
                                    ) {

                                        Image(
                                            painter = painterResource(
                                                id = R.drawable.student_avatar
                                            ),

                                            contentDescription = null,

                                            modifier = Modifier
                                                .size(studentImageSize)
                                                .clip(RoundedCornerShape(22.dp)),

                                            contentScale = ContentScale.Crop
                                        )

                                        Spacer(modifier = Modifier.width(6.dp))

                                        Column(
                                            modifier = Modifier
                                                .weight(1f)
                                        ) {

                                            Text(
                                                text = "Arjun Sharma",

                                                color = Color.White,

                                                fontSize = 24.sp,

                                                fontWeight = FontWeight.Bold,

                                                maxLines = 2,

                                                overflow = TextOverflow.Ellipsis
                                            )

                                            Spacer(modifier = Modifier.height(6.dp))

                                            Box(
                                                modifier = Modifier
                                                    .background(
                                                        Color.White.copy(alpha = 0.12f),
                                                        RoundedCornerShape(14.dp)
                                                    )
                                                    .padding(
                                                        horizontal = 12.dp,
                                                        vertical = 8.dp
                                                    )
                                            ) {

                                                Text(
                                                    text = "Grade 5 • Section A",

                                                    color = Color.White.copy(alpha = 0.85f),

                                                    fontSize = gradeTextSize,

                                                    maxLines = 2
                                                )
                                            }

                                            Spacer(modifier = Modifier.height(6.dp))

                                            Text(
                                                text = "Greenfield International School",

                                                color = Color.White.copy(alpha = 0.7f),

                                                fontSize = schoolTextSize,

                                                maxLines = 2,

                                                overflow = TextOverflow.Ellipsis
                                            )

                                            Spacer(modifier = Modifier.height(6.dp))
                                        }


                                    }
                                }


                                Box(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .offset(y = (-10).dp)
                                ) {

                                    Row(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .background(
                                                Color.White,
                                                RoundedCornerShape(
                                                    topStart = 16.dp,
                                                    topEnd = 16.dp,
                                                    bottomStart = cardRadius,
                                                    bottomEnd = cardRadius
                                                )
                                            )
                                            .padding(
                                                horizontal = 12.dp,
                                                vertical = 8.dp
                                            ),

                                        horizontalArrangement = Arrangement.SpaceBetween,

                                        verticalAlignment = Alignment.CenterVertically
                                    ) {

                                        Row(
                                            modifier = Modifier.weight(1f),

                                            verticalAlignment = Alignment.CenterVertically
                                        ) {

                                            Box(
                                                modifier = Modifier
                                                    .size(45.dp)
                                                    .background(
                                                        Color(0xFFEFFAF3),
                                                        RoundedCornerShape(18.dp)
                                                    ),

                                                contentAlignment = Alignment.Center
                                            ) {

                                                Icon(
                                                    imageVector = Icons.Default.Check,

                                                    contentDescription = null,

                                                    tint = EmeraldGreen,

                                                    modifier = Modifier.size(25.dp)
                                                )
                                            }

                                            Spacer(modifier = Modifier.width(6.dp))

                                            Column {

                                                Text(
                                                    text = "Current Status",

                                                    color = TextSecondary,

                                                    fontSize = 12.sp
                                                )

                                                Spacer(modifier = Modifier.height(2.dp))

                                                Text(
                                                    text = "Ready for Pickup",

                                                    color = EmeraldGreen,

                                                    fontSize = statusTextSize,

                                                    fontWeight = FontWeight.Bold,

                                                    maxLines = 1,

                                                    overflow = TextOverflow.Ellipsis
                                                )

                                                Spacer(modifier = Modifier.height(2.dp))

                                                Text(
                                                    text = "At School Gate",

                                                    color = TextSecondary,

                                                    fontSize = 13.sp
                                                )
                                            }
                                        }

                                        Spacer(modifier = Modifier.width(10.dp))

                                        Column(
                                            horizontalAlignment = Alignment.End
                                        ) {

                                            Box(
                                                modifier = Modifier
                                                    .background(
                                                        Color(0xFFEFFAF3),
                                                        RoundedCornerShape(14.dp)
                                                    )
                                                    .padding(
                                                        horizontal = 10.dp,
                                                        vertical = 6.dp
                                                    )
                                            ) {

                                                Text(
                                                    text = "9:32 AM",

                                                    color = EmeraldGreen,

                                                    fontWeight = FontWeight.Bold,

                                                    fontSize = 14.sp
                                                )
                                            }

                                            Spacer(modifier = Modifier.height(6.dp))

                                            Text(
                                                text = "Updated just now",

                                                color = TextSecondary,

                                                fontSize = 10.sp,

                                                maxLines = 1
                                            )
                                        }
                                    }
                                }
                            }
                        }
                        Spacer(modifier = Modifier.height(24.dp))

                        Card(
                            modifier = Modifier.fillMaxWidth(),

                            shape = RoundedCornerShape(24.dp),

                            colors = CardDefaults.cardColors(
                                containerColor = Color.White
                            ),

                            elevation = CardDefaults.cardElevation(
                                defaultElevation = 4.dp
                            )
                        ) {
                            Column(
                                modifier = Modifier.padding(
                                    horizontal = 16.dp,
                                    vertical = 20.dp
                                )
                            ) {
                            }

                            // Header
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(start = 16.dp, end = 16.dp),

                                horizontalArrangement = Arrangement.SpaceBetween,

                                verticalAlignment = Alignment.CenterVertically
                            ) {

                                Text(
                                    text = "Today's Timeline",

                                    fontSize = 20.sp,

                                    fontWeight = FontWeight.Bold,

                                    color = NavyBlue.copy(0.8f)
                                )

                                Text(
                                    text = "View All",

                                    color = EmeraldGreen,

                                    fontWeight = FontWeight.SemiBold
                                )
                            }

                            Spacer(modifier = Modifier.height(24.dp))

                            // Timeline Items

                            TimelineItem(
                                title = "School Day Completed",
                                subtitle = "Dismissal workflow updated",
                                time = "2:30 PM",
                                completed = true,


                                )


                            TimelineItem(
                                title = "Pickup Approved",
                                subtitle = "Dismissal workflow updated",
                                time = "2:45 PM",
                                completed = true
                            )

                            TimelineItem(
                                title = "Ready For Pickup",
                                subtitle = "Dismissal workflow updated",
                                time = "2:52 PM",
                                completed = true
                            )

                            TimelineItem(
                                title = "Student Picked Up",
                                subtitle = "Dismissal workflow updated",
                                time = "--",
                                completed = false
                            )
                        }
                    }

                    item {


                        Spacer(modifier = Modifier.height(18.dp))
                        Row(
                            modifier = Modifier,

                            horizontalArrangement = Arrangement.spacedBy(14.dp)
                        ) {


                            Card(
                                modifier = Modifier.fillMaxWidth(),

                                shape = RoundedCornerShape(28.dp),

                                colors = CardDefaults.cardColors(
                                    containerColor = Color.White
                                ),

                                elevation = CardDefaults.cardElevation(
                                    defaultElevation = 4.dp
                                )
                            ) {

                                Column(
                                    modifier = Modifier.padding(24.dp)
                                ) {

                                    Text(
                                        text = "Quick Actions",

                                        fontSize = 21.sp,

                                        fontWeight = FontWeight.Bold,

                                        color = NavyBlue.copy(0.8f)
                                    )

                                    Spacer(modifier = Modifier.height(24.dp))

                                    Row(
                                        modifier = Modifier.fillMaxWidth(),

                                        horizontalArrangement = Arrangement.SpaceBetween
                                    ) {

                                        QuickActionItem(
                                            title = "Call School",
                                            icon = R.drawable.contact
                                        )

                                        QuickActionItem(
                                            title = "Update Pickup",
                                            icon = R.drawable.ic_update_pickup
                                        )

                                        QuickActionItem(
                                            title = "History",
                                            icon = R.drawable.history
                                        )
                                    }
                                }
                            }
                        }

                    }
                }
            }


            "scan" -> {

                ScanScreen()
            }
        }
    }
}



@Composable
fun TimelineItem(
    title: String,
    subtitle: String,
    time: String,
    completed: Boolean
) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 24.dp, end = 20.dp),

        horizontalArrangement = Arrangement.spacedBy(5.dp),

        verticalAlignment = Alignment.CenterVertically
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Box(
                modifier = Modifier
                    .size(20.dp)
                    .background(
                        if (completed) EmeraldGreen
                        else Color.LightGray,
                        CircleShape
                    )
            )

            Spacer(modifier = Modifier.height(4.dp))

            Box(
                modifier = Modifier
                    .width(3.dp)
                    .height(50.dp)
                    .background(
                        if (completed)
                            EmeraldGreen.copy(alpha = 0.3f)
                        else
                            Color.LightGray.copy(alpha = 0.5f)
                    )
            )
        }

        Spacer(modifier = Modifier.width(16.dp))

        Column(
            modifier = Modifier
                .weight(1f)
                .padding(end = 20.dp)
        ) {

            Text(
                text = title,

                fontSize = 16.sp,

                fontWeight = FontWeight.Bold,

                color = NavyBlue
            )

            Spacer(modifier = Modifier.height(6.dp))

            Text(
                text = subtitle,

                fontSize = 14.sp,

                color = TextSecondary
            )
        }


        Spacer(modifier = Modifier.width(12.dp))

        Text(
            text = time,

            fontSize = 14.sp,

            color = TextSecondary
        )
    }
}


@Composable
fun QuickActionCard(
    modifier: Modifier = Modifier,
    title: String,
    icon: Int,
    backgroundColor: Color
) {

    Card(
        modifier = modifier
            .height(120.dp)
            .clickable {},

        shape = RoundedCornerShape(24.dp),

        colors = CardDefaults.cardColors(
            containerColor = backgroundColor
        ),

        elevation = CardDefaults.cardElevation(
            defaultElevation = 2.dp
        )
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(14.dp),

            verticalArrangement = Arrangement.Center,

            horizontalAlignment = Alignment.CenterHorizontally
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

                Image(
                    painter = painterResource(id = icon),

                    contentDescription = null,

                    modifier = Modifier.size(30.dp),

                    contentScale = ContentScale.Fit
                )
            }

            Spacer(modifier = Modifier.height(14.dp))

            Text(
                text = title,

                color = NavyBlue,

                fontWeight = FontWeight.SemiBold,

                fontSize = 13.sp,

                maxLines = 2
            )
        }
    }
}
@Composable
fun QuickActionItem(
    title: String,
    icon: Int
) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Box(
            modifier = Modifier
                .size(70.dp)
                .background(
                    Color(0xFFF1F8F3),
                    RoundedCornerShape(20.dp)
                ),

            contentAlignment = Alignment.Center
        ) {

            Image(
                painter = painterResource(id = icon),

                contentDescription = null,

                modifier = Modifier.size(52.dp),

                contentScale = ContentScale.Fit
            )
        }

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = title,

            fontSize = 14.sp,

            fontWeight = FontWeight.SemiBold,

            color = NavyBlue,

            textAlign = TextAlign.Center
        )
    }
}