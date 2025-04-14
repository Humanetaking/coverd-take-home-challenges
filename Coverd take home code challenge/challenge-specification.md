# Full-Stack Credit Transaction Gaming Challenge

## Background

Our company integrates with third-party payment processors to access credit card transaction data, which we then use to power interactive gaming experiences. Users can "bet" against transaction amounts by playing games like roulette, blackjack, and slots.

## Challenge Overview

Create a full-stack application that simulates our core business functionality:

1. A backend service that processes concurrent credit card transactions
2. A game engine that determines outcomes based on transaction amounts
3. A frontend interface to visualize transactions and game results

This challenge is designed to test your ability to handle concurrent operations safely, integrate with external services, design proper data models, and create clean code.

## Technical Requirements

### Backend

1. **Transaction Processor Service**
   - Create a service that simulates receiving transactions from multiple sources
   - Implement a thread pool to process transactions concurrently
   - Handle proper synchronization of shared resources
   - Implement basic error handling and retry logic

2. **Game Engine**
   - Implement a simplified blackjack game engine
   - Use transaction amounts to determine game outcomes
   - Process game results concurrently with transaction processing

3. **Database**
   - Design and implement a database schema for:
     - Users
     - Transactions
     - Game results
     - Account balances
   - Ensure proper transaction isolation for concurrent updates

### Frontend

1. **Transaction Dashboard**
   - Display a feed of processed transactions
   - Show success/failure status
   - Implement proper error handling and loading states

2. **Game Visualization**
   - Create an interface to display blackjack games
   - Show how transaction amounts affect game outcomes

## What We're Looking For

1. **Clean, maintainable code**
   - Proper abstractions and separation of concerns
   - Clear documentation
   - Consistent style and naming conventions

2. **Concurrency handling**
   - Proper thread synchronization
   - No race conditions or deadlocks
   - Efficient resource usage

3. **Error handling**
   - Graceful degradation under failure
   - Proper logging
   - Recovery mechanisms

## Submission Guidelines

1. Provide the codebase in a private GitHub repository
2. (Optional) Include a README with:
   - Setup instructions
   - Architecture overview
   - Design decisions and trade-offs
   - Areas for future improvement

## Time Expectation

We expect this challenge to take approximately 2-3 hours. We value quality over completeness, so focus on demonstrating your strengths rather than implementing every feature. This is meant to test your skills, please don't rely too much on AI.

## Technical Stack

You may use any of the following technologies:

**Backend:**
- Any language you prefer (We provided template for Java, Python and JS)

**Frontend (Choose one):**
- Web: React, Vue, or Angular
- iOS: Swift with UIKit or SwiftUI
- Android: Kotlin with Jetpack Compose

**Database:**
- in memory map is sufficient