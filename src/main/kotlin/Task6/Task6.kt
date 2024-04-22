package Task6

fun main(args: Array<String>) {

    var car = Car(4)
    var airplain = Airplain(5)

    car.spedUp()
    car.stop()

    airplain.spedUp()
    airplain.stop()

    car.seatQuantity()
    airplain.motorQuantity()

}