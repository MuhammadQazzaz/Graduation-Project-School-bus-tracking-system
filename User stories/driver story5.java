import java.util.ArrayList;
import java.util.List;

class RouteUpdate {
    private String message;



public RouteUpdate(String message) {
    this.message = message;
}

public String getMessage() {
    return message;
}
}

class RouteUpdateService {
    private List<Driver> drivers;



public RouteUpdateService() {
    this.drivers = new ArrayList<>();
}

public void registerDriver(Driver driver) {
    drivers.add(driver);
}

public void notifyDrivers(RouteUpdate update) {
    for (Driver driver : drivers) {
        driver.receiveRouteUpdate(update);
    }
}
}

class Driver {
    private String name;



public Driver(String name) {
    this.name = name;
}

public void receiveRouteUpdate(RouteUpdate update) {
    System.out.println("Driver " + name + " received route update: " + update.getMessage());
}
}

public class Main {
    public static void main(String[] args) {
        RouteUpdateService updateService = new RouteUpdateService();



    // Create drivers
    Driver driver1 = new Driver("John");
    Driver driver2 = new Driver("Jane");

    // Register drivers with the update service
    updateService.registerDriver(driver1);
    updateService.registerDriver(driver2);

    // Simulate a route update provided by a parent
    RouteUpdate update = new RouteUpdate("New route information: School will be reached 15 minutes later.");

    // Notify drivers about the route update
    updateService.notifyDrivers(update);
}
}
