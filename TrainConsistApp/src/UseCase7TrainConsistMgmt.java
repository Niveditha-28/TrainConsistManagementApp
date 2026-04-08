import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * ============================================================
 * MAIN CLASS – UseCase7TrainConsistMgmt
 * ============================================================
 *
 * Use Case 7: Sort Bogies by Capacity (Comparator)
 *
 * Description:
 * Sorts passenger bogies based on seating capacity using
 * custom Comparator logic.
 *
 * This maps custom ordering using Comparator.
 *
 * @author Developer
 * @version 7.0
 */

public class UseCase7TrainConsistMgmt {

    // Inner class to represent Bogie
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " (" + capacity + ")";
        }
    }

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" UC7 - Sort Bogies by Capacity ");
        System.out.println("=====================================\n");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("General", 90));

        // Display unsorted list
        System.out.println("Before Sorting:");
        System.out.println(bogies);

        // -------- SORT using Comparator --------
        Collections.sort(bogies, new Comparator<Bogie>() {
            @Override
            public int compare(Bogie b1, Bogie b2) {
                return b2.capacity - b1.capacity; // descending order
            }
        });

        // Display sorted list
        System.out.println("\nAfter Sorting (by capacity - descending):");
        System.out.println(bogies);

        System.out.println("\nProgram continues...");
    }
}