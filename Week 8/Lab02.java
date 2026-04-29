import java.util.HashMap;
import java.util.Map;

public class Lab02 {
    public static void main(String[] args) {
        String input = "the cat and the dog and the bird";
        
        // 1. Split the sentence into an array of words
        String[] words = input.split(" ");
        
        // 2. Create the HashMap (String for the word, Integer for the count)
        HashMap<String, Integer> wordMap = new HashMap<>();

        // 3. Logic to count frequencies
        for (String word : words) {
            if (wordMap.containsKey(word)) {
                wordMap.put(word, wordMap.get(word) + 1);
            } else {
                wordMap.put(word, 1);
            }
        }

        // 4. Print results
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}