package oop_00000114913_AndrewImanuelHermawan.week02

import java.util.Scanner
import kotlin.random.Random

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UIN ---")

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()

    scanner.nextLine()

    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
    } else {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()

        val s1 = Student(name, nim, major)
        println("Status: Pendaftaran Selesai.")
    }
    print("Pilih Jalur (1. Reguler, 2. Umum): ")
    val type = scanner.nextInt()
    scanner.nextLine()

    if (type == 1) {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()

        val s1 = Student(name, nim, major)
        println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")

    } else if (type == 2) {

        val s2 = Student(name, nim)
        println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")

    } else {
        println("Pilihan ngawur, pendaftaran batal!")
    }

    print("Masukkan Judul Buku: ")
    val title = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan Lama Pinjam (hari): ")
    var duration = scanner.nextInt()

    if (duration < 0) {
        println("Durasi minus, otomatis diubah menjadi 1 hari.")
        duration = 1
    }

    val loan = Loan(title, borrower, duration)

    println("Total Denda: Rp ${loan.calculateFine()}")


    print("Masukkan Nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan Base Damage Hero: ")
    val baseDamage = scanner.nextInt()
    scanner.nextLine()

    val hero = Hero(heroName, baseDamage)

    var enemyHp = 100

    while (hero.isAlive() && enemyHp > 0) {

        println("\n=== TURN ===")
        println("HP Hero: ${hero.hp}")
        println("HP Musuh: $enemyHp")
        println("1. Serang")
        println("2. Kabur")
        print("Pilih aksi: ")

        val choice = scanner.nextInt()

        if (choice == 1) {

            hero.attack("Enemy")
            enemyHp -= hero.baseDamage
            if (enemyHp < 0) enemyHp = 0

            println("Sisa HP Musuh: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = Random.nextInt(10, 21)
                println("Musuh membalas sebesar $enemyDamage damage!")
                hero.takeDamage(enemyDamage)
                println("Sisa HP Hero: ${hero.hp}")
            }

        } else if (choice == 2) {
            println("Hero kabur dari pertarungan!")
            break
        }
    }

    println("\n=== HASIL PERTARUNGAN ===")
    if (hero.hp > enemyHp) {
        println("Hero Menang!")
    } else if (enemyHp > hero.hp) {
        println("Musuh Menang!")
    } else {
        println("Seri!")
    }

}
