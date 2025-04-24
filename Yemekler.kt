package com.mehmetagcakaya.kotlindersi1.nesne_tabanli_programlama

data class Yemekler(var id:Int,var ad:String,var fiyat:Int) {
    //Constructor - init fonksiyonu
    //Bu sınıftan nesne oluştugunda çalışsın.
    init {
        println("******Nesne olustu*******")
    }
    fun bilgiAl(){
        println("**************************")
        println("Id:${id}")
        println("Ad:${ad}")
        println("Fiyat:${fiyat}")
    }
//this : Bulunduğu sınıfı temsil eder.
//super: kalıtım ile bir üst sınıfı temsil eder.
}