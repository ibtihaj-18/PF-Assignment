import java.util.Scanner;

public class Lab03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String original = sc.nextLine();
        
        String cleanStr = original.replace(" ", "").toLowerCase();
        
        StringBuilder sb = new StringBuilder(cleanStr);
        String reversed = sb.reverse().toString();
        
        if (cleanStr.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
        
        sc.close();
    }
}