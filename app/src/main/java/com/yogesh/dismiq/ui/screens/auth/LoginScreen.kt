package com.yogesh.dismiq.ui.screens.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.MailOutline
import androidx.compose.material.icons.outlined.Visibility
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yogesh.dismiq.R
import com.yogesh.dismiq.ui.components.AppButton
import com.yogesh.dismiq.ui.components.AppTextField
import com.yogesh.dismiq.ui.theme.EmeraldGreen
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.material.icons.outlined.Shield
import androidx.compose.material.icons.outlined.VisibilityOff
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.IconButton
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.withStyle
import androidx.navigation.NavController
import com.yogesh.dismiq.navigation.Screen
import com.yogesh.dismiq.ui.components.SocialButton
import com.yogesh.dismiq.ui.theme.NavyBlue





@Composable
fun LoginScreen(
navController: NavController
) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var passwordVisible by remember { mutableStateOf(false) }
    Box(modifier = Modifier.fillMaxSize())
    { // Background Illustration
        Image(
            painter = painterResource(R.drawable.school_bg),
            contentDescription = null,
            modifier = Modifier.size(500.dp)
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .alpha(0.45f),
            contentScale = ContentScale.FillWidth
        )
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp, vertical = 70.dp),

        horizontalAlignment = Alignment.CenterHorizontally
    )

    { // Background Illustration
        Image(
            painter = painterResource(id = R.drawable.school_bg1),
            contentDescription = null,

            modifier = Modifier
                .size(90.dp)
        )
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            buildAnnotatedString {

                withStyle(
                    style = SpanStyle(
                        color = NavyBlue
                    )
                ) {
                    append("Dismi")
                }

                withStyle(
                    style = SpanStyle(
                        color = EmeraldGreen
                    )
                ) {
                    append("Q")
                }
            },

            fontSize = 32.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(Modifier.height(8.dp))

        Text(
            text = "Smart School Dismissals",
            color = MaterialTheme.colorScheme.secondary.copy(0.5f)
        )
        Spacer(modifier = Modifier.height(3.dp))

        Box(
            modifier = Modifier
                .width(70.dp)
                .height(4.dp)
                .clip(RoundedCornerShape(50))
                .background(EmeraldGreen)
        )
        Spacer(Modifier.height(5.dp))
        AppTextField(
            value =email,
            onValueChange = {email = it},
            label = "Email",
        leadingIcon = {
            Icon(
                imageVector = Icons.Outlined.MailOutline,
                contentDescription = null,
                tint = EmeraldGreen
            )
        }
        )
        Spacer(modifier = Modifier.height(16.dp))
        AppTextField(
            value = password,
            onValueChange = { password = it },
            label = "Password",
            leadingIcon = {
                Icon(
                    imageVector = Icons.Outlined.Lock,
                    contentDescription = null,
                    tint = EmeraldGreen
                )
            },
            trailingIcon= {
                IconButton(
                    onClick = { passwordVisible = !passwordVisible}
                ) {
                    Icon(
                        imageVector =
                            if(passwordVisible) Icons.Outlined.Visibility
                        else
                        Icons.Outlined.VisibilityOff,
                        contentDescription = null,
                        tint = Color.Gray
                    )
                }

            },
            visualTransformation =
                if (passwordVisible) VisualTransformation.None
            else
                    PasswordVisualTransformation()
        )
        Text(
            text = "Forgot Password?",
            color = EmeraldGreen,
            fontSize = 13.sp,
            modifier = Modifier.align(Alignment.End).padding(top = 8.dp)
        )
    Spacer(modifier = Modifier.height(28.dp))

    AppButton(
        text = "Login",
        onClick = {

            navController.navigate(
                Screen.ParentDashboard.route
            )
        }
    )
Spacer(modifier = Modifier.height(30.dp))
        Row(verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center){
            HorizontalDivider(
                modifier = Modifier.weight(1f),
                color = Color.LightGray
            )
            Text("OR",
                color = Color.Gray, modifier = Modifier.background(Color.White).padding(horizontal = 8.dp)
                )
            HorizontalDivider(
                modifier = Modifier.weight(1f),
                color = Color.LightGray
            )
            Spacer(modifier = Modifier.height(24.dp))



        }
        SocialButton(

            text = "Continue with Google",
            icon = R.drawable.google_icon,

        ){}
        Spacer(modifier = Modifier.height(10.dp))

        Row(
            modifier = Modifier.fillMaxWidth()
                .background(
                    Color.White.copy(alpha = 0.75f),
                    RoundedCornerShape(20.dp)
                )
                .padding(horizontal = 12.dp, vertical = 6.dp),

            horizontalArrangement = Arrangement.Center,

            verticalAlignment = Alignment.CenterVertically

        )
        {

            Icon(
                imageVector = Icons.Outlined.Shield,
                contentDescription = null,

                tint = EmeraldGreen,

                modifier = Modifier.size(22.dp)
            )

            Spacer(modifier = Modifier.width(8.dp))

            Text(
                buildAnnotatedString {

                    withStyle(
                        style = SpanStyle(
                            color = EmeraldGreen
                        )
                    ) {
                        append("Safety First.")
                    }

                    append(" ")

                    withStyle(
                        style = SpanStyle(
                            color = Color.Gray
                        )
                    ) {
                        append("Every Dismissal is Secure.")
                    }
                },

                fontSize = 13.sp
            )
        }
}
}


