package oop_00000114913_AndrewImanuelHermawan.week03

fun main() {
    val e = Employee("Budi")

    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformanceRating()

    println("Pajak yang harus dibayar: ${e.tax}")

    val weapon = Weapon("Excalibur")

    weapon.damage = -50

    weapon.damage = 9999

    println("Nama Weapon: ${weapon.name}")
    println("Damage: ${weapon.damage}")
    println("Tier: ${weapon.tier}")
}