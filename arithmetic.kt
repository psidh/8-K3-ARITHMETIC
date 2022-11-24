fun main(args: Array<String>) {
    print("Enter the first number: ")
    val number1: Int =Integer.valueOf(readLine())
    print("Enter the second number: ")
    val number2: Int =Integer.valueOf(readLine())

    var result: Double

    result = (number1 + number2).toDouble()
    println("number1 + number2 = $result")

    result = (number1 - number2).toDouble()
    println("number1 - number2 = $result")

    result = (number1 * number2).toDouble()
    println("number1 * number2 = $result")

    result = (number1 / number2).toDouble()
    println("number1 / number2 = $result")

    result = (number1 % number2).toDouble()
    println("number1 % number2 = $result")
}