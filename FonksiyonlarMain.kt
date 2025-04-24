package com.mehmetagcakaya.kotlindersi1.nesne_tabanli_programlama

fun main() {
    val f=Fonksiyonlar()
    //void= Unit
    f.selamla()
    //return = Veri olarak String gösteriyor çekerken
    val gelensonuc=f.selamla2()
    println("Gelen sonuc:$gelensonuc")

    //parametre
    f.selamla3("Zeynep")
    f.topla(10,20,"Beyza")
}