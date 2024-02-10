import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Subject interface representing the entity that can be observed
interface Observable {
    void addObserver(Observer observer);



void removeObserver(Observer observer);

void notifyObservers(String message);
}

// Observer interface representing the entities interested in updates
interface Observer {
    void update(String message);
}

// Concrete implementation of Observable representing the system generating updates
class BusTrackingSystem implements Observable {
    private List<Observer> observers = new ArrayList<>();



@Override
public void addObserver(Observer observer) {
    observers.add(observer);
}

@Override
public void removeObserver(Observer observer) {
    observers.remove(observer);
}

@Override
public void notifyObservers(String message) {
    for (Observer observer : observers) {
        observer.update(message);
    }
}

// Simulates an event that triggers an alert
public void reportDeviation(String busId, String message) {
    String alertMessage = "Alert: Bus " + busId + " - " + message;
    notifyObservers(alertMessage);
}
}

// Concrete implementation of Observer representing the staff member receiving alerts
class StaffMember implements Observer {
    private String name;



public StaffMember(String name) {
    this.name = name;
}

@Override
public void update(String message) {
    System.out.println(name + " received alert: " + message);
    // Add logic to handle and edit the alert as needed
}
}

public class AlertSystemDemo {
    public static void main(String[] args) {
        // Create an instance of the BusTrackingSystem
        BusTrackingSystem busTrackingSystem = new BusTrackingSystem();



    // Create staff members who want to receive alerts
    StaffMember staff1 = new StaffMember("John");
    StaffMember staff2 = new StaffMember("Jane");

    // Add staff members as observers to the BusTrackingSystem
    busTrackingSystem.addObserver(staff1);
    busTrackingSystem.addObserver(staff2);

    // Simulate a deviation that triggers an alert
    busTrackingSystem.reportDeviation("Bus001", "Unexpected delay");

    // Simulate another update
    busTrackingSystem.reportDeviation("Bus002", "Change in route");

    // Optional: Allow staff members to unsubscribe from alerts
    // busTrackingSystem.removeObserver(staff1);

    // Optionally, you can continue simulating events and updates
}
}
