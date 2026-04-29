import java.io.*;

class Product {
    String name;
    double price;
    int stock;

    Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
}

public class Lab01 {
    public static void main(String[] args) {
        Product[] products = {
            new Product("Laptop", 1200, 15),
            new Product("Mouse", 25, 50),
            new Product("Keyboard", 75, 30)
        };

        writeCSV(products, "products.csv");
        writeJSON(products, "products.json");
        
        System.out.println("Success! Check your Week 7 folder.");
    }

    public static void writeCSV(Product[] products, String fileName) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {
            pw.println("Product,Price,Stock");
            for (Product p : products) {
                pw.println(p.name + "," + p.price + "," + p.stock);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void writeJSON(Product[] products, String fileName) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {
            pw.println("[");
            for (int i = 0; i < products.length; i++) {
                Product p = products[i];
                pw.println("  {");
                pw.println("    \"Product\": \"" + p.name + "\",");
                pw.println("    \"Price\": " + p.price + ",");
                pw.println("    \"Stock\": " + p.stock);
                if (i < products.length - 1) pw.println("  },");
                else pw.println("  }");
            }
            pw.println("]");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}