package com.hssoft.equipmentaccounting.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material.Scaffold
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.hssoft.equipmentaccounting.ui.debtors.DebtorsScreen
import com.hssoft.equipmentaccounting.ui.home.HomeScreen
import com.hssoft.equipmentaccounting.ui.home.HomeScreenViewModel
import com.hssoft.equipmentaccounting.ui.rent.RentScreen
import com.hssoft.equipmentaccounting.ui.theme.EquipmentAccountingTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EquipmentAccountingTheme {
                Scaffold{
                    val navController = rememberNavController()
                    NavHost(navController, "home") {
                        composable("debtors") {
                            DebtorsScreen(navController)
                        }
                        composable("rent") {
                            RentScreen(navController)
                        }
                        composable("home") {
                            HomeScreen(hiltViewModel(), navController)
                        }
                    }
                }
            }
        }
    }
}