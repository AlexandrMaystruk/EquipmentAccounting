package com.hssoft.equipmentaccounting.domain.repositories

import com.hssoft.equipmentaccounting.domain.entities.Equipment

interface Repository {

    suspend fun getEquipmentList(): List<Equipment>

}