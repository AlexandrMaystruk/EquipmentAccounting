package com.hssoft.equipmentaccounting.domain.entities

import java.util.*

sealed class EquipmentState {
    object Free : EquipmentState()
    class RentByUser(
        val user: User,
        val dateFrom: Date,
        val dateTo: Date
    ) : EquipmentState()
}