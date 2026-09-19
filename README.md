# decodelabs_tasks_3
# 🏦 ATM Simulation

A simple **console-based ATM Simulation built with Java**. The program allows users to check their balance, deposit money, and withdraw funds through an interactive ATM menu.

The project uses separate classes for the **bank account** and **ATM operations**, making it a good practice project for understanding Java classes, objects, encapsulation, and user input.

## ✨ Features

* 💰 Check account balance
* ➕ Deposit money
* ➖ Withdraw money
* ⚠️ Handles invalid amounts
* 🚫 Prevents withdrawals when the balance is insufficient
* 🔄 Interactive ATM menu
* ✅ Input validation
* 🔒 Uses private balance with getter methods

## 🛠️ Technologies Used

* **Java**
* `Scanner` – for user input
* Classes and Objects
* Encapsulation
* Conditional statements
* Loops

## 📂 Project Structure

```text
ATM-Simulation/
│
├── Main.java
├── ATM.java
└── BankAccount.java
```

### `Main.java`

Starts the application, creates a bank account, and connects it with the ATM.

### `BankAccount.java`

Handles the account balance along with deposit and withdrawal operations.

### `ATM.java`

Displays the ATM menu and manages user interactions.

## ▶️ How to Run

Clone the repository:

```bash
git clone https://github.com/your-username/atm-simulation.git
```

Navigate to the project folder:

```bash
cd atm-simulation
```

Compile the files:

```bash
javac Main.java ATM.java BankAccount.java
```

Run the program:

```bash
java Main
```

## 💻 Example

```text
========================
       ATM MENU
========================
1. Check Balance
2. Deposit
3. Withdraw
4. Exit

Enter your choice: 1
Current Balance: $10000.0

Enter your choice: 2
Enter deposit amount: 2000
Amount deposited successfully.
Deposited: $ 2000.0

Enter your choice: 3
Enter withdrawal amount: 1500
Withdrawal successful.
Withdrawn: $ 1500.0

Enter your choice: 4
Thank you for using the ATM.
```

## 📚 What I Learned

This project helped me understand and practice:

* Creating and using Java classes
* Objects and constructors
* Encapsulation using `private`
* Getters and methods
* User input with `Scanner`
* Loops and `switch` statements
* Input validation
* Basic banking operations

## 👨‍💻 Author

**Harshul Matia**

A beginner-friendly Java project created to practice object-oriented programming concepts.
