package org.example.lesson_1

const val TIME_UNIT = 60

fun main() {
    val totalSeconds = 6480

    val hours = totalSeconds / (TIME_UNIT * TIME_UNIT)
    val secondsAfterHours = totalSeconds % (TIME_UNIT * TIME_UNIT)

    val minutes = secondsAfterHours / TIME_UNIT

    val seconds = secondsAfterHours % TIME_UNIT
    println("%02d:%02d:%02d".format(hours, minutes, seconds))
}