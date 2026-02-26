# 🏦 Console Bank System (Java)

A simple **Console-Based Banking System** built in Java using Object-Oriented Programming (OOP) principles and File Handling.

This project allows users to create accounts, log in securely using an ID and PIN, and perform basic banking operations like deposit, withdraw, and balance checking.

---

## 🚀 Features

- ✅ Create new bank account
- ✅ Secure login using ID and PIN
- ✅ Check account balance
- ✅ Deposit money
- ✅ Withdraw money (with insufficient balance handling)
- ✅ Persistent data storage using file handling
- ✅ Automatic data loading on program start

---

## 🛠 Technologies Used

- Java
- OOP (Encapsulation, Classes, Objects)
- HashMap for user storage
- File Handling (FileWriter, Scanner)
- Console-based UI

---

## 📂 Project Structure

```
ConsoleBankSystem/
│
├── User.java          # User model class
├── Bank.java          # Banking logic & data handling
├── ConsoleBank.java   # Main program (Console UI)
├── bank_db.txt        # Database file (auto-created)
```

---

## 🧠 How It Works

### 1️⃣ User Class
- Stores user details (name, id, pin, balance)
- Handles deposit & withdrawal logic
- Converts user data to CSV format for storage

### 2️⃣ Bank Class
- Manages all users using HashMap
- Handles:
  - Registration
  - Login authentication
  - Saving data to file
  - Loading data from file

### 3️⃣ ConsoleBank (Main Class)
- Provides interactive console menu
- Allows:
  - Account creation
  - Login
  - Banking operations
  - Safe exit with data saving

---

## 💾 Data Persistence

All user data is stored in:

```
bank_db.txt
```

Data format:
```
name,id,pin,balance
```

Example:
```
Ohm,101,1234,5000.0
```

Data is automatically:
- Loaded when the program starts
- Saved when the program exits

---

## ▶️ How to Run

### Step 1: Compile

```bash
javac *.java
```

### Step 2: Run

```bash
java ConsoleBank
```

---

## 📸 Sample Menu

```
--- WELCOME TO CONSOLE BANK ---
1. Create Account
2. Login
3. Exit
```

---

## 🔒 Future Improvements

- Password encryption instead of plain PIN
- Input validation
- Transaction history
- Admin panel
- GUI version using JavaFX or Swing
- Database integration (MySQL)

---

## 🎯 Learning Objectives

This project demonstrates:

- Object-Oriented Programming
- File Handling in Java
- Basic Authentication System
- Data Persistence without Database
- Clean Console Interaction

---

## 👨‍💻 Author

Developed by [Your Name]

---

⭐ If you like this project, feel free to star the repository!