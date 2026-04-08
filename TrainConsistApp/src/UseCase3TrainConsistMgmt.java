import java.util.HashSet;
import java.util.Set;

/*
 * ============================================================
 * MAIN CLASS – UseCase3TrainConsistMgmt
 * ============================================================
 *
 * Use Case 3: Track Unique Bogie IDs
 *
 * Description:
 * Ensures that duplicate bogie IDs are not added using HashSet.
 *
 * At this stage, the application:
 * - Stores bogie IDs
 * - Prevents duplicates automatically
 * - Displays unique bogie identifiers
 *
 * This maps uniqueness validation using Set.
 *
 * @author Developer
 * @version 3.0
 */

public class UseCase3TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" UC3 - Track Unique Bogie IDs ");
        System.out.println("=====================================\n");

        // Create a Set to store unique bogie IDs
        Set<String> bogies = new HashSet<>();

        // -------- ADD IDs (including duplicates) --------
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");

        // Duplicate entries
        bogies.add("BG101"); // ignored
        bogies.add("BG102"); // ignored

        // -------- DISPLAY RESULTS --------
        System.out.println("Unique Bogie IDs:");
        System.out.println(bogies);

        System.out.println("\nTotal Unique Bogies: " + bogies.size());

        System.out.println("\nProgram continues...");
    }
}