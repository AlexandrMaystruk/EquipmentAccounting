package com.hssoft.equipmentaccounting.model.repositories

import com.hssoft.equipmentaccounting.model.entities.Equipment
import com.hssoft.equipmentaccounting.model.entities.EquipmentState
import com.hssoft.equipmentaccounting.model.repositories.DefaultData.equipments
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
        Equipment("Спальник", EquipmentState.Free)
    )
}