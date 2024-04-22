package Task6

class Airplain(var motorquantity:Int):IMotorsvehicle {

    override fun spedUp() {

        println("Airplain spedUp")
    }

    override fun stop() {
        println("Airplain stop")
    }

    fun motorQuantity()
    {
        println("Airplain engine quantity is ${motorquantity}")
    }
}