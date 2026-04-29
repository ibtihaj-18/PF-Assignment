import java.util.HashMap;
import java.util.Map;

public class Lab01 {
    public static void main(String[] args) {
        // Your Input Array
        int[] numbers = {1, 2, 3, 2, 4, 5, 3, 3, 6, 1};

        // Create the HashMap
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        // Loop through the array
        for (int num : numbers) {
            if (freqMap.containsKey(num)) {
                // If it exists, increment the count
                freqMap.put(num, freqMap.get(num) + 1);
            } else {
                // If it's new, set count to 1
                freqMap.put(num, 1);
            }
        }

        // Print the Output
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " times");
        }
    }
}