package org.example.lesson_3

fun main() {

    var from = "E2"
    var to = "E4"
    var moveNumber = 1
    val firstMove = "Ход из $from в $to; номер хода - $moveNumber"
    println(firstMove)

    from = "D2"
    to = "D3"
    moveNumber = 3
    val secondMove = "Ход из $from в $to; номер хода - $moveNumber"
    println(secondMove)
}