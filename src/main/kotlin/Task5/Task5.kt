package Task5

fun main() {
    val array = arrayListOf<Int>(1, 4, 4, 2, 5, 2, 4,18,29)

    print("\nArray elements: ")
    for ((index, item) in array.withIndex()) {
        print(item.toString()+" ")
    }

    print("\n\nRepeated numbers and their counts: ")
    val countMap = HashMap<Int, Int>()
    for (item in array) {
        countMap[item] = countMap.getOrDefault(item, 0) + 1
    }

    for ((number, count) in countMap) {
        if (count > 1) {
            print("\n $number -> $count times ")

        }
    }

    val printedSet = HashSet<Int>()
    print("\n\nArray elements without repeats: ")
    for ((index, item) in array.withIndex()) {
        if (printedSet.add(item)) {
            print(item.toString() + " ")
        }
    }
}
