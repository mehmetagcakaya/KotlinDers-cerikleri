package com.mehmetagcakaya.kotlindersi1.nesne_tabanli_programlama

fun main() {
    //Nesne oluşturma
    val y1=Yemekler(100,"Kofte",249)
    //Deger okuma
    y1.bilgiAl()
    //Deger atama veya deger degistirme
    y1.fiyat=350
    y1.bilgiAl()
    val y2=Yemekler(200,"Baklava",300)
    y2.bilgiAl()
    y2.ad="Soguk Baklava"
    y2.bilgiAl()
}