package oop_00000114913_AndrewImanuelHermawan.week08

class City(val name: String)
class Address(val city: City)
class DeliveryDetails(val address: Address)
class Order(val deliveryDetails: DeliveryDetails?, val totalPrice: Int?)