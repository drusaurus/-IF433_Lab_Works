package oop_00000114913_AndrewImanuelHermawan.week04

class ElectricCar(
    brand: String,
    numberOfDoors: Int,
    val batteryCapacity: Int
) : Car(brand, numberOfDoors) {

    final override fun accelerate() {
        println("Shrrrnd")
        println("Kapasitas baterai: $batteryCapacity kWh")
        super.accelerate()
    }
}