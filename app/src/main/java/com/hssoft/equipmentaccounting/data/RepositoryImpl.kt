package com.hssoft.equipmentaccounting.data

import com.hssoft.equipmentaccounting.domain.entities.Equipment
import com.hssoft.equipmentaccounting.domain.entities.EquipmentState
import com.hssoft.equipmentaccounting.domain.repositories.Repository
import com.hssoft.equipmentaccounting.data.DefaultData.equipments
import javax.inject.Inject

class RepositoryImpl @Inject constructor() : Repository {

    override suspend fun getEquipmentList(): List<Equipment> {
        return equipments
    }

}

object DefaultData {
    val equipments = listOf(
        Equipment("Жумар", EquipmentState.Free),
        Equipment("Палатка", EquipmentState.Free),
        Equipment("Спальник", EquipmentState.Free),
        Equipment("Жумар", EquipmentState.Free),
        Equipment("Палатка", EquipmentState.Free),
        Equipment("Жумар", EquipmentState.Free),
        Equipment("Палатка", EquipmentState.Free),
        Equipment("Жумар", EquipmentState.Free),
        Equipment("Палатка", EquipmentState.Free),
        Equipment("Жумар", EquipmentState.Free),
        Equipment("Палатка", EquipmentState.Free),
        Equipment("Жумар", EquipmentState.Free),
        Equipment("Палатка", EquipmentState.Free),
        Equipment("Жумар", EquipmentState.Free),
        Equipment("Палатка", EquipmentState.Free),
        Equipment("Жумар", EquipmentState.Free),
        Equipment("Палатка", EquipmentState.Free),
        Equipment("Жумар", EquipmentState.Free),
        Equipment("Палатка", EquipmentState.Free),
    )
}