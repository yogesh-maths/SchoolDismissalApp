package com.yogesh.dismiq.ui.screens.parent.messages
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yogesh.dismiq.ui.theme.EmeraldGreen
import com.yogesh.dismiq.ui.theme.NavyBlue
import com.yogesh.dismiq.ui.theme.TextSecondary

@Composable
fun AnnouncementCard(
    title: String,
    description: String,
    time: String
) {

    Card(
        modifier = Modifier.fillMaxWidth(),

        shape = RoundedCornerShape(28.dp),

        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFF4FBF5)
        )
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),

            verticalAlignment = Alignment.CenterVertically
        ) {

            Box(
                modifier = Modifier
                    .size(64.dp)
                    .background(
                        EmeraldGreen,
                        RoundedCornerShape(18.dp)
                    ),

                contentAlignment = Alignment.Center
            ) {

                Icon(
                    imageVector = Icons.Outlined.Campaign,

                    contentDescription = null,

                    tint = Color.White,

                    modifier = Modifier.size(30.dp)
                )
            }

            Spacer(modifier = Modifier.width(16.dp))

            Column(
                modifier = Modifier.weight(1f)
            ) {

                Text(
                    text = title,

                    fontWeight = FontWeight.Bold,

                    fontSize = 18.sp,

                    color = NavyBlue
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = description,

                    color = TextSecondary
                )
            }

            Text(
                text = time,

                color = TextSecondary
            )
        }
    }
}
