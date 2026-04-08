import java.util.LinkedList;
import java.util.List;

/*
 * ============================================================
 * MAIN CLASS – UseCase4TrainConsistMgmt
 * ============================================================
 *
 * Use Case 4: Maintain Ordered Bogie Consist
 *
 * Description:
 * Models the physical chaining of train bogies using LinkedList.
 *
 * At this stage, the application:
 * - Adds bogies in sequence
 * - Inserts bogies at specific positions
 * - Removes bogies from front and rear
 * - Displays updated train structure
 *
 * This maps positional operations using LinkedList.
 *
 * @author Developer
 * @version 4.0
 */

public class UseCase4TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" UC4 - Maintain Ordered Bogie Consist ");
        System.out.println("=====================================\n");

        // Create LinkedList (maintains order + fast insertion)
        List<String> trainConsist = new LinkedList<>();

        // -------- ADD bogies in sequence --------
        trainConsist.add("Engine");
        trainConsist.add("Passenger1");
        trainConsist.add("Passenger2");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train:");
        System.out.println(trainConsist);

        // -------- INSERT at specific position --------
        trainConsist.add(2, "VIP");

        System.out.println("\nAfter Inserting VIP at position 2:");
        System.out.println(trainConsist);

        // -------- REMOVE from front --------
        trainConsist.remove(0);

        // -------- REMOVE from rear --------
        trainConsist.remove(trainConsist.size() - 1);

        System.out.println("\nAfter Removing Front & Rear:");
        System.out.println(trainConsist);

        System.out.println("\nProgram continues...");
    }
}