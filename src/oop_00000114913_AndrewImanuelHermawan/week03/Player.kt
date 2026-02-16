package oop_00000114913_AndrewImanuelHermawan.week03

class Player(val username: String) {

    private var xp: Int = 0

    val level: Int
        get() = (xp / 100) + 1

    fun addXP(amount: Int) {
        if (amount <= 0) {
            println("XP yang ditambahkan harus lebih dari 0!")
            return
        }

        val oldLevel = level
        xp += amount
        val newLevel = level

        if (newLevel > oldLevel) {
            println("Level Up! Selamat $username naik ke level $newLevel!")
        }
    }
}
