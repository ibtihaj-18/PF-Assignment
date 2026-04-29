import java.util.ArrayList;
import java.util.Arrays;

public class Lab01 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, -3, 8, -1, 12, -7, 4));

        System.out.println("Input: " + numbers);

        for (int i = numbers.size() - 1; i >= 0; i--) {
            if (numbers.get(i) < 0) {
                numbers.remove(i);
            }
        }

        System.out.println("Output: " + numbers);
    }
}