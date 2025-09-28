package Satelitehandle;

import java.util.*;

public class MissionControlDemo {

    public static void main(String[] args) {
        Satellite satellite = new Satellite();
        FlightDirector flightDirector = new FlightDirector();
        Scanner scanner = new Scanner(System.in);

        displayInstructions();
        
        while (true) {
            System.out.print("\nFLIGHT DIRECTOR > ");
            String input = scanner.nextLine().trim();
            
            if (input.equalsIgnoreCase("QUIT") || input.equalsIgnoreCase("EXIT")) {
                System.out.println("Closing Mission Control. Goodbye.");
                break;
            }

            if (input.equalsIgnoreCase("HELP")) {
                displayInstructions();
                continue;
            }

            if (input.equalsIgnoreCase("STATUS")) {
                satellite.printState();
                continue;
            }

            MissionPlan plan = parseCommand(input, satellite);
            
            if (plan != null) {
                System.out.println("[EXECUTING]");
                plan.execute();
            } else if (!input.isEmpty()) {
                System.err.println("INVALID COMMAND: Type 'HELP' for a list of valid commands.");
            }
        }

        scanner.close();
        System.out.println("\nSATELLITE HEALTH REPORT (Final State):");
        satellite.printState();
    }

   
    private static MissionPlan parseCommand(String input, Satellite satellite) {
        String[] parts = input.toUpperCase().split("\\s+");
        if (parts.length == 0) {
            return null;
        }

        String command = parts[0];

        switch (command) {
            case "ROTATE":
                if (parts.length == 2) {
                    String direction = parts[1];
                    if (direction.equals("NORTH") || direction.equals("SOUTH") ||
                        direction.equals("EAST") || direction.equals("WEST")) {
                        return new AttitudeController(satellite, direction);
                    }
                }
                System.err.println("Error: ROTATE requires a valid direction (NORTH, SOUTH, EAST, WEST).");
                return null;
                
            case "ACTIVATE":
                return new PowerSystemsEngineer(satellite, true);

            case "DEACTIVATE":
                return new PowerSystemsEngineer(satellite, false);
                
            case "COLLECT":
                return new PayloadSpecialist(satellite);

            default:
                return null; 
        }
    }
    
    
    private static void displayInstructions() {
        System.out.println("\n----------------------------------------------------");
        System.out.println("         MISSION CONTROL COMMAND INTERFACE          ");
        System.out.println("----------------------------------------------------");
        System.out.println("Available Commands (Case-Insensitive):");
        System.out.println("  1. ROTATE [DIRECTION]  -> e.g., ROTATE NORTH");
        System.out.println("     Directions: NORTH, SOUTH, EAST, WEST");
        System.out.println("  2. ACTIVATE            -> Activates Solar Panels");
        System.out.println("  3. DEACTIVATE          -> Deactivates Solar Panels");
        System.out.println("  4. COLLECT             -> Collects Data (Requires Active Panels)");
        System.out.println("  5. STATUS              -> Print current satellite state");
        System.out.println("  6. HELP                -> Display this help message");
        System.out.println("  7. QUIT / EXIT         -> Terminate the program");
        System.out.println("----------------------------------------------------");
    }
}
