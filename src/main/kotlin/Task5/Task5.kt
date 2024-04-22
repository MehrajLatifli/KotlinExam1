package Task5

fun main() {
    val array = arrayListOf<Int>(1, 2, 3, 2, 5, 2, 44)

    print("\nArray elements: ")
    for ((index, item) in array.withIndex()) {
        print(item.toString()+" ")
    }

    print("\nRepeated numbers and their counts: ")
    val countMap = hashMapOf<Int, Int>()
    for (item in array) {
        countMap[item] = countMap.getOrDefault(item, 0) + 1
    }

    for ((number, count) in countMap) {
        if (count > 1) {
            print("$number - $count times")
        }
    }

    val printedSet = hashSetOf<Int>()
    print("\nArray elements without repeats: ")
    for ((index, item) in array.withIndex()) {
        if (printedSet.add(item)) {
            print(item.toString() + " ")
        }
    }
}
