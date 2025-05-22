package org.example.lesson_2

fun main () {

    val totalEmployees = 50
    val salaryOfOneEmployee = 30_000
    val expensesForEmployees = totalEmployees * salaryOfOneEmployee
    println("Расходы на выплату ЗП постоянных сотрудников: $expensesForEmployees₽")

    val totalInterns = 30
    val salaryOfOneIntern = 20_000

    val totalSalaryCoast = expensesForEmployees + totalInterns * salaryOfOneIntern
    println("Общие расходы по ЗП (включая стажёров): $totalSalaryCoast₽")

    val averageSalary = totalSalaryCoast / (totalEmployees + totalInterns)
    println("Средняя ЗП на человека в компании: $averageSalary₽")

}