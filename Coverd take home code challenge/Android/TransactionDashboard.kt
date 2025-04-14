// TransactionDashboard.kt
package com.example.transactiongaming.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.transactiongaming.data.Transaction

@Composable
fun TransactionDashboard(transactions: List<Transaction>) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        if (transactions.isEmpty()) {
            Text(
                text = "Transaction dashboard component - implement transaction list here",
                color = Color.Gray,
                textAlign = TextAlign.Center
            )
        } else {
            // Implement transaction list display here
            // This will be implemented by the candidate
        }
    }
}