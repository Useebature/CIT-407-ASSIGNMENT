// Define the Car class
class Car(val brand: String, val model: String, val year: Int) {

    // Function to display car details
    fun displayDetails() {
        println("Car Details: $brand $model, Year: $year")
    }
}

fun main() {
    // Create car objects
    val car1 = Car("Toyota", "Corolla", 2020)
    val car2 = Car("Honda", "Civic", 2022)

    // Display their details
    car1.displayDetails()
    car2.displayDetails()
}
