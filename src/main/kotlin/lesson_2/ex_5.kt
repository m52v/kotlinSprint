package org.example.lesson_2

fun main() {
    val deposit = 70000.0
    val annualRate = 16.7
    val years = 20

    val amount = deposit * Math.pow(1 + annualRate / 100, years.toDouble())
    println("Размер вклада через $years лет: %.3f".format(amount))
}