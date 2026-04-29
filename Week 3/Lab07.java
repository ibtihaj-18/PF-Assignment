public class Lab07 {
    public static void main(String[] args) {

        int[] arr = {14, 27, 35, 48, 56};
        int target = 35;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Found " + target + " at index " + index);
        } else {
            System.out.println("Not found");
        }
    }
}