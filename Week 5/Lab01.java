import java.util.Arrays;

public class Lab01 {

    public static int[] copy(int[] arr) {
        return Arrays.copyOf(arr, arr.length);
    }

    public static boolean equals(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] data = {5, 10, 15, 20};
        print(data);
    }
}