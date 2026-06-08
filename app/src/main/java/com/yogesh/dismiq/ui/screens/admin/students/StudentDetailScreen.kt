package com.yogesh.dismiq.ui.screens.admin.students

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
import androidx.compose.foundation.layout.statusBarsIgnoringVisibility
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.outlined.Call
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.LocalHospital
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.VerifiedUser
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
import com.yogesh.dismiq.ui.components.SettingsCard

@Preview(showSystemUi = true, showBackground = true)


@Composable
fun StudentDetailScreen() {
    Scaffold(
        containerColor = LightBackground,
//        bottomBar = {
//            AdminBottomBar(
//                selectedTab = "students"
//            )
//        }
    )
    { padding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .statusBarsPadding(),
            contentPadding = PaddingValues(
                20.dp, 16.dp, 20.dp, 140.dp
            )
        ) {
            item {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = null
                    )
                }
                Spacer(modifier = Modifier.width(8.dp))
                Column {
                    Text(
                        text = "Student Details",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        color = NavyBlue
                    )
                    Text(
                        text = "Manage student information",

                        color = TextSecondary
                    )
                }
                Spacer(modifier = Modifier.height(20.dp))
            }

            //students profile card
            item {

                Card(

                    modifier = Modifier.fillMaxWidth(),

                    shape = RoundedCornerShape(24.dp)

                ) {

                    Column(
                        modifier = Modifier.fillMaxWidth()
                        .padding(20.dp),

                        horizontalAlignment = Alignment.CenterHorizontally

                    ) {

                        Image(
                            painter = painterResource(
                                R.drawable.student_avatar
                            ),

                            contentDescription = null,

                            modifier = Modifier
                                .size(90.dp)
                                .clip(CircleShape),

                            contentScale = ContentScale.Crop
                        )
                        Spacer(modifier = Modifier.height(12.dp))
                        Text(
                            text = "Aarav Sharma",

                            fontSize = 24.sp,

                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "Class 5 • Roll No. 23",

                            color = TextSecondary
                        )
                        Spacer(modifier = Modifier.height(12.dp))
                        // STATUS CHIP
                        Box(

                            modifier = Modifier
                                .background(
                                    EmeraldGreen.copy(alpha = 0.1f),
                                    RoundedCornerShape(50)
                                )
                                .padding(
                                    horizontal = 16.dp,
                                    vertical = 8.dp
                                )

                        ) {

                            Text(
                                text = "Waiting For Pickup",

                                color = EmeraldGreen,

                                fontWeight = FontWeight.SemiBold
                            )
                        }
                    }

                }
                Spacer(modifier = Modifier.height(20.dp))
            }
            // PARENT INFORMATION
            item {

                SettingsCard(

                    title = "Parent Information",

                    options = listOf(

                        Icons.Outlined.Person to "Rahul Sharma (Father)",

                        Icons.Outlined.Call to "+91 9876543210",

                        Icons.Outlined.Email to "rahul@gmail.com"
                    )
                )
                Spacer(modifier = Modifier.height(20.dp))
            }
            // PICKUP PERMISSIONS
            item {

                SettingsCard(

                    title = "Pickup Permissions",

                    options = listOf(

                        Icons.Outlined.VerifiedUser to "Rahul Sharma",

                        Icons.Outlined.VerifiedUser to "Priya Sharma",

                        Icons.Outlined.VerifiedUser to "Amit Sharma"
                    )
                )

                Spacer(modifier = Modifier.height(20.dp))
            }
            // EMERGENCY CONTACTS
            item {

                SettingsCard(

                    title = "Emergency Contacts",

                    options = listOf(

                        Icons.Outlined.LocalHospital to "Dr. Rajesh",

                        Icons.Outlined.Call to "+91 9999999999"
                    )
                )

                Spacer(modifier = Modifier.height(20.dp))
            }
            // QUICK ACTIONS
            item {

                Text(

                    text = "Quick Actions",

                    fontSize = 22.sp,

                    fontWeight = FontWeight.Bold,

                    color = NavyBlue
                )

                Spacer(modifier = Modifier.height(16.dp))


            Row(

                modifier = Modifier.fillMaxWidth(),

                horizontalArrangement =
                    Arrangement.spacedBy(12.dp)

            ) {

                Button(
                    onClick = { },
                    modifier = Modifier.weight(1f)
                ) {
                    Text("Scan QR")
                }

                Button(
                    onClick = { },
                    modifier = Modifier.weight(1f)
                ) {
                    Text("Call Parent")
                }
            }
        }
    }
        }
}