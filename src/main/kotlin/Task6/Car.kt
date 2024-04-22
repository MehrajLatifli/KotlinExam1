package Task6

class Car(var seatquantity:Int):IMotorsvehicle {
    override fun spedUp() {

        println("Car spedUp")
    }

    override fun stop() {
        println("Car stop")
    }

    fun seatQuantity()
    {
        println("Car seat quantity is ${seatquantity}")
    }
}