package com.yogesh.dismiq.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.yogesh.dismiq.ui.screens.auth.LoginScreen
import com.yogesh.dismiq.ui.screens.parent.dashboard.ParentDashboardScreen
//import com.yogesh.dismiq.ui.screens.StaffDashboardScreen

@Composable
fun NavGraph(){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Routes.LOGIN
    ){
        composable(Routes.LOGIN){ LoginScreen(navController) }
        composable(Routes.PARENT_DASHBOARD){ ParentDashboardScreen() }
        //composable(Routes.STAFF_DASHBOARD){ StaffDashboardScreen() }
        composable(Routes.PARENT_DASHBOARD){ParentDashboardScreen()}

    }
}