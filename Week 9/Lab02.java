import java.util.ArrayList;
import java.util.Arrays;

public class Lab02 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 5, 3, 6, 1));
        ArrayList<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                if (numbers.get(i).equals(numbers.get(j))) {
                    if (!duplicates.contains(numbers.get(i))) {
                        duplicates.add(numbers.get(i));
                    }
                }
            }
        }

        System.out.println("Duplicates: " + duplicates);
    }
}