package com.hssoft.equipmentaccounting.ui.rent

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController

/**
 * Should show list of free equipment and basket in toolbar
 */


@Composable
fun RentScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "RentScreen")
                },
                navigationIcon = {
                    IconButton(
                        onClick = {
                            navController.popBackStack()
                        }
                    ) {
                        Icon(Icons.Filled.ArrowBack, contentDescription = "")
                    }
                })
        },
        backgroundColor = MaterialTheme.colors.background,
        content = {
            Text(text = "Rent screen content")
        }
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Rent Screen")
                },
                navigationIcon = {
                    IconButton(
                        onClick = {

                        }
                    ) {
                        Icon(Icons.Filled.ArrowBack, contentDescription = "")
                    }
                })
        },
        backgroundColor = MaterialTheme.colors.background,
        content = {
            Text(text = "RentScreenContent")
        }
    )
}