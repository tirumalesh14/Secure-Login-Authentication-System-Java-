import java.util.*;
public class Main {

    public static void main(String[] args) {
        AuthService auth = new AuthService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Secure Login System ---");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            if (choice == 1) auth.register();
            else if (choice == 2) auth.login();
            else break;
        }
    }
}
