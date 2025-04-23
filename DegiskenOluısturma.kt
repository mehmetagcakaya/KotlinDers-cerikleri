package com.mehmetagcakaya.kotlindersi1.degiskenler

fun main() {
    var id = 1
    var ad = "Mont"
    var resim = "mont.png"
    var puan=4.7
    var fiyat=4500
    var stokDurum=true
    println("Id : $id ")
    println("Ad: $ad")
    println("Resim : $resim ")
    println("Puan: $puan")
    println("Fiyat : $fiyat ")
    println("Stok: $stokDurum")

    //Sabitler - Constants
    var sayi=30
    sayi=100
    println(sayi)

    val numara=50
    println(numara)

    //Tür dönüşümü - Type casting
    //1. SAYISALDAN SAYISALA DÖNÜŞÜM
    val d =89.56
    val i =34
    val sonuc1=d.toInt()
    val sonuc2=i.toDouble()
    println(sonuc1)
    println(sonuc2)

    //2.SAYISALDAN METİNE DÖNÜŞÜM
    var x = 85
    val sonuc3 = x.toString() // "85" e döndürdü
    println(sonuc3)

    //3. METİNDEN SAYISALA DÖNÜŞÜM
    val yazi="48T"
    val sonuc4=yazi.toIntOrNull()


    if(sonuc4!=null){
        println(sonuc4)

    }else {
        println("SONUC NULLDUR")
    }


}