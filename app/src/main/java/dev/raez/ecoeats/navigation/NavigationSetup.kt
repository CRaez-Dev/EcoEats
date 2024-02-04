package dev.raez.ecoeats.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.raez.ecoeats.presentation.login.LoginScreen
import dev.raez.ecoeats.presentation.on_boarding.OnBoardingScreen
import dev.raez.ecoeats.presentation.welcome.WelcomeScreen

@Composable
fun NavigationSetup(){
    val navController :NavHostController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.Welcome.route
    ){
        composable(route = Screen.Welcome.route){
            WelcomeScreen()
        }

        composable(route = Screen.OnBoarding.route){
            OnBoardingScreen()
        }
        composable(route = Screen.Login.route){
            LoginScreen()
        }
    }
}