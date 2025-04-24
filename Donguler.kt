package com.mehmetagcakaya.kotlindersi1.standart_programlama

fun main() {
    for (i in 1..3){
        println("Dongui:$i")
    }
    for (x in 10..20 step 5){
        println("Dongu2:$x")
    }
    for (x in 20 downTo 10 step 5){  //downTo geriye doğru
        println("Dongu3:$x")
    }
    var sayac=1
    while (sayac<4){
        println("Dongu4:$sayac")
        sayac+=1    //sayac=sayac+1
    }
    for (i in 1..5){
        if (i==3){
            break //döngüyü durdurur
        }
        println("Dongu5:$i")

    }
    for (i in 1..5){
        if (i==3){
            continue //bulundugu adımı pas gecer
        }
        println("Dongu6:$i")

    }
}