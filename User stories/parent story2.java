import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BusNotification {
    private List<String> residentialAreas;



public BusNotification() {
    residentialAreas = new ArrayList<>();
}

public void addResidentialArea(String residentialArea) {
    residentialAreas.add(residentialArea);
}

public void removeResidentialArea(String residentialArea) {
    residentialAreas.remove(residentialArea);
}

public void notifyBus(String residentialArea) {
    if (residentialAreas.contains(residentialArea)) {
        System.out.println("Bus has been notified that your child will not be going to school.");
    } else {
        System.out.println("This residential area is not registered for bus notifications.");
    }
}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    BusNotification busNotification = new BusNotification();

    System.out.println("Welcome to the Bus Notification System");

    System.out.print("Enter your residential area: ");
    String residentialArea = scanner.nextLine();

    busNotification.addResidentialArea(residentialArea);

    System.out.println("\\n--- Bus Notification ---");
    System.out.print("Enter your residential area to notify the bus: ");
    String notifyArea = scanner.nextLine();

    busNotification.notifyBus(notifyArea);
}
}
