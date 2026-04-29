import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer to see its multiplication table: ");
        int num = scanner.nextInt();

        System.out.println("\nMultiplication Table for " + num + ":");
        System.out.println("----------------------------");

        // Loop from 1 to 10
        for (int i = 1; i <= 10; i++) {
            // Print formatted result: num x i = result
            System.out.printf("%d x %d = %d\n", num, i, (num * i));
        }

        scanner.close();
    }
}