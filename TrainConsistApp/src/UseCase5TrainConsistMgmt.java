import java.util.LinkedHashSet;
import java.util.Set;

/*
 * ============================================================
 * MAIN CLASS – UseCase5TrainConsistMgmt
 * ============================================================
 *
 * Use Case 5: Preserve Insertion Order of Bogies
 *
 * Description:
 * This class maintains the exact attachment order of bogies
 * while also preventing duplicate entries using LinkedHashSet.
 *
 * At this stage, the application:
 * - Attaches bogies in order
 * - Preserves insertion sequence
 * - Avoids duplicate bogies
 * - Displays final train formation
 *
 * This maps ordered uniqueness using LinkedHashSet.
 *
 * @author Developer
 * @version 5.0
 */

public class UseCase5TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println(" UC5 - Preserve Insertion Order of Bogies ");
        System.out.println("=========================================\n");

        // LinkedHashSet preserves order and ensures uniqueness
        Set<String> formation = new LinkedHashSet<>();

        // Add bogies in order
        formation.add("Engine");
        formation.add("Passenger1");
        formation.add("Passenger2");
        formation.add("Cargo1");
        formation.add("Guard");

        // Duplicate entries (ignored automatically)
        formation.add("Passenger1");
        formation.add("Cargo1");

        System.out.println("Final Train Formation:");
        System.out.println(formation);

        System.out.println("\nTotal Unique Bogies: " + formation.size());

        System.out.println("\nProgram continues...");
    }
}