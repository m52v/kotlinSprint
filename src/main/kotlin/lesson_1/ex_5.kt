package org.example.lesson_1

fun main () {
    val totalSeconds = 6480

    val hours = totalSeconds / 3600
    val secondsAfterHours = totalSeconds - (hours * 3600)

    val minutes = secondsAfterHours / 60
    val secondsAfterMinutes = totalSeconds - (hours * 3600 + minutes * 60)

    val seconds = secondsAfterMinutes

    println("0$hours:$minutes:0$seconds")

}