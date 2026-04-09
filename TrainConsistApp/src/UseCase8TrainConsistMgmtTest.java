import java.util.*;
import java.util.stream.Collectors;

// Bogie class
class Bogie {
    private int bogieNumber;
    private int capacity;

    public Bogie(int bogieNumber, int capacity) {
        this.bogieNumber = bogieNumber;
        this.capacity = capacity;
    }

    public int getBogieNumber() {
        return bogieNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Bogie No: " + bogieNumber + ", Capacity: " + capacity;
    }
}

// Main logic class
class TrainConsistMgmt {

    // UC8: Filter bogies using Stream API
    public static List<Bogie> filterBogiesByCapacity(List<Bogie> bogies, int threshold) {

        // Handle null or empty input
        if (bogies == null || bogies.isEmpty()) {
            return new ArrayList<>();
        }

        // Stream filtering
        return bogies.stream()
                .filter(b -> b.getCapacity() > threshold) // strictly greater than
                .collect(Collectors.toList());
    }
}

// Test class (as per your screenshot)
class UseCase8TrainConsistMgmtTest {

    public static void main(String[] args) {

        testFilter_CapacityGreaterThanThreshold();
        testFilter_CapacityEqualToThreshold();
        testFilter_CapacityLessThanThreshold();
        testFilter_MultipleBogiesMatching();
        testFilter_NoBogiesMatching();
        testFilter_AllBogiesMatching();
        testFilter_EmptyBogieList();
        testFilter_OriginalListUnchanged();

        System.out.println("All tests executed.");
    }

    static List<Bogie> getSampleBogies() {
        return Arrays.asList(
                new Bogie(101, 50),
                new Bogie(102, 70),
                new Bogie(103, 60),
                new Bogie(104, 80)
        );
    }

    static void testFilter_CapacityGreaterThanThreshold() {
        List<Bogie> result = TrainConsistMgmt.filterBogiesByCapacity(getSampleBogies(), 60);
        assert result.size() == 2;
    }

    static void testFilter_CapacityEqualToThreshold() {
        List<Bogie> result = TrainConsistMgmt.filterBogiesByCapacity(getSampleBogies(), 60);
        for (Bogie b : result) {
            assert b.getCapacity() != 60;
        }
    }

    static void testFilter_CapacityLessThanThreshold() {
        List<Bogie> result = TrainConsistMgmt.filterBogiesByCapacity(getSampleBogies(), 100);
        assert result.isEmpty();
    }

    static void testFilter_MultipleBogiesMatching() {
        List<Bogie> result = TrainConsistMgmt.filterBogiesByCapacity(getSampleBogies(), 55);
        assert result.size() > 1;
    }

    static void testFilter_NoBogiesMatching() {
        List<Bogie> result = TrainConsistMgmt.filterBogiesByCapacity(getSampleBogies(), 100);
        assert result.size() == 0;
    }

    static void testFilter_AllBogiesMatching() {
        List<Bogie> result = TrainConsistMgmt.filterBogiesByCapacity(getSampleBogies(), 10);
        assert result.size() == getSampleBogies().size();
    }

    static void testFilter_EmptyBogieList() {
        List<Bogie> result = TrainConsistMgmt.filterBogiesByCapacity(new ArrayList<>(), 50);
        assert result.isEmpty();
    }

    static void testFilter_OriginalListUnchanged() {
        List<Bogie> original = new ArrayList<>(getSampleBogies());
        TrainConsistMgmt.filterBogiesByCapacity(original, 60);
        assert original.size() == 4; // unchanged
    }
}