package com.hssoft.equipmentaccounting.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.hssoft.equipmentaccounting.ui.home.HomeScreen
import com.hssoft.equipmentaccounting.ui.theme.EquipmentAccountingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EquipmentAccountingTheme {
                HomeScreen()
            }
        }
    }
}