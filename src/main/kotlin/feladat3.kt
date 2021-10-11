fun prime(numberToCheck: Int): Boolean{
    var flag = true
    for (i in 2..numberToCheck / 2)
    {
        if (numberToCheck % i == 0)
        {
            flag = false
            break
        }
    }
    return flag
}

fun main(){
//    Write a function that checks whether a number is prime or not.
//    Write a main function that prints prime numbers within a range.
    var lower: Int = 0
    var upper: Int = 100

    for (i in lower..upper){
        if( prime(i) ){
            println(i)
        }
    }
}