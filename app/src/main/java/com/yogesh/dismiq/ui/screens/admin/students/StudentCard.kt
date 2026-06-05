package com.yogesh.dismiq.ui.screens.admin.students

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.ui.unit.dp
import com.yogesh.dismiq.ui.theme.EmeraldGreen
import com.yogesh.dismiq.ui.theme.TextSecondary
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color
import com.yogesh.dismiq.R
import com.yogesh.dismiq.ui.theme.NavyBlue

@Composable
fun StudentCard(

    name: String,

    className: String,

    guardian: String,

    location: String,

    status: String

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
                .padding(16.dp),

            verticalAlignment = Alignment.CenterVertically

        ) {

            Image(
                painter = painterResource(R.drawable.student_avatar),

                contentDescription = null,

                modifier = Modifier
                    .size(72.dp)
                    .clip(CircleShape),

                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.width(16.dp))

            Column(
                modifier = Modifier.weight(1f)
            ) {

                Text(
                    text = name,

                    fontSize = 20.sp,

                    fontWeight = FontWeight.Bold,

                    color = NavyBlue
                )

                Spacer(modifier = Modifier.height(4.dp))

                Text(
                    text = className,

                    fontSize = 14.sp,

                    color = TextSecondary
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = guardian,

                    fontSize = 14.sp,

                    color = TextSecondary
                )

                Spacer(modifier = Modifier.height(4.dp))

                Text(
                    text = location,

                    fontSize = 13.sp,

                    color = EmeraldGreen
                )
            }

            StudentStatusChip(
                status = status
            )
        }
    }
}
