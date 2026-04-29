import java.util.ArrayList;
import java.util.Arrays;

public class Lab03 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 3, 5, 7));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(2, 4, 6, 8));
        ArrayList<Integer> merged = new ArrayList<>();

        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                merged.add(list1.get(i));
                i++;
            } else {
                merged.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            merged.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            merged.add(list2.get(j));
            j++;
        }

        System.out.println("Output: " + merged);
    }
}