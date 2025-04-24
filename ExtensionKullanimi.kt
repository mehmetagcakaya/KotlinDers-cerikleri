package com.mehmetagcakaya.kotlindersi1.nesne_tabanli_programlama

fun main() {
    val sonuc = 5 carp 2 //bu infixli    //5.carp(2)   bu infixsiz
    println(sonuc)

}

infix fun Int.carp(sayi:Int):Int{
    return this*sayi // this(Int)
}