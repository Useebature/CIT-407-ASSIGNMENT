// Base class
open class Person(val name: String, val age: Int) {
    open fun displayDetails() {
        println("Name: $name")
        println("Age: $age")
    }
}

// Subclass
class Student(name: String, age: Int, val grade: String) : Person(name, age) {
    override fun displayDetails() {
        super.displayDetails()
        println("Grade: $grade")
    }
}

fun main() {
    val student1 = Student("BATURE", 21, "A")
    val student2 = Student("AHMAD", 19, "B")

    student1.displayDetails()
    println()
    student2.displayDetails()
}
