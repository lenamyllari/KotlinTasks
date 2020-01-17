fun main(args : Array<String>) {
    var weight :Double =0.0
    var height :Double = 0.0
    var bmi :Double = 0.0
    while (true){
        println("Enter your weight in kg")
        var weightString = readLine()!!
        try {
            weight = weightString.toDouble()
            //println("weight is $weight")
            println("Enter your height in cm")
            var heightString = readLine()!!
            height = (heightString.toDouble()) / 100
            //println("height is $height")
            if (height != 0.0) {
                bmi = weight / (height * height)
                println ("bmi is $bmi")
                break
            } else {
                println("Can't divide by zero")
            }
        }
        catch (e: NumberFormatException){
            println("not a number, try again")
        }
    }
}