package oop_00000114913_AndrewImanuelHermawan.week05

fun main() {
    val dosen1 = Dosen( nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin( nama = "Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> {
                println("==> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("==> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("-----------------")
    }

        val mathHelper = MathHelper()

        val luasPersegi = mathHelper.hitungLuas(4)
        println("Luas Persegi: $luasPersegi")

        val luasPersegiPanjang = mathHelper.hitungLuas(5, 3)
        println("Luas Persegi Panjang: $luasPersegiPanjang")

        val luasLingkaran = mathHelper.hitungLuas(7.0)
        println("Luas Lingkaran: $luasLingkaran")

    val eWallet = EWallet("Andrew", 5000.0)
    val creditCard = CreditCard("Andrew", 10000.0)

    val paymentList: ArrayList<PaymentMethod> = arrayListOf()
    paymentList.add(eWallet)
    paymentList.add(creditCard)

    for (payment in paymentList) {
        println("Mencoba pembayaran 7500.0 menggunakan ${payment.accountName}")
        payment.processPayment(7500.0)

        if (payment is EWallet) {
            println("Melakukan top up 5000.0...")
            payment.topUp(5000.0)
            println("Mencoba pembayaran lagi 7500.0")
            payment.processPayment(7500.0)
        }
        println("---------------")
    }
}
