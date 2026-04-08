import java.util.HashMap;
import java.util.Map;

/*
 * ============================================================
 * MAIN CLASS – UseCase6TrainConsistMgmt
 * ============================================================
 *
 * Use Case 6: Map Bogie to Capacity (HashMap)
 *
 * Description:
 * Associates each bogie with its seating or load capacity
 * using key–value mapping.
 *
 * At this stage, the application:
 * - Creates a mapping of bogie → capacity
 * - Inserts capacity values
 * - Iterates through entries
 * - Displays bogie with capacity
 *
 * This maps lookup-based access using HashMap.
 *
 * @author Developer
 * @version 6.0
 */

public class UseCase6TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" UC6 - Map Bogie to Capacity (HashMap) ");
        System.out.println("=====================================\n");

        // Create HashMap (key = bogie name, value = capacity)
        Map<String, Integer> capacityMap = new HashMap<>();

        // -------- INSERT DATA --------
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 60);
        capacityMap.put("First Class", 40);
        capacityMap.put("Cargo", 100);

        // -------- DISPLAY ALL ENTRIES --------
        System.out.println("Bogie Capacity Details:\n");

        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println(entry.getKey() + " → Capacity: " + entry.getValue());
        }

        // -------- LOOKUP EXAMPLE --------
        System.out.println("\nCapacity of Sleeper: " + capacityMap.get("Sleeper"));

        System.out.println("\nProgram continues...");
    }
}