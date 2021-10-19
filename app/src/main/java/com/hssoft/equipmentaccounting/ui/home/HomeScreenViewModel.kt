package com.hssoft.equipmentaccounting.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hssoft.equipmentaccounting.model.entities.Equipment
import com.hssoft.equipmentaccounting.model.repositories.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

@HiltViewModel
class HomeScreenViewModel @Inject constructor(
    private val repository: Repository
) : ViewModel() {

    val equipmentList: StateFlow<List<Equipment>> = flow {
        val equipments = repository.getEquipmentList()
        emit(equipments)
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(), emptyList())

}