package oop_00000114913_AndrewImanuelHermawan.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generateVehicle = Vehicle( brand = "Sepeda Onthel")
    generateVehicle.honk()
    generateVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car( brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing Electric Car ---")
    val myElectricCar = ElectricCar(brand = "Tesla", numberOfDoors = 4, batteryCapacity = 75)
    myElectricCar.honk()
    myElectricCar.accelerate()
    myElectricCar.openTrunk()
}