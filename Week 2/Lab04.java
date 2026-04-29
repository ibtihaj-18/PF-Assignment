import java.util.Scanner;

public class Lab04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int number;

        do {
            number = sc.nextInt();
            sum += number;
        } while (number != 0);

        System.out.println("Total sum: " + sum);
        sc.close();
    }
}