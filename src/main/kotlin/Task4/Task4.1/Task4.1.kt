package Task4.Task4.`1`

import java.util.*


fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter first: ")
    val first = scanner.nextInt()
    print("Enter second: ")
    val second = scanner.nextInt()

    var GreatestCommonDivisor = 1

    for (i in 1..kotlin.math.min(first, second)) {
        if (first % i == 0 && second % i == 0) {
            GreatestCommonDivisor = i
        }
    }

    println("Greatest Common Divisor: ${GreatestCommonDivisor}")


    var  LeastCommonMultiple = 1

    for (i in kotlin.math.max(first, second)..first * second) {
        if (i % first == 0 && i % second == 0) {
            LeastCommonMultiple = i
            break
        }
    }

    println("Least Common Multiple: ${LeastCommonMultiple}")



}