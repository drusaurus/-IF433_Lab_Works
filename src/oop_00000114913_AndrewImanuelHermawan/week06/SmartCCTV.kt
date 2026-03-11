package oop_00000114913_AndrewImanuelHermawan.week06

class SmartCCTV(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable {

    override fun turnOn() {
        println("CCTV $name dinyalakan.")
    }

    override fun turnOff() {
        println("CCTV $name dimatikan.")
    }

    override fun startRecord() {
        println("CCTV $name mulai merekam.")
    }

}