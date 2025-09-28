package Satelitehandle;
import java.util.*;

public class Satellite {
    private String orientation = "North"; 
    private String solarPanels = "Inactive";
    private int dataCollected = 0;

    public Satellite() {
        System.out.println("\n----------------------------------------------------");
        System.out.println("Satellite Initialized and Operational.");
        printState();
        System.out.println("----------------------------------------------------");
    }

    public void rotate(String direction) {
        if (direction.equals("NORTH") || direction.equals("SOUTH") ||
            direction.equals("EAST") || direction.equals("WEST")) {
            
            String newOrientation = direction.substring(0, 1) + direction.substring(1).toLowerCase();
            
            System.out.printf("ROTATE: Changing orientation from '%s' to '%s'.%n", this.orientation, newOrientation);
            this.orientation = newOrientation;
        } else {
            System.err.printf("ERROR: Invalid rotation direction: '%s'. Orientation remains '%s'.%n", direction, this.orientation);
        }
    }

    public void activatePanels() {
        if (this.solarPanels.equals("Inactive")) {
            this.solarPanels = "Active";
            System.out.println("PANELS: Solar panels ACTIVATED. Ready to collect data.");
        } else {
            System.out.println("WARNING: Solar panels are already Active.");
        }
    }

    public void deactivatePanels() {
        if (this.solarPanels.equals("Active")) {
            this.solarPanels = "Inactive";
            System.out.println("PANELS: Solar panels DEACTIVATED.");
        } else {
            System.out.println("WARNING: Solar panels are already Inactive.");
        }
    }

    public void collectData() {
        final int DATA_INCREMENT = 10;
        if (this.solarPanels.equals("Active")) {
            this.dataCollected += DATA_INCREMENT;
            System.out.printf("DATA: Collected %d units. Total data: %d.%n", DATA_INCREMENT, this.dataCollected);
        } else {
            System.err.printf("FAILURE: Cannot collect data. Solar panels are '%s'. Must be Active.%n", this.solarPanels);
        }
    }

    // State Reporting
    public void printState() {
        System.out.println("--- Current Satellite State ---");
        System.out.printf("  Orientation:    %s%n", orientation);
        System.out.printf("  Solar Panels:   %s%n", solarPanels);
        System.out.printf("  Data Collected: %d%n", dataCollected);
        System.out.println("-------------------------------");
    }
}
