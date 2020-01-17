fun main(args : Array<String>) {
    var amountOfNumbers :Int =0
    var average :Double = 0.0
    while (true){
        println("Enter number")
        var inputString = readLine()!!
        var input  = inputString.toIntOrNull()
        if (input != null){
            if (input !=0){
                amountOfNumbers ++
                average = (average*(amountOfNumbers-1) +input) /amountOfNumbers
                println ("average is $average")
            }
            else{
                break
            }
        }
        else{
            println("not a number, try again")
        }
    }

}