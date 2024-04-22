package Task4.Task4.`2`

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter first: ")
    val first = scanner.nextInt()
    print("Enter second: ")
    val second = scanner.nextInt()

    println("Greatest Common Divisor: " + GreatestCommonDivisor(first, second));
    println("Least Common Multiple: " + LeastCommonMultiple(first, second));



}

fun  GreatestCommonDivisor( a:Int,  b:Int) :Int {
    if (a % b == 0) return b
    return GreatestCommonDivisor(b, a%b)
}

fun  LeastCommonMultiple( a:Int,  b:Int):Int {
    return a*b / GreatestCommonDivisor(a, b)
}