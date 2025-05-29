package org.example.lesson_3

fun main() {

    var from = "E2"
    var to = "E4"
    var moveNumber = 1
    val firstMove = "[$from-$to;$moveNumber]"
    println(firstMove)

    from = "D2"
    to = "D3"
    moveNumber = 3
    val secondMove = "[$from-$to;$moveNumber]"
    println(secondMove)
}