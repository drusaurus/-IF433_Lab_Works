package oop_00000114913_AndrewImanuelHermawan.week05

class CreditCard(
    accountName: String,
    val limit: Double
) : PaymentMethod(accountName) {

    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("Transaksi berhasil menggunakan Credit Card. Total terpakai: $usedAmount")
        } else {
            println("Transaksi ditolak, melebihi limit kartu.")
        }
    }
}