package org.example.lesson_1

const val SECONDS_IN_MINUTE = 60
const val MINUTES_IN_HOUR = 60
fun main() {
    val totalSeconds = 6480

    val hours = totalSeconds / (SECONDS_IN_MINUTE * MINUTES_IN_HOUR)
    val secondsAfterHours = totalSeconds - (hours * SECONDS_IN_MINUTE * MINUTES_IN_HOUR)

    val minutes = secondsAfterHours / SECONDS_IN_MINUTE
    val secondsAfterMinutes = secondsAfterHours - (minutes * SECONDS_IN_MINUTE)

    val seconds = secondsAfterMinutes

    val result = String.format("%02d:%02d:%02d", hours, minutes, seconds)
    println(result)
}