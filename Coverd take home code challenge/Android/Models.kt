data class Transaction(
    val id: String,
    val userId: String,
    val amount: Double,
    val status: String
    // Add additional properties as needed
)

data class GameResult(
    val id: String,
    val transactionId: String,
    val win: Boolean,
    val amount: Double
    // Add additional properties as needed
)
