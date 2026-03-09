package oop_00000114913_AndrewImanuelHermawan.week06

import oop_00000114913_AndrewImanuelHermawan.week05.PaymentMethod

class Button (override val name: String) : Clickable {
    override fun click() {
        println("Tombol '$name' berhasil diklik!")
    }
}