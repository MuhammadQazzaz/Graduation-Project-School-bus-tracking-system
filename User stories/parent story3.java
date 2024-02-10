import java.util.Scanner;

public class BusNotification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(Tugan.ai - Say Goodbye To Your Copywriter And Ghostwriter );



    System.out.println("Welcome to the Bus Notification System");

    System.out.print("Enter your child's name: ");
    String childName = scanner.nextLine();

    System.out.print("Enter your child's school: ");
    String schoolName = scanner.nextLine();

    System.out.print("Enter the bus number: ");
    String busNumber = scanner.nextLine();

    // Simulating child getting on the bus to school
    System.out.println("\\n" + childName + " is getting on the bus to " + schoolName + ".");
    System.out.println("Bus " + busNumber + " has arrived at the residential area.");

    // Simulating child getting on the bus from school
    System.out.println("\\n" + childName + " is getting on the bus from " + schoolName + ".");
    System.out.println("Bus " + busNumber + " has arrived at the school.");

    System.out.println("\\nYou will be notified when your child gets on the bus to and from " + schoolName + ".");
}
}
