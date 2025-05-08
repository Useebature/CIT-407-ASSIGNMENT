fun main() {
    // Lambda expression to multiply two integers
    val multiply: (Int, Int) -> Int = { a, b -> a * b }

    // Call the lambda with sample values
    val result = multiply(4, 5)

    // Print the result
    println("The product of 4 and 5 is: $result")
}
