package com.podium.papermenu.model

data class Order(
    val table:String="Table one",
    val name:String = "",
    val qty: Int = 1,
    val price: String = "100.0",
    val category: String = "",
    val img: String = "",
    val delivered:Boolean = false,
    val payed:Boolean = false,
)
