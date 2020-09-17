package com.app.moretv.entities

import com.app.moretv.interfaces.Displayable

class Move (
    var fromPlace: String? = null,
    var toPlace: String? = null,
    var estimateTime: Double? = null
) : Displayable {

    override fun getDisplayName(): String {
       return "Move"
    }

    override fun getDetails(): String {
        return "From $fromPlace to $toPlace,\nest. Time: ${estimateTime?.format(2)}"
    }
    private fun Double.format(digits: Int) = "%.${digits}f".format(this)
}