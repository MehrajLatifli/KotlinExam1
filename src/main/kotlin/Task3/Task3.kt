package Task3

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print("Enter the radius: ")
    val radius = scanner.nextDouble()

    val circle = Circle(radius)

    println("Perimeter: " + circle.perimeter())
    println("Area: " + circle.area())
}
