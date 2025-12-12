import java.io.*;
import java.util.*;

public class FileManager {

    private static final String FILE = "users.txt";

    // Save new user
    public static void saveUser(User user) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE, true))) {
            bw.write(user.username + ":" + user.hashedPassword);
            bw.newLine();
        } catch (Exception e) {
            System.out.println("Error saving user!");
        }
    }

    // Retrieve hashed password
    public static String getUserHash(String username) {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts[0].equals(username)) return parts[1];
            }
        } catch (Exception e) {
            System.out.println("Error reading user file!");
        }

        return null;
    }
}
