package com.example.expensemanagement.bottomnavigation

sealed class ScreenRoutes(val route : String){
    object HomeScreen : ScreenRoutes("home_screen")
    object CostScreen : ScreenRoutes("cost_screen")
    object SalaryScreen : ScreenRoutes("salary_screen")
}
