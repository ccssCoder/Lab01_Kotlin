fun main() {
    //Double the elements of a list of integers and print it.
    val numbers : List<Int> = listOf(1, 2, 3, 4, 5, 6)
    println( numbers.map { it*2 })

    //Print the days of week capitalized (e.g. MONDAY for Monday)
    val daysOfWeek = listOf<String>("monday","tuesday", "wednesday", "thursday", "friday", "saturday", "sunday");
    println( daysOfWeek.map { it.toUpperCase() })

    //Print the first character of each day capitalized (e.g. m for Monday)
    println(daysOfWeek.map { it.get(0).toUpperCase() + it.substring(1) })

    //Print the length of days (number of characters, e.g. Monday → 6)
    println(daysOfWeek.map { it.length })

    //Compute the average length of days (in number of characters)
    println(daysOfWeek
            .map { it.length}
            .average()
        )
}