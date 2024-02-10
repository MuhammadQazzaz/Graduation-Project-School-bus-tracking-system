import java.util.Scanner;

public class BusTrackingSystem {



// Dummy staff credentials for demonstration purposes
private static final String DUMMY_USERNAME = "staff";
private static final String DUMMY_PASSWORD = "password";

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome to the Bus Tracking System");

    // User login
    System.out.print("Enter your username: ");
    String username = scanner.nextLine();

    System.out.print("Enter your password: ");
    String password = scanner.nextLine();

    // Check if the entered credentials are valid
    if (login(username, password)) {
        System.out.println("Login successful! You can now monitor the bus tracking and receive updates.");
        // Implement bus tracking and update monitoring logic here
    } else {
        System.out.println("Invalid username or password. Please try again.");
    }

    scanner.close();
}

// Dummy login method for demonstration purposes
private static boolean login(String username, String password) {
    return DUMMY_USERNAME.equals(username) && DUMMY_PASSWORD.equals(password);
}
}
