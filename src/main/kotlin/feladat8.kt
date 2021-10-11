import kotlin.random.Random

fun anyEvenNumber(arr: List<Int>) : Boolean{
    for (e in arr){
        if(e%2 == 0){
            return true;
        }
    }
    return false;
}

fun allEvenNumber(arr: List<Int>) : Boolean{
    for (e in arr){
        if(e%2 != 0){
            return false;
        }
    }
    return true;
}

fun main() {
//    ● Generate an array of 10 random integers between 0 and 100, and use forEach to print
//    each element of the array in a new line.
    val randomValues = (1..10).map { Random.nextInt(0,100) }
    //val testingValues = listOf<Int>(0,1,4,8)

    randomValues
        .forEach { print("$it ") }

    println()
//    ● Print the array sorted in ascending order!
    randomValues
        .sorted()
        .forEach { print("$it ")}

    println()
//    ● Check whether the array contains any even number!
    println("Array contains any even number: ${anyEvenNumber(randomValues)}")

//    ● Check whether all the numbers are even!
    println("All the numbers are even: ${allEvenNumber(randomValues)}")

//    ● Calculate the average of generated numbers and print it using forEach!
    var sum : Float = 0F;
    randomValues.forEach{
            sum += it
        }

    println("Average of generated numbers: ${sum/randomValues.size}")
}