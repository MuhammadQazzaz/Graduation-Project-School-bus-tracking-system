import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BusRouteDashboard extends Application {



// Dummy data for demonstration purposes
private String busRoute = "Bus Route 123";
private String[] plannedStops = {"Stop A", "Stop B", "Stop C"};
private String[] stopTimings = {"8:00 AM", "8:30 AM", "9:00 AM"};

@Override
public void start(Stage primaryStage) {
    primaryStage.setTitle("Bus Route Dashboard");

    // Create labels to display route information
    Label routeLabel = new Label("Bus Route: " + busRoute);

    StringBuilder stopsInfo = new StringBuilder("Planned Stops:\\n");
    for (int i = 0; i < plannedStops.length; i++) {
        stopsInfo.append(plannedStops[i]).append(" - ").append(stopTimings[i]).append("\\n");
    }
    Label stopsLabel = new Label(stopsInfo.toString());

    // Create a layout to arrange the labels
    VBox layout = new VBox(10);
    layout.getChildren().addAll(routeLabel, stopsLabel);

    // Create a scene and set it on the stage
    Scene scene = new Scene(layout, 300, 200);
    primaryStage.setScene(scene);

    // Show the stage
    primaryStage.show();
}

public static void main(String[] args) {
    launch(args);
}
}
