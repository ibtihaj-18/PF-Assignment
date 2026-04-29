import java.util.ArrayList;
import java.util.Arrays;

public class Lab04 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println("Input: " + list);

        int size = list.size();
        for (int i = 0; i < size / 2; i++) {
            int temp = list.get(i);
            list.set(i, list.get(size - 1 - i));
            list.set(size - 1 - i, temp);
        }

        System.out.println("Output: " + list);
    }
}