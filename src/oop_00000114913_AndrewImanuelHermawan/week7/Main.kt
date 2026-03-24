package oop_00000114913_AndrewImanuelHermawan.week7

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectiomStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()
}