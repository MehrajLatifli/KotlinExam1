package Task6

class Car(var oturacaqsayi:Int):IMotorsvehicle {
    override fun sürətləndirmə() {

        println("Car sürətləndirmə")
    }

    override fun dayandırma() {
        println("Car dayandırma")
    }

    fun oturacaqsayı()
    {
        println("Car oturacaqsayı ${oturacaqsayi}")
    }
}