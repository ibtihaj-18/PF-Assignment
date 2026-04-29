import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            sb.append(input.charAt(i));
        }
        
        System.out.println(sb.reverse().toString());
        sc.close();
    }
}