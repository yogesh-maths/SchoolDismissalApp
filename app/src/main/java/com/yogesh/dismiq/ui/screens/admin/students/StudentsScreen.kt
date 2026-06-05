package com.yogesh.dismiq.ui.screens.admin.students

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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.FilterList
import androidx.compose.material.icons.outlined.NotificationsNone
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yogesh.dismiq.ui.components.AdminBottomBar
import com.yogesh.dismiq.ui.screens.parent.messages.CircleIconButton
import com.yogesh.dismiq.ui.theme.EmeraldGreen
import com.yogesh.dismiq.ui.theme.LightBackground
import com.yogesh.dismiq.ui.theme.NavyBlue
import com.yogesh.dismiq.ui.theme.TextSecondary

@Preview(showSystemUi = true, showBackground = true)

@Composable
fun StudentsScreen(){
    var selectedFilter by remember { mutableStateOf("All") }
    Scaffold(
        containerColor = LightBackground,
        bottomBar = {
            AdminBottomBar(
                selectedTab = "students",
                onScanClick = {}
            )
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .statusBarsPadding(),
            contentPadding = PaddingValues(start = 20.dp, 16.dp, 20.dp, 140.dp)
        ) {
            item {
                //header
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Column{
                        Text(
                            text = "Students",

                            fontSize = 32.sp,

                            fontWeight = FontWeight.Bold,

                            color = NavyBlue
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = "Manage and monitor all students",
                            fontSize = 16.sp,
                            color = TextSecondary
                        )
                    }
                    Row{
                        CircleIconButton(
                            icon = Icons.Outlined.FilterList
                        )
                        Spacer(modifier = Modifier.width(12.dp))
                        CircleIconButton(
                            icon = Icons.Outlined.NotificationsNone
                        )
                    }
                }
                Spacer(modifier = Modifier.height(20.dp))
                StudentSearchBar()
                Spacer(modifier = Modifier.height(20.dp))
            }
            item {

                LazyRow(

                    horizontalArrangement = Arrangement.spacedBy(12.dp)

                ) {

                    items(
                        listOf(
                            "All",
                            "Waiting",
                            "Picked Up",
                            "Bus",
                            "Emergency"
                        )
                    ) { filter ->

                        StudentFilterChip(

                            title = filter,

                            selected = selectedFilter == filter,

                            onClick = {
                                selectedFilter = filter
                            }
                        )
                    }
                }
            }
            item {
                Spacer(modifier = Modifier.height(24.dp))
            }

            items(8) {

                StudentCard(
                    name = "Arjun Mehta",
                    className = "Class 5 • Roll No. 23",
                    guardian = "Rohan Mehta (Father)",
                    location = "Gate 1 - School Main Gate",
                    status = "Waiting"
                )

                Spacer(modifier = Modifier.height(16.dp))
            }
        }


    }
    @Composable
    fun CircleIconButton(
        icon: ImageVector
    ) {

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
                imageVector = icon,

                contentDescription = null,

                tint = EmeraldGreen,

                modifier = Modifier.size(28.dp)
            )
        }
    }
}