package com.hssoft.equipmentaccounting.ui.all_equipments

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.hssoft.equipmentaccounting.ui.theme.EquipmentAccountingTheme

/**
 * Should show list of rental point
 */


@Composable
fun HomeScreen() {
    Surface(color = MaterialTheme.colors.background) {
        Greeting("Android")
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    EquipmentAccountingTheme {
        Greeting("Android")
    }
}