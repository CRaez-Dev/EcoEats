package dev.raez.ecoeats.navigation

sealed class Screen (val route:String) {

    object Welcome : Screen(route = "welcome_screen")
    object OnBoarding : Screen(route = "on_boarding_screen")
    object Login     : Screen(route = "login")

}