import java.util.ArrayList;
import java.util.List;

/*
 * ============================================================
 * MAIN CLASS – UseCase2TrainConsistMgmt
 * ============================================================
 *
 * Use Case 2: Add Passenger Bogies to Train
 *
 * Description:
 * Demonstrates how passenger bogies can be managed dynamically
 * using ArrayList operations.
 *
 * At this stage, the application:
 * - Adds new bogies
 * - Removes existing bogies
 * - Checks for bogie existence
 * - Displays final train consist
 *
 * This maps CRUD operations using ArrayList.
 *
 * @author Developer
 * @version 2.0
 */

public class UseCase2TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" UC2 - Add Passenger Bogies to Train ");
        System.out.println("=====================================\n");

        // Create ArrayList to hold bogies
        List<String> passengerBogies = new ArrayList<>();

        // ---------------- CREATE (Add bogies) ----------------
        passengerBogies.add("B1");
        passengerBogies.add("B2");
        passengerBogies.add("B3");

        System.out.println("After Adding Bogies:");
        System.out.println(passengerBogies);

        // ---------------- DELETE (Remove bogie) ----------------
        passengerBogies.remove("B2");

        System.out.println("\nAfter Removing B2:");
        System.out.println(passengerBogies);

        // ---------------- READ (Check existence) ----------------
        if (passengerBogies.contains("B1")) {
            System.out.println("\nB1 exists in the train.");
        } else {
            System.out.println("\nB1 does not exist.");
        }

        // ---------------- FINAL STATE ----------------
        System.out.println("\nFinal Train Consist:");
        System.out.println(passengerBogies);

        System.out.println("\nProgram continues...");
    }
}