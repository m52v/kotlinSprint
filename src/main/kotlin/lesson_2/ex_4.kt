package org.example.lesson_2

fun main() {
    val buffPercent = 20
    val minedCrystal = 7
    val minedIron = 11

    val bonusCrystal = (minedCrystal * buffPercent / 100.0).toInt()
    val bonusIron = (minedIron * buffPercent / 100.0).toInt()

    println("Кристаллическая руда бонус: +$bonusCrystal")
    println("Железная руда бонус: +$bonusIron")
}