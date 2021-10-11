fun main() {
//    Convert the daysOfWeek immutable list into a mutable one. Remove all days containing
//    the letter ‘n’, then print the mutable list. You should get this result: [Tuesday, Thursday, Friday, Saturday]

    val daysOfWeek = listOf<String>("Monday","Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");

    var mutableL = daysOfWeek.filter { !it.contains('n') }.toMutableList()
    println( mutableL )

//    Print each element of the list in a new line together with the index of the element (convert
//            the list to list with index using the withIndex() function!). You should get the following
//    result:
//    Item at 0 is Tuesday
//    Item at 1 is Thursday
//    Item at 2 is Friday
//    Item at 3 is Saturday

    mutableL.forEachIndexed { index, item -> println("Item at ${index} is ${item}") }

//    Sort the result list alphabetically! You should get the following result:
//    [Friday, Saturday, Thursday, Tuesday]

    println(mutableL.sorted())
}