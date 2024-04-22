package Task6

class Airplain(var motorsayı:Int):IMotorsvehicle {

    override fun sürətləndirmə() {

        println("Car sürətləndirmə")
    }

    override fun dayandırma() {
        println("Car dayandırma")
    }

    fun motorsayı()
    {
        println("Car motorsayı ${motorsayı}")
    }
}