package oop_00000114913_AndrewImanuelHermawan.week07

object DatabaseManager {
    var connectiomStatus: String = "Disconnected"

    fun connect() {
        connectiomStatus = "Connected to Server"
        println("Database is ready.")
    }
}