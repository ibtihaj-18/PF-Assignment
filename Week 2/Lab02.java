import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            sb.insert(0, input.charAt(i));
        }
        
        System.out.println(sb.toString());
        sc.close();
    }
}