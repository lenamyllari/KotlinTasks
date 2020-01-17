fun main(args : Array<String>) {
    println("Enter a string, the program will reverse it")
    var inputString = readLine()!!
    var reversedString = reverseString(inputString)
    println ("the reversed string is $reversedString")
}

fun reverseString(inputString: String): String {
    var reversedString = ""
    if (inputString != null){
        for (x in inputString.length -1 downTo 0) {
            reversedString += inputString[x]
        }
    }
    return reversedString
}