package oop_00000114913_AndrewImanuelHermawan.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 2.0))
    coinRepo.add(Coin("USDT", 1000.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())
    println("Status: ${response.status}")
    println("Daftar Coin:")
    response.data.forEach {
        println("- ${it.name}: ${it.balance}")
    }
}