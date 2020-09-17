package com.app.moretv.utils

import com.app.moretv.entities.Event
import com.app.moretv.entities.Move
import com.app.moretv.entities.Notice
import com.app.moretv.interfaces.Displayable
import java.util.*
import kotlin.math.abs
import kotlin.random.Random

object DataGenerator {
    private val cities = arrayOf(
        "New York, New York",
        "Los Angeles, California",
        "Chicago, Illinois",
        "Houston, Texas",
        "Phoenix, Arizona",
        "Philadelphia, Pennsylvania",
        "San Antonio, Texas",
        "San Diego, California",
        "Dallas, Texas",
        "San Jose"
    )
    private const val timeConst = 70L * 365 * 24 * 60 * 60 * 1000
    fun generateDummyData(): List<Displayable> {
        val res = arrayListOf<Displayable>()

        val capacity = Random.nextInt(9, 100)
        for (i in 0..capacity) {
            res.add(
                when (Random.nextInt() % 3) {
                    0 -> {
                        getEvent()
                    }
                    1 -> {
                        getMove()
                    }
                    2 -> {
                        getNotice()
                    }
                    else -> {
                        getEvent()
                    }
                }
            )
        }
        return res
    }

    private fun getEvent(): Event {
        return Event(
            startTime = Date(getRndMS()),
            endTime = Date(getRndMS()),
            name = "Event #${Random.nextInt(0, 100)}"

        )
    }

    private fun getMove(): Move {
        return Move(
            estimateTime = Random.nextDouble(),
            fromPlace = cities[Random.nextInt(0, 10)],
            toPlace = cities[Random.nextInt(0, 10)]
        )
    }

    private fun getNotice(): Notice {
        return Notice(
            flightDate = Date(getRndMS()),
            gate = "${Random.nextInt(1, 21)}"
        )
    }
    private fun getRndMS(): Long {
        //returning ms in range between 1940 and 2010
        return -946771200000L + (abs(Random.nextLong()) % timeConst)
    }
}