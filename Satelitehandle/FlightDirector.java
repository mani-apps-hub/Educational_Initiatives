package Satelitehandle;

import java.util.*;

public class FlightDirector {
    private Queue<MissionPlan> executionQueue = new LinkedList<>();

    
    public void schedulePlan(MissionPlan plan) {
        executionQueue.add(plan);
        System.out.printf("[SCHEDULED]: Plan from '%s' added to the mission timeline.%n", plan.getClass().getSimpleName());
    }

    
    public void executeMissionTimeline() {
        System.out.println("\n--- FLIGHT DIRECTOR: Starting Mission Command Sequence ---");
        while (!executionQueue.isEmpty()) {
            MissionPlan plan = executionQueue.poll();
            try {
                plan.execute();
            } catch (Exception e) {
                System.err.printf("FLIGHT DIRECTOR: Critical anomaly during '%s' plan: %s%n", 
                                  plan.getClass().getSimpleName(), e.getMessage());
            }
        }
        System.out.println("--- FLIGHT DIRECTOR: Mission Execution Complete ---");
    }
}
