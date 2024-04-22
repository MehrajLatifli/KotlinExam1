package Task2

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    print("Enter text: ")
    val text = scanner.next()

    val charCounts = ArrayList<String>()

    for (char in text) {
        if (char.isLetter()) {
            val count = text.count { it == char }
            val charInfo = "$char -> $count time"
            if (count > 1 && !charCounts.contains(charInfo)) {
                charCounts.add(charInfo)
            }
        }
    }

    println("Repeated characters and their repetition counts:")
    charCounts.forEach { println(it) }

}
