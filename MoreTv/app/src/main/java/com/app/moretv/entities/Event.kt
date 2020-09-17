package com.app.moretv.entities

import com.app.moretv.interfaces.Displayable
import com.app.moretv.utils.DateHelper
import java.util.*

class Event (
    var startTime: Date? = null,
    var endTime: Date? = null,
    var name: String? = null
) : Displayable {
    override fun getDisplayName(): String {
        return "Event"
    }

    override fun getDetails(): String {
        return "$name\n${DateHelper.formatDate(startTime)} - ${DateHelper.formatDate(endTime)}"
    }

}
