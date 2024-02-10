import java.util.HashMap;
import java.util.Map;

public class BusManagementSystem {



public static void main(String[] args) {
    // Create a map to store bus information
    Map<String, Bus> busMap = new HashMap<>();

    // Populate bus information
    busMap.put("Bus001", new Bus("Bus001", "Route A", "Driver John"));
    busMap.put("Bus002", new Bus("Bus002", "Route B", "Driver Jane"));
    // Add more buses as needed

    // Display summarized information for each bus
    for (Bus bus : busMap.values()) {
        System.out.println(bus.getSummary());
    }
}
}

class Bus {
    private String busId;
    private String route;
    private String driver;



public Bus(String busId, String route, String driver) {
    this.busId = busId;
    this.route = route;
    this.driver = driver;
}

public String getBusId() {
    return busId;
}

public String getRoute() {
    return route;
}

public String getDriver() {
    return driver;
}

public String getSummary() {
    return "Bus ID: " + busId + "\\nRoute: " + route + "\\nDriver: " + driver + "\\n";
}
}
