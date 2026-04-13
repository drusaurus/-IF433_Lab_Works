package oop_00000114913_AndrewImanuelHermawan.week8

fun main() {
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota Tidak Diketahui"

    println("Tujuan pengiriman: $destination")
}