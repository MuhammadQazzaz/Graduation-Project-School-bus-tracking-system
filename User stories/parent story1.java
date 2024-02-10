import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ParentAccount {
    private Map<String, String> accounts;



public ParentAccount() {
    accounts = new HashMap<>();
}

public void createAccount(String username, String password) {
    accounts.put(username, password);
    System.out.println("Account created successfully!");
}

public boolean login(String username, String password) {
    if (accounts.containsKey(username) && accounts.get(username).equals(password)) {
        System.out.println("Login successful! You can now follow up on bus movements.");
        return true;
    } else {
        System.out.println("Invalid username or password. Login failed.");
        return false;
    }
}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ParentAccount parentAccount = new ParentAccount();

    System.out.println("Welcome to the Parent Account Creation and Login System");

    System.out.print("Enter a username: ");
    String username = scanner.nextLine();

    System.out.print("Enter a password: ");
    String password = scanner.nextLine();

    parentAccount.createAccount(username, password);

    System.out.println("\\n--- Login ---");
    System.out.print("Enter your username: ");
    String loginUsername = scanner.nextLine();

    System.out.print("Enter your password: ");
    String loginPassword = scanner.nextLine();

    parentAccount.login(loginUsername, loginPassword);
}
}
