fun main() {
    val daysOfWeek = listOf<String>("Monday","Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");

    println(">> Use a for loop that iterates over the list and prints the list to the standard output")
    for (e in daysOfWeek)
        println(e)

    println(">> Use a list filter to print the days starting with letter ‘T’")
    daysOfWeek
        .filter { it.startsWith("T") }
        .forEach { println(it) }

    println(">> Use a list filter to print the days containing the letter ‘e’")
    daysOfWeek
        .filter { it.contains("e")}
        .forEach { println(it) }

    println(">> Use a list filter to print all the days of length 6 (e.g. Friday)")
    daysOfWeek
        .filter { it.length == 6}
        .forEach { println(it) }
}