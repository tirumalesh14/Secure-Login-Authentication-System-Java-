# 🔐 Secure Login & Authentication System (Java)

A simple yet powerful **Java-based secure authentication system** that demonstrates real-world secure coding practices such as **password hashing, input validation, login attempt limits, exception handling, and file-based user storage**.

This project is perfect for showcasing understanding of **Java fundamentals**, **OOP**, and **basic cybersecurity concepts** like hashing and secure credential handling.

---

## 🚀 Features

### ✅ **1. Secure Password Hashing (SHA-256)**
- Passwords are **never stored in plain text**.
- Uses Java’s `MessageDigest` to generate a SHA-256 hash.

### ✅ **2. Strong Password Validation**
- Password must contain:
  - At least **8 characters**
  - At least **one uppercase letter**
  - At least **one number**

### ✅ **3. Login Attempt Lockout**
- After **3 failed attempts**, the account gets **temporarily locked**.

### ✅ **4. File Handling for User Storage**
- Credentials stored in `users.txt` in this format:

