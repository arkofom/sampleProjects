package com.app.moretv.utils

import java.text.SimpleDateFormat
import java.util.*

object DateHelper {
    private val formatter = SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault())
    fun formatDate(date: Date?): String? {
        var result: String? = null
        date?.let {
            result = formatter.format(date)
        }
        return result
    }
}