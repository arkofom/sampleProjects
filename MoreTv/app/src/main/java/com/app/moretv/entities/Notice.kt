package com.app.moretv.entities

import com.app.moretv.utils.DateHelper
import com.app.moretv.interfaces.Displayable
import java.util.*

data class Notice(
    val flightDate: Date? = null,
    val gate: String? = null
) : Displayable {
    override fun getDisplayName(): String {
        return "Notice"
    }

    override fun getDetails(): String {
        return "flight date: ${DateHelper.formatDate(flightDate) ?: ""}\ngate: ${gate ?: ""}"
    }

}
