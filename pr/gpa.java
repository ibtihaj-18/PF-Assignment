import java.util.HashMap;
import java.util.Scanner; 
public class gpa {
    public static void main(String[] args) {
        HashMap<String, Double> stdGpa = new HashMap<>();
        stdGpa.put("Ahmed", 3.2);
        stdGpa.put("Ali", 1.9);
        stdGpa.put("Hamid", 2.1);
        stdGpa.put("Asfar", 1.2);
        stdGpa.put("Faraz", 2.4);
        stdGpa.put("Hadi", 3.5);
        Scanner value = new Scanner(System.in);
        System.out.println("Enter your name to Check your Result: ");
        String  name = value.nextLine();
        double getGpa = stdGpa.get(name);
        System.out.println("Your Gpa is: " + getGpa);

    }

}
