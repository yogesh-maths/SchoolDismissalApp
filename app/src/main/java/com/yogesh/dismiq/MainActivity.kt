package com.yogesh.dismiq

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.yogesh.dismiq.ui.screens.parent.dashboard.ParentDashboardScreen
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.yogesh.dismiq.navigation.Screen
import com.yogesh.dismiq.ui.screens.auth.LoginScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            val navController = rememberNavController()

            NavHost(
                navController = navController,
                startDestination = Screen.Login.route
            ) {

                composable(Screen.Login.route) {

                    LoginScreen(navController)
                }

                composable(Screen.ParentDashboard.route) {

                    ParentDashboardScreen()
                }
            }
        }
    }
}


