package org.example.lesson_2

const val MINUTES_IN_HOUR = 60
const val HOURS_IN_DAY = 24

fun main() {
    val startHour = 9
    val startMinute = 39
    val travelTimeMinutes = 457

    val departureInMinutes = startHour * MINUTES_IN_HOUR + startMinute
    val arrivalInMinutes = departureInMinutes + travelTimeMinutes
    val arrivalHour = (arrivalInMinutes / MINUTES_IN_HOUR) % HOURS_IN_DAY
    val arrivalMinute = arrivalInMinutes % MINUTES_IN_HOUR

    println("Время прибытия поезда: %02d:%02d".format(arrivalHour, arrivalMinute))
}