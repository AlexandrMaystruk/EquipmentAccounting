package com.hssoft.equipmentaccounting.ui.home

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.hssoft.equipmentaccounting.domain.entities.Equipment

/**
 * Should show list of rental point
 */
@Composable
@ExperimentalMaterialApi
fun HomeScreen(viewModel: HomeScreenViewModel, navController: NavHostController) {
    Scaffold(
        topBar = { HomeScreenTopBar() },
        backgroundColor = MaterialTheme.colors.background,
        content = { Content(viewModel, navController) }
    )
}


@Preview(showBackground = true)
@Composable
fun HomeScreenTopBar() {

    val result = remember { mutableStateOf("") }
    val expanded = remember { mutableStateOf(false) }
    val liked = remember { mutableStateOf(true) }

    TopAppBar(
        title = {
            Text(text = "Home Screen")
        },
        actions = {
            IconToggleButton(
                checked = liked.value,
                onCheckedChange = {
                    liked.value = it
                    if (liked.value) {
                        result.value = "Liked"
                    } else {
                        result.value = "Unliked"
                    }
                }
            ) {
                val tint by animateColorAsState(
                    if (liked.value) Color(0xFF7BB661)
                    else Color.LightGray
                )
                Icon(
                    Icons.Filled.Favorite,
                    contentDescription = "Localized description",
                    tint = tint
                )
            }

            Box(
                Modifier.wrapContentSize(Alignment.TopEnd)
            ) {
                IconButton(onClick = {
                    expanded.value = true
                    result.value = "More icon clicked"
                }) {
                    Icon(
                        Icons.Filled.MoreVert,
                        contentDescription = "Localized description"
                    )
                }

                DropdownMenu(
                    expanded = expanded.value,
                    onDismissRequest = { expanded.value = false },
                ) {
                    DropdownMenuItem(onClick = {
                        expanded.value = false
                        result.value = "First item clicked"
                    }) {
                        Text("First Item")
                    }

                    DropdownMenuItem(onClick = {
                        expanded.value = false
                        result.value = "Second item clicked"
                    }) {
                        Text("Second item")
                    }
                }
            }
        },
        elevation = AppBarDefaults.TopAppBarElevation
    )
}

@Composable
@ExperimentalMaterialApi
fun Content(viewModel: HomeScreenViewModel, navController: NavHostController) {
    val state = viewModel.equipmentList.collectAsState()
    LazyColumn(modifier = Modifier.fillMaxHeight()) {
        items(
            items = state.value,
            itemContent = { equipment ->
                EquipmentCard(equipment = equipment, navController)
            })
    }
}


@Composable
@ExperimentalMaterialApi
fun EquipmentCard(equipment: Equipment, navController: NavHostController) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 10.dp, top = 10.dp, end = 10.dp, bottom = 0.dp)
            .clickable { },
        elevation = 10.dp,
        onClick = { navController.navigate("rent") }
    ) {
        Row(
            modifier = Modifier.padding(15.dp)
        ) {
            Column(modifier = Modifier.weight(1f), horizontalAlignment = Alignment.Start) {
                Text(equipment.name)
            }
            Column(modifier = Modifier.weight(1f), horizontalAlignment = Alignment.End) {
                Text(
                    text = buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                fontWeight = FontWeight.W900,
                                color = Color(0xFF4552B8)
                            )
                        ) {
                            append(equipment.equipmentState.javaClass.simpleName)
                        }
                    })
            }
        }
    }
}