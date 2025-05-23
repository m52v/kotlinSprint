package org.example.lesson_2

fun main() {

    val student1 = 3
    val student2 = 4
    val student3 = 3
    val student4 = 5

    val studentCount = 4
    val totalScore = student1 + student2 + student3 + student4
    val average = totalScore / studentCount.toDouble()
    println("%.2f".format(average))
}