package com.example.myapplication

fun main() {
    //assignment 3 question 1
    var jeje = arrayListOf<Double>()
    jeje.add(13.5)
    jeje.add(12.5)
    jeje.add(32.67)
    jeje.add(15.5)
    jeje.add(45.5)

    var sum = 0.0
    var avg = 0.0
    for (i in 0 until jeje.size) {
        sum += jeje[i]
        avg = sum / jeje.size
    }
    println(avg)
    math(1.1, 2.1, "*")

// assignement 3 question2
    fun math(d1: Double, d2: Double, operands: String = "+") {
        when (operands) {
            "+" -> println(d1 + d2)
            "-" -> println(d1 - d2)
            "*" -> println(d1 * d2)
            "/" -> println(d1 / d2)
            else -> println("unacceptable input")
        }
    }
}