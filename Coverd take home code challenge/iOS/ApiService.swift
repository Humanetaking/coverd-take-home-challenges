import Foundation

class APIService {
    private let baseURL = "http://localhost:3001/api"
    
    func fetchTransactions(completion: @escaping ([Transaction]?, Error?) -> Void) {
        // Implement API call to fetch transactions
    }
    
    func fetchGameResults(completion: @escaping ([GameResult]?, Error?) -> Void) {
        // Implement API call to fetch game results
    }
}
