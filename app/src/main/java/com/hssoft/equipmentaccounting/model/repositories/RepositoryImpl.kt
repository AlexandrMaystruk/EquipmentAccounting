package com.hssoft.equipmentaccounting.model.repositories

import com.hssoft.equipmentaccounting.model.entities.Equipment
import com.hssoft.equipmentaccounting.model.repositories.DefaultData.equipments

class RepositoryImpl : Repository {

    override suspend fun getEquipmentList(): List<Equipment> {
        return equipments
    }

}


object DefaultData {

    val equipments = listOf(
        Equipment("Жумар"),
        Equipment("Палатка"),
        Equipment("Спальник")
    )
}