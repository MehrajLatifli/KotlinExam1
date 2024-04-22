import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter first: ")
    val first = scanner.nextInt()
    print("Enter last: ")
    val last = scanner.nextInt()

    val primes = ArrayList<Int>()
    val complexes = ArrayList<Int>()

    for (num in first..last) {
        if (isPrime(num)) {
            primes.add(num)
        } else if (isComposite(num)) {
            complexes.add(num)
        }
    }

    println("Prime numbers between $first and $last: $primes")
    println("Composite numbers between $first and $last: $complexes")
}

fun isPrime(number: Int): Boolean {
    if (number <= 1) return false
    for (i in 2..(number / 2)) {
        if (number % i == 0) return false
    }
    return true
}

fun isComposite(number: Int): Boolean {
    if (number <= 1) return false
    for (i in 2..(number / 2)) {
        if (number % i == 0) return true
    }
    return false
}