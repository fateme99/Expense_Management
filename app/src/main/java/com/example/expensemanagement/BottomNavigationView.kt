package com.example.expensemanagement

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.expensemanagement.ui.theme.LightBlue

@Composable
fun BottomNavigationView(navController: NavController) {
    val navItems = listOf(BottomNavItem.Home, BottomNavItem.Cost, BottomNavItem.Salary)
    BottomNavigation(
        backgroundColor = LightBlue,
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRow = navBackStackEntry?.destination?.route
        navItems.forEach { item ->

            BottomNavigationItem(
                selected = currentRow == item.route,
                icon = { Icon(imageVector = item.icon, contentDescription = item.name) },
                label = { Text(text = item.name) },
                selectedContentColor = Color.White,
                unselectedContentColor = Color.White.copy(0.4f),
                onClick = {
                    navController.navigate(item.route)
                }
            )
        }
    }
}