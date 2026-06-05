package com.yogesh.dismiq.ui.components

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ChatBubbleOutline
import androidx.compose.material.icons.outlined.Groups
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.PersonOutline
import androidx.compose.material.icons.outlined.QrCodeScanner
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yogesh.dismiq.ui.theme.EmeraldGreen
import kotlinx.coroutines.delay


@Composable
fun BottomBarItem(
    icon: ImageVector,
    title: String,
    isSelected: Boolean = false,

){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Icon(
        imageVector = icon,
        contentDescription = null,
        tint = if (isSelected) EmeraldGreen
        else Color.Gray,
        modifier = Modifier.size(26.dp)
        )
        Spacer(modifier = Modifier.height(2.dp))
        Text(
            text = title,
            fontSize = 11.sp,
            fontWeight =
                if (isSelected) FontWeight.SemiBold
            else FontWeight.Normal,
            color =
                if(isSelected)EmeraldGreen
            else
                    Color.Gray
        )
        if (isSelected){
            Spacer(modifier = Modifier.height(6.dp))
            Box(
                modifier = Modifier
                    .width(18.dp)
                    .height(4.dp)
                    .background(
                        EmeraldGreen,
                        RoundedCornerShape(50)
                    )
            )
        }
    }
}
//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DismiQBottomBar(onScanClick: () -> Unit, selectedTab: String,) {
    var isPressed by remember {
        mutableStateOf(false)
    }
    val glowElevation by animateDpAsState(
        targetValue = if (isPressed) 18.dp else 6.dp,
        label = ""
    )
    val scale by animateFloatAsState(
        targetValue = if (isPressed) 0.92f else 1f,
        label = ""
    )
    LaunchedEffect(isPressed) {

        if (isPressed) {

            delay(120)

            onScanClick()

            isPressed = false
        }
    }
    Box(
        modifier = Modifier
            .fillMaxWidth()

            .navigationBarsPadding()
            .padding(horizontal = 12.dp, vertical = 0.dp)

    ) {
Card(
    modifier = Modifier
        .fillMaxWidth()
        .height(60.dp)
        .align(Alignment.BottomCenter),
    RoundedCornerShape(
        topStart = 30.dp,
        topEnd = 30.dp
    ),
    colors = CardDefaults.cardColors(
        containerColor = Color.White
    ),
    elevation = CardDefaults.cardElevation(
        defaultElevation = 3.dp
    )

    ) {
Row(
    modifier = Modifier
        .fillMaxSize()
        .padding(horizontal = 24.dp),
    horizontalArrangement = Arrangement.SpaceBetween,
    verticalAlignment = Alignment.CenterVertically
){
    BottomBarItem(
        icon = Icons.Outlined.Home,
        "Home",
        isSelected = true
    )
    BottomBarItem(
        icon = Icons.Outlined.Groups,
        "Children"
    )
    Spacer(modifier = Modifier.width(74.dp))
    BottomBarItem(
        icon = Icons.Outlined.ChatBubbleOutline,
        "messages"
    )
    BottomBarItem(
        icon = Icons.Outlined.PersonOutline,
        "profile"
    )
       }
      }
        Box(
            modifier = Modifier
                .size(76.dp)
                .align(Alignment.TopCenter)
                .offset(y = (-12).dp)
                .graphicsLayer {
                    scaleX = scale
                    scaleY = scale
                }
                .shadow(
                    elevation = glowElevation,
                    shape = CircleShape
                )
                .background(
                    EmeraldGreen,
                    CircleShape
                )
                .border(
                    6.dp,
                    Color.White,
                    CircleShape
                )
                .background(
                    EmeraldGreen,
                    CircleShape
                )
                .clickable(
                    indication = null,
                    interactionSource = remember {
                        MutableInteractionSource()
                    }
                )
                {

                    isPressed = true


                },
            contentAlignment = Alignment.Center
        ){
            Icon(
                imageVector = Icons.Outlined.QrCodeScanner,
                contentDescription = null,
                tint = Color.White,
                modifier = Modifier.size(38.dp)
            )
        }
    }
}