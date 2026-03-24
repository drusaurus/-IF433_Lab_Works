package oop_00000114913_AndrewImanuelHermawan.week7

class NetworkClient private constructor(val url: String) {
    fun connect() {
        println("Connecting to $url...")
    }
}