package com.yogesh.dismiq.navigation

sealed class Screen(val route: String) {

    object Login : Screen("login")

    object ParentDashboard : Screen("parent_dashboard")
}
object Routes {
    const val LOGIN = "login"
    const val PARENT_DASHBOARD = "parent_dashboard"
    const val STAFF_DASHBOARD = "staff_dashboard"
}