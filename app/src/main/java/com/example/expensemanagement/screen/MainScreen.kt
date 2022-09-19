package com.example.expensemanagement.screen

import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.expensemanagement.BottomNavigationView
import com.example.expensemanagement.CostScreen
import com.example.expensemanagement.SalaryScreen
import com.example.expensemanagement.bottomnavigation.ScreenRoutes
import com.example.expensemanagement.ui.theme.HomeScreen

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomNavigationView(navController = navController) }
    ) {
        NavHost(
            navController = navController,
            startDestination = ScreenRoutes.HomeScreen.route
        ) {
            composable(ScreenRoutes.HomeScreen.route) {
                HomeScreen()
            }
            composable(ScreenRoutes.CostScreen.route) {
                CostScreen()
            }
            composable(ScreenRoutes.SalaryScreen.route) {
                SalaryScreen()
            }
        }
    }
}