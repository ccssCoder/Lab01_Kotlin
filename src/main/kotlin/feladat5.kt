
fun evenNumber(x: Int) : Boolean = (x%2 == 0)

fun main() {
    val numbers : List<Int> = listOf(1, 2, 3, 4, 5, 6)

    println( numbers.filter { evenNumber(it) } )
}