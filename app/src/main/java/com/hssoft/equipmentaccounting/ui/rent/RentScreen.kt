package com.hssoft.equipmentaccounting.ui.rent

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.hssoft.equipmentaccounting.ui.theme.EquipmentAccountingTheme

/**
 * Should show list of free equipment and basket in toolbar
 */


@Composable
fun RentScreen(navController: NavHostController) {
    Surface(
        color = MaterialTheme.colors.background,
        modifier = Modifier
            .fillMaxSize(),
    ) {



    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    EquipmentAccountingTheme {

    }
}