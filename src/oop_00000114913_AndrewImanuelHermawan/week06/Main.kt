package oop_00000114913_AndrewImanuelHermawan.week06

fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai checkout...")
    method.pay(amount)
}

fun main() {
    val myWatch = Smartwatch()
    myWatch.showtime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = PaymentMethod.Gopay()
    val pay2 = PaymentMethod.CreditCard()

    println("\n=== TESTING CHECKOUT ===")
    processCheckout( method = pay1, amount = 50000.0)
    processCheckout( method = pay2, amount = 1500000.0)

    val lamp = SmartLamp("1", "Lampu Ruang Tamu")
    val speaker = SmartSpeaker("2", "Google Nest Dapur")
    val cctv = SmartCCTV("3", "Ezviz Garasi")
}