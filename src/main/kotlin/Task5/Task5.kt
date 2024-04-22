package Task5

fun main() {

    var array = hashSetOf<Int>(1,2,3,2,5)

    for((index,item) in array.withIndex()){

            println(item)
    }
}