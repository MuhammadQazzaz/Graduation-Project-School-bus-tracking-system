import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DriverLogin {



private static Map<String, String> credentials = new HashMap<>();

static {
    // Sample credentials (in a real application, these would be stored securely)
    credentials.put("john_doe", "password123");
    credentials.put("jane_smith", "securepass");
}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Driver Login");

    // Prompt for username and password
    System.out.print("Enter username: ");
    String username = scanner.nextLine();

    System.out.print("Enter password: ");
    String password = scanner.nextLine();

    // Authenticate the user
    if (authenticate(username, password)) {
        System.out.println("Login successful. Welcome, " + username + "!");
        // Proceed with the application logic for the authenticated user
    } else {
        System.out.println("Login failed. Invalid username or password.");
    }

    scanner.close();
}

private static boolean authenticate(String username, String password) {
    // Check if the provided credentials match the stored credentials
    return credentials.containsKey(username) && credentials.get(username).equals(password);
}
}
