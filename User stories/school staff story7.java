import java.util.Scanner;

public class SchoolContactSystem {



public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome to the School Contact System");
    System.out.println("-------------------------------");

    // Simulate a staff member
    StaffMember staffMember = new StaffMember("John Doe", "IT Support");

    // Simulate the interaction with parents
    while (true) {
        System.out.println("\\nOptions:");
        System.out.println("1. Contact staff member");
        System.out.println("2. Exit");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        switch (choice) {
            case 1:
                System.out.print("Enter your message: ");
                String message = scanner.nextLine();

                // Simulate the process of contacting the staff member
                String response = staffMember.receiveMessage(message);
                System.out.println("Staff Member's Response: " + response);
                break;

            case 2:
                System.out.println("Exiting the School Contact System. Goodbye!");
                System.exit(0);

            default:
                System.out.println("Invalid choice. Please enter a valid option.");
        }
    }
}
}

class StaffMember {
    private String name;
    private String role;



public StaffMember(String name, String role) {
    this.name = name;
    this.role = role;
}

public String receiveMessage(String message) {
    return "Hello! This is " + role + " " + name + ". How can I help you? Message received: \\"" + message + "\\"";
}
}
