
fun main(args: Array<String>) {
    val maxNum = 100
    approach1(maxNum)
    approach2(maxNum)
}

fun approach1(max:Int) {
    println("Approach 1:")
    for(i in 1..max) {
        if ((i % 3 == 0) && (i % 5 == 0)) {
            println("FizzBuzz")
        } else if ((i % 3 == 0)) {
            println("Fizz")
        } else if ((i % 5 == 0)) {
            println("Buzz")
        } else {
            println(i)
        }
    }
    println("------------")
}

fun approach2(max:Int) {
    println("Approach 2:")
    for(i in 1..max) {
        var printValue:String = ""

         if ((i % 3 == 0)) {
            printValue += "Fizz"
        }
        if ((i % 5 == 0)) {
             printValue += "Buzz"
        }
        if (printValue.equals("")){
            printValue += i
        }
        println(printValue)
    }
}
