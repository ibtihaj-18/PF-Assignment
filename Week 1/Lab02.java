import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        long number = sc.nextLong();
        
        // We use a temporary variable to keep the original number intact
        long temp = Math.abs(number); 
        long sum = 0;
        
        while (temp > 0) {
            sum += (temp % 10); // Get last digit and add to sum
            temp /= 10;         // Remove last digit
        }
        
        System.out.println("Sum of digits = " + sum);
        
        sc.close();
    }
}