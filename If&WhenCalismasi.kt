package com.mehmetagcakaya.kotlindersi1.standart_programlama

fun main() {
    val yas=18
    println(yas >=18)
    if (yas >=18){                     //true durumunda calısma
        println("Resitsiniz")
    }else{
        println("Resit degilsiniz")
    }
    val ka="adminx"
    val s=123456
    val sayi=10
    if (ka=="admin" && s==123456){  //&& true true da true oluyor harici false
        println("Hosgeldiniz")
    }else{
        println("Hatali giris")

    }
    if (sayi==9 || sayi==10){ //   ||veya    false false durumunda false harici true
        println("sayi 9 veya 10 dur ")
    }else{
        println("sayi 9 veya 10 degildir")
    }

    val number = 2
    when(number){
        1-> println("Sayi 1 dir")
        2-> println("Sayi 2 dir")
        else -> println("Tanimlanamayan sayi")

    }
}