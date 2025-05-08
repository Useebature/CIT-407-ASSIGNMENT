fun main() {
    print("Enter your name: ")
    val name = readLine()

    print("Enter your age: ")
    val ageInput = readLine()
    val age = ageInput?.toIntOrNull()

    if (name != null && age != null) {
        println("Hello $name, you are $age years old!")
    } else {
        println("Invalid input. Please enter a valid name and age.")
    }
}
