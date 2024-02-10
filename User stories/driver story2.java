import java.util.Scanner;

public class DriverProfileManager {



public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Create a default driver profile
    DriverProfile driverProfile = new DriverProfile("John Doe", "Bus Route 123", "john.doe@example.com");

    // Display the menu
    int choice;
    do {
        System.out.println("\\nDriver Profile Management");
        System.out.println("1. View Profile");
        System.out.println("2. Update Profile");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        switch (choice) {
            case 1:
                viewProfile(driverProfile);
                break;
            case 2:
                updateProfile(scanner, driverProfile);
                break;
            case 3:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    } while (choice != 3);

    scanner.close();
}

private static void viewProfile(DriverProfile driverProfile) {
    System.out.println("\\nDriver Profile:");
    System.out.println("Name: " + driverProfile.getName());
    System.out.println("Bus Route: " + driverProfile.getBusRoute());
    System.out.println("Email: " + driverProfile.getEmail());
}

private static void updateProfile(Scanner scanner, DriverProfile driverProfile) {
    System.out.println("\\nUpdate Profile:");

    System.out.print("Enter new name: ");
    String newName = scanner.nextLine();
    driverProfile.setName(newName);

    System.out.print("Enter new bus route: ");
    String newBusRoute = scanner.nextLine();
    driverProfile.setBusRoute(newBusRoute);

    System.out.print("Enter new email: ");
    String newEmail = scanner.nextLine();
    driverProfile.setEmail(newEmail);

    System.out.println("Profile updated successfully!");
}
}

class DriverProfile {
    private String name;
    private String busRoute;
    private String email;



public DriverProfile(String name, String busRoute, String email) {
    this.name = name;
    this.busRoute = busRoute;
    this.email = email;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public String getBusRoute() {
    return busRoute;
}

public void setBusRoute(String busRoute) {
    this.busRoute = busRoute;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}
}
