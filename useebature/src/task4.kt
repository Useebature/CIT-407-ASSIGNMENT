fun main() {
    // Part 1: Print numbers from 1 to 10
    println("Numbers from 1 to 10:")
    for (i in 1..10) {
        println(i)
    }

    // Part 2: Print only even numbers from 1 to 20
    println("\nEven numbers from 1 to 20:")
    for (i in 1..20) {
        if (i % 2 == 0) {
            println(i)
        }
    }
}
