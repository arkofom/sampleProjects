package com.app.moretv.interfaces
import java.io.Serializable

interface Displayable : Serializable {
    fun getDisplayName(): String
    fun getDetails(): String
}