// TransactionTableView.swift
import UIKit

class TransactionTableView: UITableView {
    
    private var transactions: [Transaction] = []
    
    override init(frame: CGRect, style: UITableView.Style) {
        super.init(frame: frame, style: style)
        setupTableView()
    }
    
    required init?(coder: NSCoder) {
        super.init(coder: coder)
        setupTableView()
    }
    
    private func setupTableView() {
        backgroundColor = .systemBackground
        
        // Add placeholder when empty
        let placeholderLabel = UILabel()
        placeholderLabel.text = "Transaction dashboard component - implement transaction list here"
        placeholderLabel.textColor = .gray
        placeholderLabel.textAlignment = .center
        placeholderLabel.numberOfLines = 0
        
        backgroundView = placeholderLabel
        
        // Setup table view configuration
        register(UITableViewCell.self, forCellReuseIdentifier: "TransactionCell")
    }
    
    func configure(with transactions: [Transaction]) {
        self.transactions = transactions
        reloadData()
        
        // Hide placeholder when there are transactions
        backgroundView = transactions.isEmpty ? backgroundView : nil
    }
}

// Add a simple data source extension to use with this view
extension TransactionTableView: UITableViewDataSource {
    func tableView(_ tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
        return transactions.count
    }
    
    func tableView(_ tableView: UITableView, cellForRowAt indexPath: IndexPath) -> UITableViewCell {
        let cell = tableView.dequeueReusableCell(withIdentifier: "TransactionCell", for: indexPath)
        
        // Configure cell with transaction data
        // This will be implemented by the candidate
        
        return cell
    }
}