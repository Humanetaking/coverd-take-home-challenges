package com.example.transactiongaming

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                TransactionGamingApp()
            }
        }
    }
}

@Composable
fun TransactionGamingApp() {
    // State for transactions and game results
    var transactions by remember { mutableStateOf<List<Transaction>>(emptyList()) }
    var gameResults by remember { mutableStateOf<List<GameResult>>(emptyList()) }
    
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Transaction Gaming Dashboard",
            style = MaterialTheme.typography.headlineMedium
        )
        
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // Transaction Dashboard
            Card(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
            ) {
                // Implement transaction dashboard here
                Text(
                    text = "Transaction dashboard - implement transaction list here",
                    modifier = Modifier.padding(16.dp)
                )
            }
            
            // Blackjack Game
            Card(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
            ) {
                // Implement game visualization here
                Text(
                    text = "Blackjack game - implement game visualization here",
                    modifier = Modifier.padding(16.dp)
                )
            }
        }
    }
}