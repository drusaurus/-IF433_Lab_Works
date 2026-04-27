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

    val txRepo = WalletRepository<Transaction>()

    txRepo.add(Transaction("TX001", 150.0))
    txRepo.add(Transaction("TX002", 300.0))

    println("\nDaftar Transaksi:")
    txRepo.getAll().forEach {
        println("- ${it.id}: ${it.amount}")
    }
}