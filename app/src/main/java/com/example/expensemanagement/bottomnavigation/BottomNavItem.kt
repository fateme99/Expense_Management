package com.example.expensemanagement.bottomnavigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItem(
    val name: String,
    val route: String,
    val icon: ImageVector
) {
    object Home : BottomNavItem(
        name = "home",
        route = ScreenRoutes.HomeScreen.route,
        icon = Icons.Filled.Home
    )

    object Cost : BottomNavItem(
        name = "cost",
        route = ScreenRoutes.CostScreen.route,
        icon = Icons.Filled.ShoppingCart
    )

    object Salary : BottomNavItem(
        name = "salary",
        route = ScreenRoutes.SalaryScreen.route,
        icon = Icons.Default.AccountBox
    )
}
