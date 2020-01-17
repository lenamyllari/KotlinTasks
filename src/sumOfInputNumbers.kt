fun main(args : Array<String>) {
    var sum :Int =0
    while (true){
        println("Enter a number, 0 stops the program")
        var inputString = readLine()!!
        var input  = inputString.toIntOrNull()
        if (input != null){
            if (input !=0){
                sum += input
            }
            else{
                break
            }
        }
        else{
            println("not a number, try again")
        }
    }
    println ("sum is $sum")
}