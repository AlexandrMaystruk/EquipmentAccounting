package com.hssoft.equipmentaccounting.model.repositories

import com.hssoft.equipmentaccounting.model.entities.Equipment

interface Repository {

    suspend fun getEquipmentList(): List<Equipment>

}