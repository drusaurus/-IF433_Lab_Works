package oop_00000114913_AndrewImanuelHermawan.week04

open class car(brand: String, val numberOfDoors: Int, model: String) : Vehicle(brand) {

    fun openTrunk() {
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")
    }
}