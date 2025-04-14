// Models.swift - Data models
struct Transaction {
    let id: String
    let userId: String
    let amount: Double
    let status: String
    // Add additional properties as needed
}

struct GameResult {
    let id: String
    let transactionId: String
    let win: Bool
    let amount: Double
    // Add additional properties as needed
}

