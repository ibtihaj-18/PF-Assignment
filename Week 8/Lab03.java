import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab03 {
    // HashMap to store Product Name (String) and Quantity (Integer)
    private static HashMap<String, Integer> inventory = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Adding initial stock
        inventory.put("Apples", 50);
        inventory.put("Bananas", 30);
        inventory.put("Oranges", 40);

        while (true) {
            System.out.println("\n--- Inventory Menu ---");
            System.out.println("1. Add Stock");
            System.out.println("2. Remove Stock");
            System.out.println("3. Check Product Level");
            System.out.println("4. Display All Products");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1: addStock(); break;
                case 2: removeStock(); break;
                case 3: checkStock(); break;
                case 4: displayAll(); break;
                case 5: System.out.println("Exiting..."); return;
                default: System.out.println("Invalid choice!");
            }
        }
    }

    // 1. Add Stock
    public static void addStock() {
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        System.out.print("Enter quantity to add: ");
        int qty = scanner.nextInt();
        
        inventory.put(name, inventory.getOrDefault(name, 0) + qty);
        System.out.println("Updated " + name + " stock.");
    }

    // 2. Remove Stock
    public static void removeStock() {
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        if (inventory.containsKey(name)) {
            System.out.print("Enter quantity to remove: ");
            int qty = scanner.nextInt();
            int currentQty = inventory.get(name);
            
            if (qty <= currentQty) {
                inventory.put(name, currentQty - qty);
                System.out.println("Removed " + qty + " from " + name);
            } else {
                System.out.println("Error: Not enough stock!");
            }
        } else {
            System.out.println("Product not found!");
        }
    }

    // 3. Check Stock Level
    public static void checkStock() {
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        if (inventory.containsKey(name)) {
            System.out.println(name + " current level: " + inventory.get(name));
        } else {
            System.out.println("Product not found!");
        }
    }

    // 4. Display All Products
    public static void displayAll() {
        System.out.println("\nCurrent Inventory:");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}