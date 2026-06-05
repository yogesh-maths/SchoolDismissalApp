package com.yogesh.dismiq.ui.components
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ChatBubbleOutline
import androidx.compose.material.icons.outlined.Dashboard
import androidx.compose.material.icons.outlined.Groups
import androidx.compose.material.icons.outlined.PersonOutline
import androidx.compose.material.icons.outlined.QrCodeScanner
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yogesh.dismiq.ui.theme.EmeraldGreen
import com.yogesh.dismiq.ui.theme.TextSecondary


@Composable
fun AdminBottomBar(

    selectedTab: String,

    onDashboardClick: () -> Unit = {},

    onStudentsClick: () -> Unit = {},

    onScanClick: () -> Unit = {},

    onMessagesClick: () -> Unit = {},

    onProfileClick: () -> Unit = {}

) {

    Box(

        modifier = Modifier
            .fillMaxWidth()
            .navigationBarsPadding()
            .padding(horizontal = 18.dp, vertical = 10.dp)

    ) {

        // MAIN BAR
        Card(

            modifier = Modifier
                .fillMaxWidth()
                .height(88.dp),

            shape = RoundedCornerShape(34.dp),

            colors = CardDefaults.cardColors(
                containerColor = Color.White
            ),

            elevation = CardDefaults.cardElevation(
                defaultElevation = 8.dp
            )

        ) {

            Row(

                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 24.dp),

                horizontalArrangement = Arrangement.SpaceBetween,

                verticalAlignment = Alignment.CenterVertically

            ) {

                AdminBottomItem(
                    icon = Icons.Outlined.Dashboard,
                    title = "Dashboard",
                    isSelected = selectedTab == "dashboard",
                    onClick = onDashboardClick
                )

                AdminBottomItem(
                    icon = Icons.Outlined.Groups,
                    title = "Students",
                    isSelected = selectedTab == "students",
                    onClick = onStudentsClick
                )

                Spacer(modifier = Modifier.width(72.dp))

                AdminBottomItem(
                    icon = Icons.Outlined.ChatBubbleOutline,
                    title = "Messages",
                    isSelected = selectedTab == "messages",
                    onClick = onMessagesClick
                )

                AdminBottomItem(
                    icon = Icons.Outlined.PersonOutline,
                    title = "Profile",
                    isSelected = selectedTab == "profile",
                    onClick = onProfileClick
                )
            }
        }

        // FLOATING SCAN BUTTON
        Box(

            modifier = Modifier
                .size(84.dp)
                .align(Alignment.TopCenter)
                .offset(y = (-18).dp)
                .shadow(
                    elevation = 16.dp,
                    shape = CircleShape
                )
                .background(
                    EmeraldGreen,
                    CircleShape
                )
                .border(
                    width = 8.dp,
                    color = Color.White,
                    shape = CircleShape
                )
                .clickable(
                    indication = null,
                    interactionSource = remember {
                        MutableInteractionSource()
                    }
                ) {
                    onScanClick()
                },

            contentAlignment = Alignment.Center

        ) {

            Icon(
                imageVector = Icons.Outlined.QrCodeScanner,

                contentDescription = null,

                tint = Color.White,

                modifier = Modifier.size(40.dp)
            )
        }
    }
}
@Composable
fun AdminBottomItem(

    icon: ImageVector,

    title: String,

    isSelected: Boolean,

    onClick: () -> Unit

) {

    Column(

        modifier = Modifier
            .clickable(
                indication = null,
                interactionSource = remember {
                    MutableInteractionSource()
                }
            ) {
                onClick()
            },

        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        Icon(
            imageVector = icon,

            contentDescription = null,

            tint = if (isSelected)
                EmeraldGreen
            else
                TextSecondary,

            modifier = Modifier.size(26.dp)
        )

        Spacer(modifier = Modifier.height(4.dp))

        Text(
            text = title,

            fontSize = 12.sp,

            fontWeight = if (isSelected)
                FontWeight.SemiBold
            else
                FontWeight.Normal,

            color = if (isSelected)
                EmeraldGreen
            else
                TextSecondary
        )

        Spacer(modifier = Modifier.height(4.dp))

        if (isSelected) {

            Box(
                modifier = Modifier
                    .width(18.dp)
                    .height(3.dp)
                    .background(
                        EmeraldGreen,
                        RoundedCornerShape(50)
                    )
            )
        }
    }
}