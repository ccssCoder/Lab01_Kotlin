fun encode(msg: String): String {
    return String(
            msg
            .map { it.inc() }
            .toCharArray()
        )
}

fun decode(msg: String): String {
    return String(
            msg
            .map { it.dec() }
            .toCharArray()
        )
}

fun messageCoding(msg: String, func: (String) -> String): String{
    return func(msg)
}

fun main() {
    val myMessage = "loses"
    val myEncodedMessage : String = messageCoding(myMessage, ::encode)
    println(myEncodedMessage)

    val myDecodedMessage : String = messageCoding(myEncodedMessage, ::decode)
    println(myDecodedMessage)
}