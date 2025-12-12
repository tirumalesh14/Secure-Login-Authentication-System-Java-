import java.security.MessageDigest;
import java.util.Scanner;

public class AuthService {
    
    private int loginAttempts = 0;

    // Register User
    public void register() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter strong password: ");
        String password = sc.nextLine();

        if (!isStrongPassword(password)) {
            System.out.println("Weak password! Must contain uppercase, numbers, and 8+ chars.");
            return;
        }

        String hashed = hashPassword(password);
        FileManager.saveUser(new User(username, hashed));
        System.out.println("User Registered Successfully!");
    }

    // Login User
    public void login() {
        Scanner sc = new Scanner(System.in);

        if (loginAttempts >= 3) {
            System.out.println("Account Locked due to multiple failed attempts.");
            return;
        }

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        String storedHash = FileManager.getUserHash(username);

        if (storedHash != null && storedHash.equals(hashPassword(password))) {
            System.out.println("Login Successful. Welcome " + username + "!");
            loginAttempts = 0;
        } else {
            loginAttempts++;
            System.out.println("Invalid Credentials! Attempt: " + loginAttempts);
        }
    }

    // Password Strength Check
    private boolean isStrongPassword(String pwd) {
        return pwd.length() >= 8 &&
               pwd.matches(".*[A-Z].*") &&
               pwd.matches(".*[0-9].*");
    }

    // SHA-256 Hashing
    private String hashPassword(String pwd) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(pwd.getBytes());

            StringBuilder hex = new StringBuilder();
            for (byte b : hash) hex.append(String.format("%02x", b));

            return hex.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
