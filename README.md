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

### ✅ **5. Clean OOP Structure**
The project follows a modular design:


---

## 📁 Project Structure

SecureLogin/
│
├── Main.java
├── User.java
├── AuthService.java
├── FileManager.java
└── users.txt

---

## 🖥 How It Works

### 🔸 **Registration Flow**
1. User enters username
2. Enters password
3. Password is validated
4. Password is hashed using SHA-256
5. User is saved to `users.txt`

### 🔸 **Login Flow**
1. Username is checked in file
2. Entered password is hashed and compared
3. If matched → Login successful  
4. If wrong → Attempt count increases  
5. After 3 failures → Login locked

---

## 🧠 Concepts Demonstrated

- **Java OOP**
- **SHA-256 password hashing**
- **Input validation**
- **Exception handling**
- **File handling (BufferedReader / BufferedWriter)**
- **Secure coding basics**
- **Program flow control**

Perfect for interview discussions related to **Java Developer**, **Backend Developer**, or **Cybersecurity Software Engineer** roles.

---

## ▶️ How to Run

### Step 1 — Compile

### Step 2 — Run

---

## 📌 Sample Output

--- Secure Login System ---

Register

Login

Exit
Choose option:

---

## 🔒 Why This Project Is Secure

- No plain-text passwords stored
- Strong password enforcement
- Login attempt restriction
- Separation of concerns via modular design
- Simple, auditable file-based storage

---

## 🌟 Future Enhancements (Optional)
You can extend the project by adding:

- Salting + Peppering for hashing
- JSON or database-based storage
- User roles (Admin/User)
- OTP-based login
- GUI using JavaFX or Swing

---

## 🤝 Contributing
Pull requests are welcome! If you'd like to add new features or improve security, feel free to contribute.

---

## 📜 License
This project is open-source and available under the **MIT License**.

---

## 👨‍💻 Author
**Tirumalesh Reddy**  
Java Developer | AI Enthusiast | Data Analyst


