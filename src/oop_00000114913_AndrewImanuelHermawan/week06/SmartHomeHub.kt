package oop_00000114913_AndrewImanuelHermawan.week06

class SmartHomeHub {

    private val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
    }

    fun turnOffAllSwitches() {

        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            }
        }

    }

}