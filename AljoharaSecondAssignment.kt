package com.example.myapplication

fun main() {

    for (i in 0..100) {
        println(i)
        if (i == 71) {
            println("IT'S OVER 70!!!")
            break
        }
        }

    var temp= 35
    while (temp>=10){
       when (temp){

           30 -> println("IT'S HOT")
           20 -> println("it's comfy ")
           15 -> println("IT'S COLD ")
           else -> println("$temp")
       }
       temp--
    }

    }









