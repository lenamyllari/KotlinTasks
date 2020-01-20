fun main(args : Array<String>) {
    println("Enter a string, the program will reverse it")
    var inputString = readLine()!!
    var reversedString = reverseString(inputString)
    println ("the reversed string is $reversedString")
    if (isPalindrome(inputString)){
        println("your input is a palindrome")
    }
    else {
        println("your input is not a palindrome")
    }
}

fun isPalindrome(inputString: String): Boolean {
    var reversedString = reverseString(inputString)
    if (inputString == reversedString){
        return true
    }
    return false

}