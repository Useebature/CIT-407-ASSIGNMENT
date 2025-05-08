fun main() {
    // Create a map with student names and their scores
    val studentScores = mapOf(
        "USMAN" to 85,
        "BATURE" to 67,
        "AHMAD" to 92,
        "MUHAMMAD" to 70,
        "Zainab" to 76
    )

    // Print students who scored above 70
    println("Students who scored above 70:")
    for ((name, score) in studentScores) {
        if (score > 70) {
            println("$name scored $score")
        }
    }
}
